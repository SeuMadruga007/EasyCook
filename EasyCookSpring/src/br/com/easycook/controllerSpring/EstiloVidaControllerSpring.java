package br.com.easycook.controllerSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.easycook.controle.EstiloVidaControle;


@Controller
public class EstiloVidaControllerSpring {
	
	EstiloVidaControle evControle = new EstiloVidaControle();
	
	@RequestMapping(value="/incluirEstiloVida", method=RequestMethod.POST)
	  public @ResponseBody void incluirUsuario(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Incluir Estilo Vida");
	    	  String inserir = evControle.incluirEstiloVida(request);
	    		  response.getWriter().write(inserir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	@RequestMapping(value="/excluirEstiloVida", method=RequestMethod.POST)
	  public @ResponseBody void excluirEstiloVida(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Excluir Estilo Vida");
	    	  boolean excluir = evControle.excluirEstiloVida(request);
	    	  if(excluir){
	    		  response.getWriter().write("sucesso");
	    	  }else
	    		  response.getWriter().write("falha");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	
	@RequestMapping(value="/pesquisarEstiloVida", method=RequestMethod.POST)
	  public @ResponseBody void pesquisarEstiloVida(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("pesquisar Estilo Vida");
	    	  String resultado = evControle.pesquisarEstiloVida();
	    	  response.getWriter().write(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	@RequestMapping(value="/alterarEstiloVida", method=RequestMethod.POST)
	  public @ResponseBody void alterarEstiloVida(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("alterar Estilo Vida");
	    	  String inserir = evControle.alterarEstiloVida(request);
	    		  response.getWriter().write(inserir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	
	
	
	
	
	

}
