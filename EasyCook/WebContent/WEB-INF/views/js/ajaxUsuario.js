$(document).ready(function() {     
//var $ = $.noConflict();
	
	$('#btnPesquisarUsuario').click(
	        function(){
	        	$.post('UsuarioServlet',
					{
	        		emailPesquisa:$('#txtEmailPesquisa').val(),btnAcionado:$('#btnPesquisarUsuario').val()
					},function(dados){
						if(dados!=null){
							$('select[name="listEmail"] option').remove();
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
							
							$('select[name="listEmail"]').append(option);
							dados.remove();
						
							
						}else{
							alert('Nenhum Usuario com esse Email!');
						}
	       			}
				);	
	        
	        });
	
	
	$('select[name="listEmail"] option').click(
	        function(){
	        	$.post('UsuarioServlet',
					{
	        		emailPesquisa:$('select[name="listEmail"] option').val()
					},function(dados){
						if(dados!=null){
							
							$('select[name="listEmail"] option').remove();
							var arrayUsuario = dados.split(";");
							for(var i =0;i<arrayUsuario.length;i++){
								if(arrayUsuario[i]=='null'){
									result[i]='';
								}
							}
							
							$('#txtNome').val(result[0]);
							$('#txtEmail').val(result[1]);
						//	$('#txtLogin').val(result[2]);
							$('#txtSenha').val(result[2]);
							$('#txtTelefone').val(result[3]);
							$('#idUsuario').val(result[4]);
							
							alert(result[5]);
							
								//Não está funcionando corretamente
							if(result[5]==1){
								//$("#rbtnPrivilegiado").attr('checked',false);
								$("#rbtnAdm").attr('checked',true);
								
							}else{
								//$("#rbtnAdm").attr('checked',false);
								$("#rbtnPrivilegiado").attr('checked',true);
							}
						}else{
							alert('Nenhum Usuario com esse Email!');
						}
	       			}
				);	
	        
	        });
	
	
	
	
	//back up - Funcionando
	/*$('#btnPesquisarUsuario').click(
        function(){
        	$.post('../UsuarioServlet',
				{
        		emailPesquisa:$('#txtEmailPesquisa').val(),btnAcionado:$('#btnPesquisarUsuario').val()
				},function(dados){
					if(dados!=null){
						var result = dados.split(";");
						for(var i =0;i<result.length;i++){
							if(result[i]=='null'){
								result[i]='';
							}
						}
						$('#txtNome').val(result[0]);
						$('#txtEmail').val(result[1]);
					//	$('#txtLogin').val(result[2]);
					//	$('#txtSenha').val(result[3]);
						$('#txtTelefone').val(result[2]);
						$('#idUsuario').val(result[3]);
						$('#rbtnAdm').val(result[4]);
						
						alert(result[4]);
						
							//Não está funcionando corretamente
						if(result[4]==1){
							//$("#rbtnPrivilegiado").attr('checked',false);
							$("#rbtnAdm").attr('checked',true);
							
						}else{
							//$("#rbtnAdm").attr('checked',false);
							$("#rbtnPrivilegiado").attr('checked',true);
						}
					}else{
						alert('Nenhum Usuario com esse Email!');
					}
       			}
			);	
       	}	 
        );
*/
	
	$('#btnIncluirUsuario').click(function(){
		$.post('../UsuarioServlet',{
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
				alert('Usuário cadastrado com Sucesso!');
			}else{
				alert('Erro ao cadastrar Usuário!');
			}
			
		});
	});
			
	
	$('#btnAlterarUsuario').click(function(){
		$.post('../UsuarioServlet',{
			nome:$('#txtNome').val(),
			login:$('#txtLogin').val(),
			senha:$('#txtSenha').val(),
			email:$('#txtEmail').val(),
			telefone:$('#txtTelefone').val(),
			tipoUsuario:$('input[type="radio"]:checked').val(),
			idUsuario:$('#idUsuario').val(),
			btnAcionado:$('#btnAlterarUsuario').val()
		},function(dados){
			alert(dados);
			
			if(dados=='sucesso'){
				zerarCampos();
				alert('Usuário alterado com Sucesso!');
			}else{
				alert('Erro ao alterar Usuário!');
			}
		});
	});
	
	
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