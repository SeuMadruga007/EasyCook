<!DOCTYPE html>
<html lang="en">
    <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
	
	function incluirEstiloVida(){
		var nome = $('#txtNome').val();
		
		if(nome==null||nome==''){
			alert('Favor inserir um nome para o Estilo de Vida.');
		}else{
			$.ajax({url:'incluirEstiloVida',data:({
				 estiloVida:nome}),
				 type:"POST",
					success:function(dados){
							if(dados=='sucesso'){
								alert('Estilo de Vida cadastrado com sucesso!');
								$('#txtNome').val('');
							}else if(dados=='existe'){
								alert('J� existe um Estilo de Vida com esse Nome.');
							}else
								alert('Erro ao cadastrar Estilo de Vida!');
					}
			}); 
			
		}		
		
	}

	
</script>

</head>
  <body>
    <div id="wrap">
      <div id="top">

         <c:import url="importAdminNav.jsp" />

        <!-- header.head -->
        <header class="head">
          <div class="search-bar">
            <a data-original-title="Show/Hide Menu" data-placement="bottom" data-tooltip="tooltip" class="accordion-toggle btn btn-primary btn-sm visible-xs" data-toggle="collapse" href="#menu" id="menu-toggle">
              <i class="fa fa-expand"></i>
            </a> 
            <form class="main-search">
              
            </form>
          </div>

          <!-- ."main-bar -->
          <div class="main-bar">
            <h3>
               <i class="fa fa-arrows-alt"></i> Incluir Estilo de vida </h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->
      <c:import url="importAdminMenuLateral.jsp" />
      <div id="content">
        <div class="outer">
          <div class="inner">
            <div class="col-lg-12">
            <br><br>
              <div class="form-group">
				<label for="nome" class="control-label col-lg-1">Estilo de vida</label>
				<div class="col-lg-7">
					<input type="text" id="txtNome"
						placeholder="Insira o estilo de vida aqui" class="form-control col-lg-5">
				</div><br><br><br><br>
				 <button type="button" id='btnEstiloVida'value='btnEstiloVida' onClick="incluirEstiloVida()" class="btn btn-primary">Salvar</button>
			  </div>
            </div>
          </div>
          <!-- end .inner -->
        </div>
        <!-- end .outer -->
      </div>
      <!-- end #content -->
    </div><!-- /#wrap -->
    <div id="footer">
      <p>Easy Cook Admin</p>
    </div>
    <script src="dist/assets/lib/jquery.min.js"></script>
    <script src="dist/assets/lib/bootstrap/js/bootstrap.min.js"></script>
    
    <script src="dist/assets/js/main.min.js"></script>
  </body>
</html>