<!DOCTYPE html>
<html lang="en">
    <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
function pesquisarUsuario(){
	$.ajax({url:'pesquisarUsuario',
		data:{emailPesquisa:$('#txtEmailPesquisa').val()},
		type:"POST",
		success:function(dados){
			if(dados!=null){
				//var pagina = $(location).attr('pathname').split("/");
				
				//if(pagina[3]=='UsuarioAltCon.jsp'){
	        		$('select[name="listEmail"] option').remove();
	        	//}else
	        	//	$('select[name="listUsuario"] option').remove();
				
				var arrayEmail = dados.split(";");
				var option = '';
				for(var i =0;i<arrayEmail.length;i++){
					if(arrayEmail[i]=='null'){
						result[i]='';
					}
				}
				$.each(arrayEmail, function(key, value){
			          option += '<option id='+value+' >'+value+'</option>';
			      });
				
	        	//if(pagina[3]=='UsuarioAltCon.jsp'){
	        		$('select[name="listEmail"]').append(option);
	        	//}else
	        	//	$('select[name="listUsuario"]').append(option);
	        	
				dados.remove();
			}else{
				alert('Nenhum Usuario com esse Email!');
			}
			
		
	}});
} 


function alterarUsuario(){
	$.ajax({url:'alterarUsuario',data:{
		nome:$('#txtNome').val(),
		//login:$('#txtLogin').val(),
		senha:$('#txtSenha').val(),
		email:$('#txtEmail').val(),
		telefone:$('#txtTelefone').val(),
		tipoUsuario:$('input[type="radio"]:checked').val(),
		idUsuario:$('#idUsuario').val()},
		type:"POST",
		success:function(dados){
			if(dados=='sucesso'){
				zerarCampos();
				alert('Usuário alterado com Sucesso!');
			}else{
				alert('Erro ao alterar Usuário!');
			}
	}});
	
}


function pesquisarUnicoUsuario(){
	$.ajax({url:'pesquisarUnicoUsuario',
		data:{emailPesquisaGetUsuario:$('select option:selected').val()},
		type:"POST",
		success:function(dados){
				if(dados!=null){
					//$('select[name="listEmail"] option').remove();
					var arrayUsuario = dados.split(";");
					for(var i =0;i<arrayUsuario.length;i++){
						if(arrayUsuario[i]=='null'){
							arrayUsuario[i]='';
						}
					}
					
					$('#idUsuario').val(arrayUsuario[0]);
					$('#txtNome').val(arrayUsuario[1]);
					$('#txtEmail').val(arrayUsuario[2]);
				//	$('#txtLogin').val(arrayUsuario[2]);
					$('#txtSenha').val(arrayUsuario[3]);
					$('#txtTelefone').val(arrayUsuario[4]);
					
						//Não está funcionando corretamente
					if(arrayUsuario[5]=='1'){
						//$("#rbtnPrivilegiado").attr('checked',false);
						$("#rbtnAdm").attr('checked',true);
						
					}else{
						//$("#rbtnAdm").attr('checked',false);
						$("#rbtnPrivilegiado").attr('checked',true);
				
					}
				}else{
					alert('Nenhum Usuario com esse Email!');
				}
		
	}});
} 
function zerarCampos(){
	$('#txtNome').val('');
	//$('#txtLogin').val('');
	$('#txtSenha').val('');
	$('#txtEmail').val('');
	$('#txtEmailPesquisa').val('');
	$('#txtTelefone').val('');
	$($('input[type="radio"]:checked')).attr("checked",false);
	$('select[name="listEmail"] option').remove();
}
</script>

</head>
  <body>
<input type="Hidden" id='idUsuario'/>
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
               <i class="fa fa-user"></i> Usu&aacute;rio Alterar/Consultar </h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->
      <c:import url="importAdminMenuLateral.jsp" />
		<div id="content">
			<div class="outer">
          <div class="inner">
          <div class="col-lg-12">
            <div class="control-group">
							<h4>Busca por e-mail ou nome do usuário</h4>
							<div class="controls">
								<div class="col-lg-8">
									<input type="text" id="txtEmailPesquisa"
										placeholder="Insira o email aqui" class="form-control">
								</div>
								<button style="margin-left: 5px;" type="submit" id='btnPesquisaEmail' value='btnPesquisaEmail' onclick="pesquisarUsuario()"
									class="btn btn-primary inline">Buscar</button>
							</div>
						</div>
<br><br>
			<h4>Selecione usuário para editar</h4>
			<select id="box1View" name='listEmail' onchange="pesquisarUnicoUsuario()" multiple="multiple" class="form-control" size="12">
            </select>

<br> <br> <br> <br>
<h4>Tipo de acesso:</h4>
            <div class="checkbox">
              <label> <input class="uniform" type="radio"
                id="rbtnAdm" name="optionsRadios" value="1">
                Administrador
              </label>
            </div>
            <!-- /.checkbox -->

            <div class="checkbox">
              <label> <input class="uniform" type="radio"
                id="rbtnPrivilegiado" name="optionsRadios" value="2">
                Privilegiado
              </label>
            </div>
            <!-- /.checkbox -->
            <br>
            <div class="form-group">
              <label for="nome" class="control-label col-lg-1">Nome</label>
              <div class="col-lg-8">
                <input type="text" id="txtNome"
                  placeholder="Insira seu nome aqui" class="form-control">
              </div>
            </div>
            <!-- /.form-group -->
            <br> <br>
            <div class="form-group">
              <label for="text2" class="control-label col-lg-1">E-mail</label>
              <div class="col-lg-8">
                <input type="text" id="txtEmail"
                  placeholder="Insira seu e-mail aqui" class="form-control">
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
                            <input class="form-control" id='txtTelefone' type="text" data-mask="(999) 99999-9999">
                            <span class="input-group-addon">(999) 99999-9999</span> 
                          </div>
                        </div>
                        <br>
                        <br>
                        <br>
                        <br>
                        <button type="button" id='btnAlterarUsuario' value='btnAlterarUsuario' onCLick="alterarUsuario()" class="btn btn-primary">Salvar</button>

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
    
    <script src="dist/assets/js/main.min.js"></script>
  </body>
</html>