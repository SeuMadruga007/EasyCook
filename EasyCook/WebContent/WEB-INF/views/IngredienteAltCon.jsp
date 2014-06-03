<!DOCTYPE html>
<html lang="en">
    <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Ingrediente Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<link href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script type="text/javascript">
var ingredientes; 
var idIngredientes;

function pesquisarIngrediente(){
 	$.ajax({url:'pesquisarIngrediente',
		 type:"POST",
			success:function(dados){
				var arrayIngrediente = dados.split(";");
				var unidade='';
				ingredientes = new Array();
				idIngredientes = new Array();
				
				for(var i =0;i<arrayIngrediente.length;i++){
					if(arrayIngrediente[i]=='null'){
						arrayIngrediente[i]='';
					}
					
					unidade = arrayIngrediente[i].split('(#)');
					ingredientes.push(unidade[1]);
					idIngredientes.push(unidade[0]);
				}
					 $( "#listIngrediente" ).autocomplete({source: ingredientes});
	        	dados.remove();
			}
	}); 
	 

}

	function getIngrediente(){
		var nome = $('#listIngrediente').val();
		$('#txtNome').val(nome);
	}

	function alterarIngrediente(){
		
		var ingrediente = $('#listIngrediente').val();
		var ingredienteSelecionada=null;
		var idIngredienteSelecionado=null;
		
		for(var i =0;i<idIngredientes.length;i++){
			if(ingredientes[i]==ingrediente){
				ingredienteSelecionada=ingredientes[i];
				idIngredienteSelecionado=idIngredientes[i];
			}
		}
		var nomeAlterado = $('#txtNome').val(); 
		
		if(nomeAlterado==null||nomeAlterado==''){
			alert('Favor inserir um novo nome à Ingrediente.');
			
		}else if(nomeAlterado==ingrediente){
			alert('Nome da ingrediente à ser alterada é igual a selecionada, favor escolher outro nome.');
			
		}else{
			$.ajax({url:'alterarIngrediente',data:({
				ingrediente:nomeAlterado,id:idIngredienteSelecionado}),
				 type:"POST",
					success:function(dados){
							if(dados=='sucesso'){
								alert('Ingrediente alterada com sucesso!');
								$('#txtNome').val('');
								$('#listIngrediente').val('');
								pesquisarIngrediente();
							}else if(dados=='existe'){
								alert('Já existe uma ingrediente com esse Nome.');
							}else
								alert('Erro ao alterar nome da ingrediente!');
					}
			}); 
		}		
	}
	
</script>


</head>
  <body onload="pesquisarIngrediente()">
    <div id="wrap">
      <div id="top">

        <c:import url="importAdminNav.jsp" />
          <div class="collapse navbar-collapse navbar-ex1-collapse">
          </div>

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
               <i class="fa fa-coffee"></i> Alterar/ Consultar Ingrediente </h3>
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
                        <label class="control-label col-lg-1">Ingrediente</label>
                        <div class="col-lg-4">
                          <input data-placeholder="Selecione o ingrediente..." name="listIngrediente" id="listIngrediente"  onblur="getIngrediente()" tabindex="2"/>
                         
                        </div>
                      </div>		
				<br><br>
				<div class="form-group">
							<label for="nome" class="control-label col-lg-1">Editar ingrediente</label>
							<div class="col-lg-8">
								<input type="text" id="txtNome"
									placeholder="Insira o nome aqui" class="form-control">
							</div>
				</div>
                <br><br> <button type="button" id='btnAlterarIngrediente' value="btnAlterarIngrediente" onClick="alterarIngrediente()" class="btn btn-primary">alterar</button>
                <br><br> <br><br> <br><br> <br><br> <br><br><br><br> <br><br> <br><br> <br><br> <br><br>
                
                <br><br>
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