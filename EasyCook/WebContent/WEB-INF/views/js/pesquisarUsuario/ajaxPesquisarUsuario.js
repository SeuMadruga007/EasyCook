$(document).ready(function() {     
//var $ = $.noConflict();
	$('#btnPesquisarUsuario').click(
	        function(){
	        	$.post('../UsuarioServlet',
					{
	        		emailPesquisa:$('#txtEmailPesquisa').val(),btnAcionado:$('#btnPesquisarUsuario').val(),tipoPesquisa:$('input[name="radioSelect"]:checked').val()
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
	
	
	$('select').change(
	        function(){
	        	
	        	$.post('../UsuarioServlet',
					{
	        		emailPesquisaGetUsuario:$('select option:selected').val(),btnAcionado:'GetUsuario'
					},function(dados){
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
	       			}
				);	
	        
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