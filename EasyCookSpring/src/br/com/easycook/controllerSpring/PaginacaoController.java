package br.com.easycook.controllerSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginacaoController {

  @RequestMapping("index")
  public String execute() {
      System.out.println("Abre index");
      return "/index";
  }
  
  @RequestMapping("/404")
  public String execute2() {
      System.out.println("erro 404");
      return "/404";
  }  
  
  @RequestMapping("500")
  public String execute3() {
      System.out.println("erro 500");
      return "/500";
  }  
  
  @RequestMapping("/sobreEasyCook")
  public String execute4() {
      System.out.println("Executando sobre easyCook");
      return "/sobreEasyCook";
  }   
}