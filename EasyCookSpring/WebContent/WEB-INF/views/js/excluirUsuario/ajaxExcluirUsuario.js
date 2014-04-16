$(document).ready(function() {     
//var $ = $.noConflict();
	$('#btnExcluirUsuario').click(function(){
		$.post('../UsuarioServlet',{
			emailPesquisa:$('#txtEmailPesquisa').val(),btnAcionado:$('#btnExcluirUsuario').val()
		},function(dados){
			if(dados=='sucesso'){
				alert('Usuário excluído com sucesso!');
			}else{
				alert('Impossível excluir usuário!');
			}
			$('#txtEmailPesquisa').val('');
		});
	});
	
	
	function zerarCampos(){
		$('#txtNome').val('');
		//$('#txtLogin').val('');
		//$('#txtSenha').val('');
		$('#txtEmail').val('');
		$('#txtEmailPesquisa').val('');
		$('#txtTelefone').val('');
		$($('input[type="radio"]:checked')).attr("checked",false);
		$('#btnIncluirUsuario').val('');
	}
	
			
});