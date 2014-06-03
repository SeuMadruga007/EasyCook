<!DOCTYPE html>
<html lang="en">
  <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<link href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script type="text/javascript">
var categorias; 
var idCategorias;

function pesquisarCategoria(){
 	$.ajax({url:'pesquisarCategoria',
		 type:"POST",
			success:function(dados){
				var arrayCategoria = dados.split(";");
				var unidade='';
				categorias = new Array();
				idCategorias = new Array();
				
				for(var i =0;i<arrayCategoria.length;i++){
					if(arrayCategoria[i]=='null'){
						arrayCategoria[i]='';
					}
					
					unidade = arrayCategoria[i].split('(#)');
					categorias.push(unidade[1]);
					idCategorias.push(unidade[0]);
				}
					 $( "#listCategoria" ).autocomplete({source: categorias});
	        	dados.remove();
			}
	}); 
	 

}

function getCategoria(){
	var nome = $('#listCategoria').val();
	$('#txtNome').val(nome);
}

	function alterarCategoria(){
		
		var categoria = $('#listCategoria').val();
		var categoriaSelecionada=null;
		var idCategoriaSelecionada=null;
		
		for(var i =0;i<idCategorias.length;i++){
			if(categorias[i]==categoria){
				categoriaSelecionada=categorias[i];
				idCategoriaSelecionada=idCategorias[i];
			}
		}
		
		
		var nomeAlterado = $('#txtNome').val(); 
		
		if(nomeAlterado==null||nomeAlterado==''){
			alert('Favor inserir um novo nome à Categoria.');
			
		}else if(nomeAlterado==categoria){
			alert('Nome da Categoria à ser alterada é igual a selecionada, favor escolher outro nome.');
			
		}else{
			$.ajax({url:'alterarCategoria',data:({
				categoria:nomeAlterado,id:idCategoriaSelecionada}),
				 type:"POST",
					success:function(dados){
							if(dados=='sucesso'){
								alert('Categoria alterada com sucesso!');
								$('#txtNome').val('');
								$('#listCategoria').val('');
								pesquisarCategoria();
							}else if(dados=='existe'){
								alert('Já existe uma Categoria com esse Nome.');
							}else
								alert('Erro ao alterar nome da Categoria!');
					}
			}); 
		}		
	}
	
</script>

</head>
  <body onload="pesquisarCategoria()">
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
               <i class="fa fa-tags"></i> Alterar/ Consultar Categoria </h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->

      <c:import url="importAdminMenuLateral.jsp" />


      <div id="content">
        <div class="outer">
          <div class="inner">
            <div class="col-lg-12">
              <div class="form-group">
              <br><br>
                   <div class="form-group">
                        <label class="control-label col-lg-1">Categoria </label>
                        <div class="col-lg-4">
                          <input data-placeholder="Selecione a categoria..."  onblur="getCategoria()" name='listCategoria'  id='listCategoria' tabindex="2"/>
                        </div>
                      </div>		
				<br><br>
				<div class="form-group">
							<label for="nome" class="control-label col-lg-1">Editar categoria</label>
							<div class="col-lg-8">
								<input type="text" id="txtNome"
									placeholder="Insira o nome aqui" class="form-control">
							</div>
				</div>
                <br><br> <button type="button" id='btnAlterarCategoria' value='btnAlterarCategoria' onclick="alterarCategoria()"class="btn btn-primary">Alterar</button>
                <br><br> <br><br> <br><br> <br><br> <br><br><br><br> <br><br> <br><br> <br><br> <br><br>
                
                <br><br>
            </div>
          </div>
          <!-- end .inner -->
        </div>
        <!-- end .outer -->
      </div>
      </div>
      <!-- end #content -->
    </div><!-- /#wrap -->
    <div id="footer">
      <p>Easy Cook Admin</p>
    </div>
    <script src="dist/assets/lib/jquery.min.js"></script>
    <script src="dist/assets/lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script src="dist/assets/lib/uniform/jquery.uniform.min.js"></script>
    <script src="dist/assets/lib/inputlimiter/jquery.inputlimiter.1.3.1.min.js"></script>
    <script src="dist/assets/lib/chosen/chosen.jquery.min.js"></script>
    <script src="dist/assets/lib/colorpicker/js/bootstrap-colorpicker.js"></script>
    <script src="dist/assets/lib/tagsinput/jquery.tagsinput.min.js"></script>
    <script src="dist/assets/lib/validVal/src/js/jquery.validVal.min.js"></script>
    <script src="dist/assets/lib/daterangepicker/daterangepicker.js"></script>
    <script src="dist/assets/lib/daterangepicker/moment.min.js"></script>
    <script src="dist/assets/lib/datepicker/js/bootstrap-datepicker.js"></script>
    <script src="dist/assets/lib/timepicker/js/bootstrap-timepicker.min.js"></script>
    <script src="dist/assets/lib/switch/build/js/bootstrap-switch.min.js"></script>
    <script src="dist/assets/lib/jquery.dualListbox-1.3/jquery.dualListBox-1.3.min.js"></script>
    <script src="dist/assets/lib/autosize/jquery.autosize.min.js"></script>
    <script src="dist/assets/lib/jasny/js/jasny-bootstrap.min.js"></script>
    <script src="dist/assets/js/main.min.js"></script>
    <script>
      $(function() {
        formGeneral();
      });
    </script>
  </body>
</html>