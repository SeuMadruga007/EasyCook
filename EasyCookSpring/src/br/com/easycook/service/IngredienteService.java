package br.com.easycook.service;

import br.com.easycook.classesVO.IngredienteVO;
import br.com.easycook.implementacao.IngredienteImplementacao;

public class IngredienteService extends IngredienteImplementacao{

	public boolean inserirIngredienteService(IngredienteVO IngredienteVo){
		return super.inserirIngrediente(IngredienteVo);
	}
	
	public void alterarIngredienteService(IngredienteVO IngredienteVo){
		super.alterarIngrediente(IngredienteVo);
	}
	
	public void excluirIngredienteService(IngredienteVO IngredienteVo){
		super.excluirIngrediente(IngredienteVo);
	}
	
	public void pesquisarIngredienteService(IngredienteVO IngredienteVo){
		super.pesquisarIngrediente(IngredienteVo);
	}
	
}
