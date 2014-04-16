<!DOCTYPE html>
<html lang="en">
    <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
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
               <i class="fa fa-cutlery"></i> Excluir Receita </h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->
      
      <c:import url="importAdminMenuLateral.jsp" />
      
      <div id="content">
        <div class="outer">
          <div class="inner">
            <div class="col-lg-12">
			<!-- Search input-->
			<div class="control-group">
				<h4>Busca por nome da receita</h4>
				<div class="controls">
					<input id="searchinput" name="searchinput" type="text"
						placeholder="" class="input-xlarge search-query"> <button style="margin-left:5px; "type="submit" class="btn btn-primary inline">Buscar</button>					
				</div>
			</div>
			
			<br><br>
			<h4>Selecione uma receita para excluir</h4>
			<select id="box1View" multiple="multiple" class="form-control" size="12">
                            <option value="501649">ESSAS OPCOES VIRAO DO BANCO FUTURAMENTE</option>
                            <option value="501649">Farinha</option>
                            <option value="501497">Ovo</option>
                            <option value="501053">Atum</option>
                            <option value="500001">Brigadeiro</option>
                            <option value="501227">Queijo</option>
                            
                          </select>
			<br><br>
			 <button type="submit" class="btn btn-primary">Salvar</button>
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