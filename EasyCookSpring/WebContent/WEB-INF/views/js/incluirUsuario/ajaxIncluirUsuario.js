$(document).ready(function() {     
//var $ = $.noConflict();
	function teste(){
		$('#btnIncluirUsuario').click(function(){
			
			alert('teste');
		});
		
	}
	
	$('#btnIncluirUsuario').click(function(){
		alert('passou');
		/*$.post('/UsuarioServlet',{
			nome:$('#txtNome').val(),
			//login:$('#txtLogin').val(),
			senha:$('#txtSenha').val(),
			email:$('#txtEmail').val(),
			telefone:$('#txtTelefone').val(),
			tipoUsuario:$('input[type="radio"]:checked').val(),
			idUsuario:$('#idUsuario').val(),
			btnAcionado:$('#btnIncluirUsuario').val()
		},function(dados){
			alert(dados);
			
			if(dados=='sucesso'){
				zerarCampos();
				alert('Usu�rio cadastrado com Sucesso!');
			}else{
				alert('Erro ao cadastrar Usu�rio!');
			}
			
		});*/
	});
	
	
	function zerarCampos(){
		$('#txtNome').val('');
		/*//$('#txtLogin').val('');
		//$('#txtSenha').val('');
		$('#txtEmail').val('');
		$('#txtEmailPesquisa').val('');
		$('#txtTelefone').val('');
		$($('input[type="radio"]:checked')).attr("checked",false);
		$('#btnIncluirUsuario').val('');*/
	}
			
});