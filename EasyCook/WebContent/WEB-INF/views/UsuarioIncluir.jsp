<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Easy Cook - Usuario Incluir</title>
<c:import url="importAdminFiles.jsp" />
<!-- <script  src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script> -->
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>


<script type="text/javascript">
function teste(){
	 $.ajax({url:'inserirUsuario',data:({
		    nome:$('#txtNome').val(),
			//login:$('#txtLogin').val(),
			senha:$('#txtSenha').val(),
			email:$('#txtEmail').val(),
			telefone:$('#txtTelefone').val(),
			tipoUsuario:$('input[type="radio"]:checked').val(),
			idUsuario:$('#idUsuario').val(),
			btnAcionado:$('#btnIncluirUsuario').val()}),type:"POST",
			success:function(dados){
					if(dados='sucesso'){
						alert('Usuario incluído com sucesso!');
						zerarCampos();
					}else
						alert('Erro ao inserir Usuario!');
			}
	 }); 

	  function zerarCampos(){
			$('#txtNome').val('');
			//$('#txtLogin').val('');
			$('#txtSenha').val('');
			$('#txtEmail').val('');
			$('#txtEmailPesquisa').val('');
			$('#txtTelefone').val('');
			$($('input[type="radio"]:checked')).attr("checked",false);
			$('#btnIncluirUsuario').val('');
		}
	
} 
</script>


</head>
<body>

<input type="hidden" id='idUsuario'/>
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
						<i class="fa fa-user"></i> Incluir Usu&aacute;rio
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
						<h4>Tipo de acesso:</h4>
						<div class="checkbox">
							<label> <input class="uniform" type="radio"
								id="radioAdministrador" name="optionsRadios" value="1">
								Administrador
							</label>
						</div>
						<!-- /.checkbox -->

						<div class="checkbox">
							<label> <input class="uniform" type="radio"
								id="radioPrivilegiado" name="optionsRadios" value="2">
								Privilegiado
							</label>
						</div>
						<!-- /.checkbox -->
						<br>
						<div class="form-group">
							<label for="txtNome" class="control-label col-lg-1">Nome</label>
							<div class="col-lg-8">
								<input type="text" id="txtNome" 
									placeholder="Insira o nome aqui" class="form-control">
							</div>
						</div>
						<!-- /.form-group -->
						<br> <br>
						<div class="form-group">
							<label for="txtEmail" class="control-label col-lg-1">E-mail</label>
							<div class="col-lg-8">
								<input type="text" id="txtEmail"
									placeholder="Insira o e-mail aqui" class="form-control">
							</div>
						</div>
						<!-- /.form-group -->
						<br> <br>
						<div class="form-group">
							<label for="txtSenha" class="control-label col-lg-1">Senha</label>
							<div class="col-lg-8">
								<input type="text" id="txtSenha"
									placeholder="Insira a senha aqui" class="form-control">
							</div>
						</div>
						<!-- /.form-group -->
						<br> <br>
						 <div class="form-group">
                        <label class="control-label col-lg-1">Celular</label>
                        <div class="col-lg-5">
                          <div class="input-group">
                            <input class="form-control" type="text" id='txtTelefone' data-mask="(999) 99999-9999">
                            <span class="input-group-addon">(999) 99999-9999</span> 
                          </div>
                        </div>
                        <br>
                        <br>
                        <br>
                        <br>
                        <button type="button" id="btnIncluirUsuario"  value="btnIncluirUsuario" onclick="teste()"  class="btn btn-primary">Salvar</button>
                      </div>
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
</body>
</html>