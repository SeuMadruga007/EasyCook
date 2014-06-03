package br.com.easycook.controle;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.IngredienteVO;
import br.com.easycook.service.IngredienteService;

public class IngredienteControle {
	IngredienteService iService = new IngredienteService();
	IngredienteVO iVo;
	
	public String incluirCategoria(HttpServletRequest request){
		try {
			iVo = iService.alimentarIngredienteVOService(request);
			
			boolean validar = iService.validarIngredienteService(iVo.getNomeIngrediente());
			
			if(validar){
				return "existe";
			}else{
				boolean inserir = iService.inserirIngredienteService(iVo);
				if(inserir){
					return "sucesso";
				}else
					return "falha";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean excluirIngrediente(HttpServletRequest request){
		try {
			return iService.excluirIngredienteService(iService.alimentarIngredienteVOService(request));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public String pesquisarIngrediente(){
		try {
			return iService.stringIngrediente(iService.pesquisarIngredienteService());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String alterarCategoria(HttpServletRequest request){
		try {
			iVo = iService.alimentarIngredienteVOService(request);
			boolean validar = iService.validarIngredienteService(iVo.getNomeIngrediente());
			
			if(validar){
				return "existe";
			}else{
				boolean alterar = iService.alterarIngredienteService(iVo);
				if(alterar){
					return "sucesso";
				}else
					return "falha";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}	
