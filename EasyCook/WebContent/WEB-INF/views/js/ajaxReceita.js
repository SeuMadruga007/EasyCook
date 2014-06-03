//var jq = JQuery.noConflict();
$(document).ready(function() {      

	//Combo Categoria
	$(function(){
		$.post('../../ReceitaServlet',function(dados){
			var array = dados.split(";");
			var option = '';
			$.each(array, function(key, value){
	              option += '<option>'+value+'</option>'; //Vai populando a combo
	          });
			
			$('#cmbCategoria').append(option);
			dados.remove();
		});
	});
	
	
	//Combo Porções
	$(function(){
		var porcao='';		
			for(var i = 1; i < 50;i++){
				porcao += '<option>'+i+'</option>'; //Vai populando a combo
	          }
			
			$('#cmbPorcao').append(porcao);
	});
	
	$('select[name=cmbCategoria]').on('change',function(){
		
	});
	


	
   

		//Combo Categoria
		$(function(){
			$.post('../../ReceitaServlet',{cmbBoxIngrediente:'cmbBoxIngrediente'},function(data){
				var arrayCategoria= data.split(";");
				var categoria = '';
				$.each(arrayCategoria, function(key, value){
					categoria += '<option>'+value+'</option>'; //Vai populando a combo
		          });
				
				$('#cmbBoxIngrediente').append(categoria);
			});
		});
	
	
	
});

