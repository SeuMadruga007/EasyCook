package br.com.easycook.service;

import br.com.easycook.classesVO.UnidadeMedidaVO;
import br.com.easycook.implementacao.UnidadeMedidaImplementacao;

public class UnidadeMedidaService extends UnidadeMedidaImplementacao{

	public void inserirUnidadeMedidaService(UnidadeMedidaVO unidadeMedidaVo){
		super.inserirUnidadeMedida(unidadeMedidaVo);
	}
	
	public void alterarUnidadeMedidaService(UnidadeMedidaVO unidadeMedidaVo){
		super.alterarUnidadeMedida(unidadeMedidaVo);
	}
	
	public void excluirUnidadeMedidaService(UnidadeMedidaVO unidadeMedidaVo){
		super.excluirUnidadeMedida(unidadeMedidaVo);
	}
	
	public void pesquisarUnidadeMedidaService(UnidadeMedidaVO unidadeMedidaVo){
		super.pesquisarUnidadeMedida(unidadeMedidaVo);
	}
	
	
}
