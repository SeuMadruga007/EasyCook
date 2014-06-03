<!DOCTYPE html>
<html lang="en">

<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook - Admin</title>
<c:import url="importAdminFiles.jsp" />
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">

//Esconde as opções de usuário se  ele for privilegiado
$(document).ready(function(){
	 if($('#tipoUsuario').val()=='2'){
			$('#UlUsuario').hide();
		}
	
	 //seta o tipo do usuario e o nome na aba lateral esquerda
	 $('#idNomeUsuario').html('<c:choose> <c:when test="${usuario.tipoUsuario=='1'}">Administrador<br></br><c:out value="${usuario.nome}"></c:out> </c:when> <c:otherwise>Privilegiado<br></br><c:out value="${usuario.nome}"></c:out></c:otherwise> </c:choose>'); 
	 
});

</script>
</head>
  <body >
    <div id="wrap">
     
      <div id="top">

    <c:import url="importAdminNav.jsp" />

        <!-- header.head -->
        <header class="head">
          <!-- ."main-bar -->
          <div class="main-bar">
            <h3>
              <i class="fa fa-home"></i> Easy Cook</h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->
      
      <c:import url="importAdminMenuLateral.jsp" />
      <div id="content">
        <div class="outer">
          <div class="inner">
            <div class="col-lg-12">
       <h5 id='idNomeUsuario' class="media-heading" style="color:silver;" ><h5>
              <h2 id="metis-admin-template-with-twitter-bootstrap-build-status-https-travis-ci-org-onokumus-bootstrap-admin-template-png-http-travis-ci-org-onokumus-bootstrap-admin-template-">Bem vindo ao Easy Cook Admin            
              </h2>
              <p>Clique no menu ao lado para realizar as a&ccedil;&otilde;es desejadas</p>
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