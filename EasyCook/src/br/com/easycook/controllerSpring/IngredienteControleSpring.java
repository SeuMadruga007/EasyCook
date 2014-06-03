package br.com.easycook.controllerSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.easycook.controle.IngredienteControle;

@Controller
public class IngredienteControleSpring {
IngredienteControle iControle = new IngredienteControle();
	
	@RequestMapping(value="/incluirIngrediente", method=RequestMethod.POST)
	  public @ResponseBody void incluirIngrediente(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Incluir Ingrediente");
	    	  String inserir = iControle.incluirCategoria(request);
	    		  response.getWriter().write(inserir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	@RequestMapping(value="/excluirIngrediente", method=RequestMethod.POST)
	  public @ResponseBody void excluirCategoria(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("Excluir Ingrediente");
	    	  boolean excluir = iControle.excluirIngrediente(request);
	    	  
	    	  if(excluir){
	    		  response.getWriter().write("sucesso");
	    	  }else
	    		  response.getWriter().write("falha");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	
	
	@RequestMapping(value="/pesquisarIngrediente", method=RequestMethod.POST)
	  public @ResponseBody void pesquisarCategoria(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("pesquisar Ingrediente");
	    	  String resultado = iControle.pesquisarIngrediente();
	    	  response.getWriter().write(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	@RequestMapping(value="/alterarIngrediente", method=RequestMethod.POST)
	  public @ResponseBody void alterarEstiloVida(HttpServletResponse response, HttpServletRequest request) {
	      try {
	    	  System.out.println("alterar Ingrediente");
	    	  String inserir = iControle.alterarCategoria(request);
	    		  response.getWriter().write(inserir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
}
