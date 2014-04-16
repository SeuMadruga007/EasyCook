package br.com.easycook.controllerSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriasController {

  @RequestMapping("/aves")
  public String execute() {
      System.out.println("Abre aves");
      return "/categAves";
  }
  
  @RequestMapping("/bolos")
  public String execute2() {
      System.out.println("Abre bolos");
      return "/categBolos";
  } 
  
  @RequestMapping("/carnes")
  public String execute3() {
      System.out.println("Abre carnes");
      return "/categCarnes";
  } 
  
  @RequestMapping("/doces")
  public String execute4() {
      System.out.println("Abre doces");
      return "/categDoces";
  } 
  
  @RequestMapping("/lanches")
  public String execute5() {
      System.out.println("Abre lanches");
      return "/categLanches";
  }  
  
  @RequestMapping("/massas")
  public String execute6() {
      System.out.println("Abre massas");
      return "/categMassas";
  }   
  
  @RequestMapping("/peixesEFrutosDoMar")
  public String execute7() {
      System.out.println("Abre peixes");
      return "/categPeixesEFrutosDoMar";
  }
  
  @RequestMapping("/saladas")
  public String execute8() {
      System.out.println("Abre saladas");
      return "/categSaladas";
  }
  
  @RequestMapping("/sopas")
  public String execute9() {
      System.out.println("Abre sopas");
      return "/categSopas";
  } 
 
  
 
  

  
  
  
}