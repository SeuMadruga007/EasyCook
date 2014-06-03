package br.com.easycook.controllerSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.controle.LoginControle;

@Controller
public class AdminController {
LoginControle lControle = new LoginControle();
	UsuarioVO usuarioVo;
	/*Logar*/
	 @RequestMapping(value="/logar", method=RequestMethod.POST)
	  public ModelAndView logar(HttpServletResponse response, HttpServletRequest request,Model model) {
	      try {
	    	  System.out.println("Abre logar");
	    	  usuarioVo = lControle.efetuarLogin(request);
		      if(usuarioVo!=null){
		    	  System.out.println("logado");
		    	  request.getSession().setAttribute("usuarioLogado", usuarioVo);
		    	  
		    	  ModelAndView mav = new ModelAndView("/indexAdmin");
		    	  mav.addObject("usuario",usuarioVo);
		    	  
		    	  return mav ;
		      }else{
		    	  System.out.println("Não logado");
		    	  return  new ModelAndView("/login","naoLogado",true);
		      }
	      } catch (Exception e) {
	    	  e.printStackTrace();
	    	  return  new ModelAndView("/login");
	      }
	  }
	 
	 
	 
	 @RequestMapping(value="/deslogar")
	  public String deslogar(HttpServletRequest request) {
	      try {
	    	  System.out.println("Abre deslogar");
	    	  
		      if(lControle.deslogar(request)){
		    	  System.out.println("deslogado");
		    	  return "/index";
		      }else{
		    	  System.out.println("erro ao deslogar");
		    	  return "/404";
		      }
	      } catch (Exception e) {
	    	  e.printStackTrace();
	    	  return "/404";
	      }
	  }

	  @RequestMapping("/login")
	  public ModelAndView execute1(HttpServletRequest request) {
	      System.out.println("Abre login");
	      return retornoSession(request, "indexAdmin");
	  }
	  
	  @RequestMapping("/indexAdmin")
	  public ModelAndView execute16(HttpServletRequest request) {
	      System.out.println("Abre indexAdmin");
	      return retornoSession(request, "indexAdmin");
	  } 
	
	
/*CATEGORIA*/
	
  @RequestMapping("/CategoriaAlterarConsultar")
  public ModelAndView execute(HttpServletRequest request) {
      System.out.println("Abre CategoriaAltCon");
   return retornoSession(request, "CategoriaAltCon");
      
      
      
  }
  
  @RequestMapping("/CategoriaIncluir")
  public ModelAndView execute2(HttpServletRequest request) {
      System.out.println("Abre CategoriaIncluir");
      return retornoSession(request, "CategoriaIncluir");
  } 
  
  @RequestMapping("/CategoriaExcluir")
  public ModelAndView categoriaExcluir(HttpServletRequest request) {
      System.out.println("Abre CategoriaExcluir");
      return retornoSession(request, "CategoriaExcluir");
  } 

  
  
/*ESTILO DE VIDA*/ 
  @RequestMapping("/EstiloAlterarConsultar")
  public ModelAndView estiloAlterarConsultar(HttpServletRequest request) {
      System.out.println("Abre EstiloAltCon");
      return retornoSession(request, "EstiloAltCon");
  } 
  
  @RequestMapping("/EstiloIncluir")
  public ModelAndView  estiloIncluir(HttpServletRequest request) {
      System.out.println("Abre EstiloIncluir");
      return retornoSession(request, "EstiloIncluir");
  }  
  
  @RequestMapping("/EstiloExcluir")
  public ModelAndView estiloExcluir(HttpServletRequest request) {
      System.out.println("Abre EstiloExcluir");
      return retornoSession(request,"EstiloExcluir");
  } 
 
  
  
/*INGREDIENTE*/ 
  @RequestMapping("/IngredienteAlterarConsultar")
  public ModelAndView ingredienteAlterarConsultar(HttpServletRequest request) {
      System.out.println("Abre IngredienteAlterarConsultar");
      return retornoSession(request, "IngredienteAltCon");
  } 
  
  @RequestMapping("/IngredienteIncluir")
  public ModelAndView ingredienteincluir(HttpServletRequest request) {
      System.out.println("Abre IngredienteIncluir");
      return retornoSession(request, "IngredienteIncluir");
  }  
  
  @RequestMapping("/IngredienteExcluir")
  public ModelAndView ingredienteExcluir(HttpServletRequest request) {
      System.out.println("Abre IngredienteExcluir");
      return retornoSession(request, "IngredienteExcluir");
  } 

  
  /*RECEITA*/ 
  @RequestMapping("/ReceitaAlterarConsultar")
  public ModelAndView receitaAlterarConsultar(HttpServletRequest request) {
      System.out.println("Abre ReceitaAltCon");
      return retornoSession(request, "ReceitaAltCon");
  } 
  
  @RequestMapping("/ReceitaIncluir")
  public ModelAndView receitaInclir(HttpServletRequest request) {
      System.out.println("Abre ReceitaIncluir");
      return retornoSession(request, "ReceitaIncluir");
  }  
  
  @RequestMapping("/ReceitaExcluir")
  public ModelAndView receitaExcluir(HttpServletRequest request) {
      System.out.println("Abre ReceitaExcluir");
      return retornoSession(request, "ReceitaExcluir");
  } 
  
  
  /*USUARIO*/ 
  @RequestMapping("/UsuarioAlterarConsultar")
  public ModelAndView usuarioAlterarConsultar(HttpServletRequest request) {
	  System.out.println("Abre UsuarioAltCon");
	  return retornoSessionUsuarioCrud(request, "UsuarioAltCon");
  } 
  
  @RequestMapping("/UsuarioIncluir")
  public ModelAndView usuarioIncluir(HttpServletRequest request) {
      System.out.println("Abre UsuarioIncluir");
     return retornoSessionUsuarioCrud(request, "UsuarioIncluir");
  }  
  
  @RequestMapping("/UsuarioExcluir")
  public ModelAndView usuarioExcluir(HttpServletRequest request) {
      System.out.println("Abre UsuarioExcluir");
      return  retornoSessionUsuarioCrud(request, "UsuarioExcluir");
  } 
  
  
  protected ModelAndView retornoSessionUsuarioCrud(HttpServletRequest request, String paginaRetorno){
	  if(usuarioVo!=null && usuarioVo.getTipoUsuario()==1){
		  System.out.println("ADM");
		  return retornoSession(request, "/"+paginaRetorno);
	  }else{
		  System.out.println("Privilegiado");
		  return new ModelAndView("/login");
	  }
  }
  
  
  protected ModelAndView retornoSession(HttpServletRequest request, String paginaRetorno){
	  if(request.getSession().getAttribute("usuarioLogado")!=null){
    	  ModelAndView mav = new ModelAndView("/"+paginaRetorno+"");
    	  if(usuarioVo==null){
    		  System.out.println("Usuario null");
    		  usuarioVo = (UsuarioVO) request.getAttribute("usuario");
    	  }
    	  mav.addObject("usuario",usuarioVo);
    	  return mav ;
      }else
    	  return new ModelAndView("/login");
	  
  }
  
  
 
 
}