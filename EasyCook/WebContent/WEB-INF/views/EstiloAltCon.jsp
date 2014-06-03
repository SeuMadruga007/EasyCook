<!DOCTYPE html>
<html lang="en">
  <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - EstiloVida Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<link href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  
<script type="text/javascript">
var EstiloVidas; 
var idEstiloVidas;

function pesquisarEstiloVida(){
 	$.ajax({url:'pesquisarEstiloVida',
		 type:"POST",
			success:function(dados){
				var arrayEstiloVida = dados.split(";");
				var unidade='';
				EstiloVidas = new Array();
				idEstiloVidas = new Array();
				
				for(var i =0;i<arrayEstiloVida.length;i++){
					if(arrayEstiloVida[i]=='null'){
						arrayEstiloVida[i]='';
					}
					
					unidade = arrayEstiloVida[i].split('(#)');
					EstiloVidas.push(unidade[1]);
					idEstiloVidas.push(unidade[0]);
				}
					 $( "#listEstiloVida" ).autocomplete({source: EstiloVidas});
	        	dados.remove();
			}
	}); 
	 

}

function getEstiloVida(){
	var nome = $('#listEstiloVida').val();
	$('#txtNome').val(nome);
}

	function alterarEstiloVida(){
		
		var EstiloVida = $('#listEstiloVida').val();
		var EstiloVidaSelecionada=null;
		var idEstiloVidaSelecionada=null;
		
		for(var i =0;i<idEstiloVidas.length;i++){
			if(EstiloVidas[i]==EstiloVida){
				EstiloVidaSelecionada=EstiloVidas[i];
				idEstiloVidaSelecionada=idEstiloVidas[i];
			}
		}
		
		
		var nomeAlterado = $('#txtNome').val(); 
		
		if(nomeAlterado==null||nomeAlterado==''){
			alert('Favor inserir um novo nome à EstiloVida.');
			
		}else if(nomeAlterado==EstiloVida){
			alert('Nome da EstiloVida à ser alterada é igual a selecionada, favor escolher outro nome.');
			
		}else{
			$.ajax({url:'alterarEstiloVida',data:({
				EstiloVida:nomeAlterado,id:idEstiloVidaSelecionada}),
				 type:"POST",
					success:function(dados){
							if(dados=='sucesso'){
								alert('EstiloVida alterada com sucesso!');
								$('#txtNome').val('');
								$('#listEstiloVida').val('');
								pesquisarEstiloVida();
							}else if(dados=='existe'){
								alert('Já existe uma EstiloVida com esse Nome.');
							}else
								alert('Erro ao alterar nome da EstiloVida!');
					}
			}); 
		}		
	}
	
</script>

</head>
  <body onload="pesquisarEstiloVida()">
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
               <i class="fa fa-tags"></i> Alterar/ Consultar Estilo de Vida </h3>
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
                        <label class="control-label col-lg-1">Estilo de Vida </label>
                        <div class="col-lg-4">
                          <input data-placeholder="Selecione a EstiloVida..."  onblur="getEstiloVida()" name='listEstiloVida'  id='listEstiloVida' tabindex="2"/>
                        </div>
                      </div>		
				<br><br>
				<div class="form-group">
							<label for="nome" class="control-label col-lg-1">Editar Estilo de Vida</label>
							<div class="col-lg-8">
								<input type="text" id="txtNome"
									placeholder="Insira o nome aqui" class="form-control">
							</div>
				</div>
                <br><br> <button type="button" id='btnAlterarEstiloVida' value='btnAlterarEstiloVida' onclick="alterarEstiloVida()"class="btn btn-primary">Alterar</button>
                <br><br> <br><br> <br><br> <br><br> <!-- <br><br><br><br> <br><br> <br><br> <br><br> <br><br> -->
                
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