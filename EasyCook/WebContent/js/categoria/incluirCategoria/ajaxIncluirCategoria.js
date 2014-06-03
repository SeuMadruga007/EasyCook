$(document).ready(function(){
	$('#btnIncluirIngrediente').click(function(){
		var nome = $('#txtNome').val();
			if(nome==null||nome==''){
				alert('Favor inserir um nome ao ingrediente.');
			}else{
				$.ajax({url:'incluirIngrediente',data:({
					 ingrediente:nome}),
					 type:"POST",
						success:function(dados){
								if(dados=='sucesso'){
									alert('Ingrediente cadastradado com sucesso!');
									$('#txtNome').val('');
								}else if(dados=='existe'){
									alert('Já existe uma Ingrediente com esse Nome.');
								}else
									alert('Erro ao cadastrar Ingrediente!');
						}
				}); 
			}		
		});
		
});