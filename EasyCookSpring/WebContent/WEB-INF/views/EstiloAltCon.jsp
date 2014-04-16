<!DOCTYPE html>
<html lang="en">
  <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">

function pesquisarEstiloVida(){
	$.ajax({url:'pesquisarEstiloVida',
		 type:"POST",
			success:function(dados){
				var arrayEstiloVida = dados.split(";");
				var option = '';
				var unidade='';
				
				for(var i =0;i<arrayEstiloVida.length;i++){
					if(arrayEstiloVida[i]=='null'){
						arrayEstiloVida[i]='';
					}
					
					unidade = arrayEstiloVida[i].split('(#)');
					 option += '<option id='+unidade[0]+' >'+unidade[1]+'</option>';
				}
				$('select[name="listEstiloVida"]').html(option);
	        	dados.remove();
			}
	}); 

	
}

function getEstiloVida(){
	var nome = $('select option:selected').val();
	$('#txtNome').val(nome);
}

	function alterarEstiloVida(){
		var nome = $('select option:selected').val();
		var id = $('select option:selected').attr("id");
		var nomeAlterado = $('#txtNome').val(); 
		
		if(nomeAlterado==null||nomeAlterado==''){
			alert('Favor inserir um novo nome para o Estilo de Vida.');
			
		}else if(nomeAlterado==nome){
			alert('Nome do estilo de vida à ser alterado é igual ao selecionado, favor escolher outro nome.');
			
		}else{
			$.ajax({url:'alterarEstiloVida',data:({
				 estiloVida:nomeAlterado,id:id}),
				 type:"POST",
					success:function(dados){
							if(dados=='sucesso'){
								alert('Estilo de Vida alterado com sucesso!');
								$('#txtNome').val('');
								pesquisarEstiloVida();
							}else if(dados=='existe'){
								alert('Já existe um Estilo de Vida com esse Nome.');
							}else
								alert('Erro ao alterar nome do Estilo de Vida!');
					}
			}); 
		}		
	}
	
</script>
</head>
<body onLoad="pesquisarEstiloVida()">

	<div id="wrap">
		<div id="top">

			 <c:import url="importAdminNav.jsp" />

			<!-- header.head -->
			<header class="head">
				<div class="search-bar">
					<a data-original-title="Show/Hide Menu" data-placement="bottom"
						data-tooltip="tooltip"
						class="accordion-toggle btn btn-primary btn-sm visible-xs"
						data-toggle="collapse" href="#menu" id="menu-toggle"> <i
						class="fa fa-expand"></i>
					</a>
					<form class="main-search"></form>
				</div>

				<!-- ."main-bar -->
				<div class="main-bar">
					<h3>
						<i class="fa fa-angle-right"></i> Alterar/Consultar Estilo de vida
					</h3>
				</div>
				<!-- /.main-bar -->
			</header>

			<!-- end header.head -->
		</div>
		<!-- /#top -->
		
		<c:import url="importAdminMenuLateral.jsp" />
		
		  <div id="content">
        <div class="outer">
          <div class="inner">
            <div class="col-lg-12">
              <div class="form-group">
              <br><br>
                   <div class="form-group">
                        <label class="control-label col-lg-1">Estilo de vida</label>
                        <div class="col-lg-4">
                        <!--  class="form-control chzn-select"-->
                          <select data-placeholder="Selecione o ingrediente..." name="listEstiloVida" id="listEstiloVida" onChange="getEstiloVida()" tabindex="2">
                            
                          </select>
                        </div>
                      </div>		
				<br><br><br><br><br><br>
				<div class="form-group">
							<label for="nome" class="control-label col-lg-1">Editar Estilo de vida</label>
							<div class="col-lg-8">
								<input type="text" id="txtNome"
									placeholder="Insira o nome aqui" class="form-control">
							</div>
				</div>
                <br><br> <button type="button" id='btnAlterarEstiloVida' value='btnAlterarEstiloVida' onClick="alterarEstiloVida()" class="btn btn-primary">Alterar</button>
                <br><br> <br><br> <br><br> <br><br> <br><br><br><br> <br><br> <br><br> <br><br> <br><br>
                
                <br><br>
            </div>
          </div>
          <!-- end .inner -->
        </div>
        <!-- end .outer -->
      </div>
      <!-- end #content -->
    </div>
		<!-- /#wrap -->
		<div id="footer">
			<p>Easy Cook Admin</p>
		</div>

		<script src="dist/assets/lib/jquery.min.js"></script>
		<script src="dist/assets/lib/bootstrap/js/bootstrap.min.js"></script>

		<script src="dist/assets/js/main.min.js"></script>
</body>
</html>