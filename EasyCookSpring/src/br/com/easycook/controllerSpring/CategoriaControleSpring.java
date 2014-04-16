package br.com.easycook.controllerSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.easycook.controle.CategoriaControle;

@Controller
public class CategoriaControleSpring {
	CategoriaControle cControle = new CategoriaControle();
	
	@RequestMapping(value="/incluirCategoria", method=RequestMethod.POST)
	  public @ResponseBody void incluirCategoria(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Incluir Categoria");
	    	  String inserir = cControle.incluirCategoria(request);
	    		  response.getWriter().write(inserir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	@RequestMapping(value="/excluirCategoria", method=RequestMethod.POST)
	  public @ResponseBody void excluirCategoria(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Excluir Categoria");
	    	  boolean excluir = cControle.excluirCategoria(request);
	    	  if(excluir){
	    		  response.getWriter().write("sucesso");
	    	  }else
	    		  response.getWriter().write("falha");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	
	@RequestMapping(value="/pesquisarCategoria", method=RequestMethod.POST)
	  public @ResponseBody void pesquisarCategoria(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("pesquisar Categoria");
	    	  String resultado = cControle.pesquisarCategoria();
	    	  response.getWriter().write(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	@RequestMapping(value="/alterarCategoria", method=RequestMethod.POST)
	  public @ResponseBody void alterarEstiloVida(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("alterar Categoria");
	    	  String inserir = cControle.alterarCategoria(request);
	    		  response.getWriter().write(inserir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
}
