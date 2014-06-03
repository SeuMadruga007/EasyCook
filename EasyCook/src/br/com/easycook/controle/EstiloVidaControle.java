package br.com.easycook.controle;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.EstiloVidaVO;
import br.com.easycook.service.EstiloVidaService;


public class EstiloVidaControle {
	EstiloVidaService evService = new EstiloVidaService();
	EstiloVidaVO evVo;
	ArrayList<EstiloVidaVO> arrayEstiloVidaVO;
	public String incluirEstiloVida(HttpServletRequest request){
		try {
			evVo = evService.alimentarEstiloVidaVO(request);
			
			boolean validar = evService.validarEstiloVida(evVo.getEstiloVida());
			
			if(validar){
				return "existe";
			}else{
				boolean inserir = evService.inserirEstiloVidaService(evVo);
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
	public boolean excluirEstiloVida(HttpServletRequest request){
		try {
			return evService.excluirEstiloVidaService(evService.alimentarEstiloVidaVO(request));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public String pesquisarEstiloVida(){
		try {
			return evService.stringEstiloVida(evService.pesquisarEstiloVidaService());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String alterarEstiloVida(HttpServletRequest request){
		try {
			evVo = evService.alimentarEstiloVidaVO(request);
			boolean validar = evService.validarEstiloVida(evVo.getEstiloVida());
			
			if(validar){
				return "existe";
			}else{
				boolean inserir = evService.alterarEstiloVidaService(evVo);
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
	
	
}
