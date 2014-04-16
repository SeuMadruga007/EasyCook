<!DOCTYPE html>
<html lang="en">
  <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook - Usuario Excluir</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
function excluirUsuario(){
	 $.ajax({url:'excluirUsuario',data:({
		 emailPesquisa:$('select option:selected').val()}),
		 type:"POST",
			success:function(dados){
					if(dados='sucesso'){
						alert('Usuario excluído com sucesso!');
						pesquisaUsuario();
					}else
						alert('Erro ao excluir Usuario!');
			}
	 }); 

	 
}
	function pesquisaUsuario(){
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
	
	
	
	
	
		 
	
	
	
</script>
</head>
  <body>
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
               <i class="fa fa-user"></i> Excluir Usu&aacute;rio </h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->
      
      <c:import url="importAdminMenuLateral.jsp" />
      
      <div id="content">
        <div class="outer">
          <div class="inner">
					
						<!-- Search input-->
						<div class="control-group">
							<h4>Busca por e-mail ou nome do usuário</h4>
							<div class="controls">
								<div class="col-lg-8">
									<input type="text" id="txtEmailPesquisa"
										placeholder="Insira o email aqui" class="form-control">
								</div>
								<button style="margin-left: 5px;" type="button" id='btnPesquisarUsuario' value='btnPesquisarUsuario'onClick="pesquisaUsuario()"
									class="btn btn-primary inline">Buscar</button>
							</div>
						</div>
					

					<br><br>
			<h4>Selecione usuário para excluir</h4>
			<select id="box1View" name="listEmail" multiple="multiple" class="form-control" size="12">
                          </select>
			<br><br>
			 <button type="button" id='btnExcluirUsuario' value='btnExcluirUsuario' onClick="excluirUsuario()" class="btn btn-primary">Excluir</button>
			 <br><br>
		</div>
          </div>
          <!-- end .inner -->
        </div>
        <!-- end .outer -->
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