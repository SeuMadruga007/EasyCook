$(document).ready(function() {     
//var $ = $.noConflict();
	$('#btnAlterarUsuario').click(function(){
			$.post('../UsuarioServlet',{
				nome:$('#txtNome').val(),
				//login:$('#txtLogin').val(),
				senha:$('#txtSenha').val(),
				email:$('#txtEmail').val(),
				telefone:$('#txtTelefone').val(),
				tipoUsuario:$('input[type="radio"]:checked').val(),
				idUsuario:$('#idUsuario').val(),
				btnAcionado:$('#btnAlterarUsuario').val()
			},function(dados){
				if(dados=='sucesso'){
					zerarCampos();
					alert('Usu�rio alterado com Sucesso!');
				}else{
					alert('Erro ao alterar Usu�rio!');
				}
			});
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
});