package br.com.easycook.controle;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.CategoriaVO;
import br.com.easycook.service.CategoriaService;

public class CategoriaControle {
	CategoriaService cService = new CategoriaService();
	CategoriaVO cVo;
	public String incluirCategoria(HttpServletRequest request){
		try {
			cVo = cService.alimentarCategoriaVO(request);
			
			boolean validar = cService.validarCategoria(cVo.getNomeCategoria());
			
			if(validar){
				return "existe";
			}else{
				boolean inserir = cService.inserirCategoria(cVo);
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
	public boolean excluirCategoria(HttpServletRequest request){
		try {
			return cService.excluirCategoriaService(cService.alimentarCategoriaVO(request));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public String pesquisarCategoria(){
		try {
			return cService.stringCategoria(cService.pesquisarCategoriaService());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String alterarCategoria(HttpServletRequest request){
		try {
			cVo = cService.alimentarCategoriaVO(request);
			boolean validar = cService.validarCategoria(cVo.getNomeCategoria());
			
			if(validar){
				return "existe";
			}else{
				boolean alterar = cService.alterarCategoriaService(cVo);
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
