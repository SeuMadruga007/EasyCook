package br.com.easycook.controllerSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.controle.UsuarioControle;

@Controller
public class UsuarioControllerSpring {

	UsuarioVO usuarioVo;  
	UsuarioControle uControle = new UsuarioControle();
	
	 @RequestMapping(value="/inserirUsuario", method=RequestMethod.POST)
	  public @ResponseBody void incluirUsuario(HttpServletResponse response, HttpServletRequest request) {
	      try {
		      boolean cadastrar = uControle.cadastrarUsuario(uControle.alimentarUsuarioVO(request));
				if(cadastrar){
					response.getWriter().write("sucesso");
				}else
					response.getWriter().write("falha");
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	 
	 @RequestMapping(value="/alterarUsuario", method=RequestMethod.POST)
	  public @ResponseBody void alterarUsuario(HttpServletResponse response, HttpServletRequest request) {
	      try {
				boolean alterado = uControle.alterarUsuario(uControle.alimentarUsuarioVO(request));
				if(alterado){
					response.getWriter().write("sucesso");
				}else
					response.getWriter().write("falha");
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	 
	 
	 @RequestMapping(value="/excluirUsuario", method=RequestMethod.POST)
	  public @ResponseBody void excluirUsuario(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Excluir Usuario");
				boolean excluido = uControle.excluirUsuario(uControle.getEmail(request));
				if(excluido){
					response.getWriter().write("sucesso");
				}else
					response.getWriter().write("falha");
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	 
	 
	 @RequestMapping(value="/pesquisarUsuario", method=RequestMethod.POST)
	  public @ResponseBody void pesquisarUsuario(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  response.getWriter().write(uControle.pesquisarUsuario(uControle.getEmail(request)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	 
	 @RequestMapping(value="/pesquisarUnicoUsuario", method=RequestMethod.POST)
	  public @ResponseBody void pesquisarUnicoUsuario(HttpServletResponse response, HttpServletRequest request) {
	      try {
	  		response.getWriter().write(uControle.pesquisarUnicoUsuario(uControle.getUncioEmail(request)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
}
