package br.com.easycook.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {
	
	/*@Override
	 public void afterCompletion(HttpServletRequest request,
	   HttpServletResponse response, Object object, Exception exception)
	   throws Exception {

	 }

	 @Override
	 public void postHandle(HttpServletRequest request, HttpServletResponse response,
	   Object object, ModelAndView modelAndView) throws Exception {

	 }

	 @Override
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
	   Object object) throws Exception {
	  return false;
	 }
	}*/
	
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object obj) throws Exception {
		if (!verificaAcesso(req,res)) {
			res.sendRedirect("500");
		}
		
		return true;
	}
	
	public boolean verificaAcesso(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String uri = req.getRequestURI();
		
		
		String[] adminPages = new String[16]; //17 com a nada, apenas para teste
		adminPages[0]=("CategoriaIncluir");
		adminPages[1]=("CategoriaExcluir");
		adminPages[2]=("CategoriaAlterarConsultar") ;
		
		adminPages[3]=("EstiloIncluir") ;
		adminPages[4]=("EstiloExcluir") ;
		adminPages[5]=("EstiloAlterarConsultar");
		
		adminPages[6]=("IngredienteIncluir") ;
		adminPages[7]=("IngredienteExcluir") ;
		adminPages[8]=("IngredienteAlterarConsultar") ;
		
		adminPages[9]=("ReceitaIncluir") ;
		adminPages[10]=("ReceitaExcluir") ;
		adminPages[11]=("ReceitaAlterarConsultar") ;
		
		adminPages[12]=("UsuarioIncluir") ;
		adminPages[13]=("UsuarioExcluir") ;
		adminPages[14]=("UsuarioAlterarConsultar");
		adminPages[15]=("indexAdmin");
		//adminPages[16]=("nada");
		
		System.out.println("getSession() - "+req.getSession().getAttribute("usuarioLogado"));
		
		for (int i = 0; i < adminPages.length; i++) {
		   //if (uri.endsWith(adminPages[adminPages.length-1]) && req.getSession().getAttribute("usuarioLogado") == null) {
			if (uri.endsWith(adminPages[i]) && req.getSession().getAttribute("usuarioLogado") == null) {
				return false;
			}
		}
		return true;
	}

}