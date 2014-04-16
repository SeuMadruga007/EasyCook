//var jq = JQuery.noConflict();
$(document).ready(function() {      
		//Combo Categoria
		$('#btnInserirIngrediente').click(function(dados){
			$.post('../../IngredienteServlet',{ingrediente:$('#txtIngrediente').val(),btnAcao:'btnInserirIngrediente'},
				function(dados){
				
					if(dados=='sucesso'){
						alert('Ingrediente inserido com sucesso!');
					}else{
						alert('Erro ao inserir Ingrediente!');
					}
					
				});
		});
		
		
		$('#btnExcluirIngrediente').click(function(dados){
			$.post('../../IngredienteServlet',{ingrediente:$('#txtIngrediente').val(),btnAcao:'btnExcluirIngrediente'},
				function(dados){
				
					if(dados=='sucesso'){
						alert('Ingrediente Excluído com sucesso!');
					}else{
						alert('Erro ao Excluir Ingrediente!');
					}
					
				});
		});
		
		
		
		$('#btnAlterarIngrediente').click(function(dados){
			$.post('../../IngredienteServlet',{ingrediente:$('#txtIngrediente').val(),btnAcao:'btnAlterarIngrediente'},
				function(dados){
					if(dados=='sucesso'){
						alert('Ingrediente alterado com sucesso!');
					}else{
						alert('Erro ao alterar Ingrediente!');
					}
					
				});
		});
		
		$('#btnPesquisarIngrediente').click(
		        function(){
		        	$.post('../../IngredienteServlet',
						{
		        		ingrediente:$('#txtIngrediente').val(),btnAcao:$('#btnPesquisarIngrediente').val()
						},function(dados){
							if(dados!=null){
								var result = dados.split(";");
								
								for(var i =0;i<result.length;i++){
									if(result[i]=='null'){
										result[i]='';
									}
								}
								$('#txtIngrediente').val(result[0]);
								$('#idIngrediente').val(result[1]);
								
							}else{
								alert('Nenhum Ingrediente com esse Nome!');
							}
		       			}
					);	
		 });
		
		
		
		
});

