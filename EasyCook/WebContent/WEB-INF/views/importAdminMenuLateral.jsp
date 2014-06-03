 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <head>
 	<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	 if($('#tipoUsuario').val()=='2'){
			$('#UlUsuario').hide();
		}
	
	 //seta o tipo do usuario e o nome na aba lateral esquerda
	 $('#idNomeUsuario').html('<c:choose> <c:when test="${usuario.tipoUsuario=='1'}">Administrador<br></br><c:out value="${usuario.nome}"></c:out> </c:when> <c:otherwise>Privilegiado<br></br><c:out value="${usuario.nome}"></c:out></c:otherwise> </c:choose>'); 
	 
});

</script>
 </head>
 <html>
 <input type="hidden" id="tipoUsuario" value="<c:out value="${usuario.tipoUsuario}"></c:out>"/>
 <!-- MENU LATERAL -- PAGINAS DE ADMINISTRACAO -->
 <div id="left">
        <div class="media user-media"> 
          <div class="media-body">
            <h5 class="media-heading"></h5>
           <%--  <input type="text" id="tipoUsuario" value="<c:out value="${usuario.tipoUsuario}"></c:out>"/> --%>
            <ul class="list-unstyled user-info">
            <h5 id='idNomeUsuario' class="media-heading" style="color:silver;" ><h5>
            </ul>
          </div>
        </div>

        <!-- #menu -->
         <ul id="menu" class="collapse">
          <li class="nav-header">Menu</li>
          <li class="nav-divider"></li>
          <li id='liUsuario'>
         <li  class="">
            <a href="javascript:;">
              <i class="fa fa-user"></i>
              <span class="link-title">Usu&aacute;rio</span> 
              <span class="fa arrow"></span> 
            </a> 
            <ul id='UlUsuario'>
            
              <li class="">
                <a href="UsuarioIncluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Incluir 
                </a> 
              </li>
              
              <li class="">
                <a href="UsuarioExcluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Excluir
                </a> 
              </li>
              
              <li class="">
                <a href="UsuarioAlterarConsultar">
                  <i class="fa fa-angle-right"></i>&nbsp;Alterar/ Consultar
                </a> 
              </li>
              
            </ul>
          </li> 
          
          
          <li class="">
            <a href="javascript:;">
              <i class="fa fa-cutlery"></i>
              <span class="link-title">Receita</span> 
              <span class="fa arrow"></span> 
            </a> 
            <ul>
              <li class="">
                <a href="ReceitaIncluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Incluir 
                </a> 
              </li>
              <li class="">
                <a href="ReceitaExcluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Excluir
                </a> 
              </li>
              <li class="">
                <a href="ReceitaAlterarConsultar">
                  <i class="fa fa-angle-right"></i>&nbsp;Alterar/ Consultar
                </a> 
              </li>
            </ul>
          </li>
          
           <li class="">
            <a href="javascript:;">
              <i class="fa fa-coffee"></i>
              <span class="link-title">Ingredientes</span> 
              <span class="fa arrow"></span> 
            </a> 
            <ul>
              <li class="">
                <a href="IngredienteIncluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Incluir 
                </a> 
              </li>
              <li class="">
                <a href="IngredienteExcluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Excluir
                </a> 
              </li>
              <li class="">
                <a href="IngredienteAlterarConsultar">
                  <i class="fa fa-angle-right"></i>&nbsp;Alterar/ Consultar
                </a> 
              </li>
            </ul>
          </li>
          <li class="">
            <a href="javascript:;">
              <i class="fa fa-tags"></i>
              <span class="link-title">Categoria</span> 
              <span class="fa arrow"></span> 
            </a> 
            <ul>
              <li class="">
                <a href="CategoriaIncluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Incluir 
                </a> 
              </li>
              <li class="">
                <a href="CategoriaExcluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Excluir
                </a> 
              </li>
              <li class="">
                <a href="CategoriaAlterarConsultar">
                  <i class="fa fa-angle-right"></i>&nbsp;Alterar/ Consultar
                </a> 
              </li>
            </ul>
          </li>
          <li class="">
            <a href="javascript:;">
              <i class="fa fa-arrows-alt"></i>
              <span class="link-title">Estilo de vida </span> 
              <span class="fa arrow"></span> 
            </a> 
            <ul>
              <li class="">
                <a href="EstiloIncluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Incluir 
                </a> 
              </li>
              <li class="">
                <a href="EstiloExcluir">
                  <i class="fa fa-angle-right"></i>&nbsp;Excluir
                </a> 
              </li>
              <li class="">
                <a href="EstiloAlterarConsultar">
                  <i class="fa fa-angle-right"></i>&nbsp;Alterar/ Consultar
                </a> 
              </li>
            </ul>
          </li>  
          <li class="nav-divider"></li>  
        </ul><!-- /#menu -->
      </div><!-- /#left -->
 
 </html>
