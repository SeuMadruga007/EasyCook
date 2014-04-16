package br.com.easycook.Interface;

import br.com.easycook.classesVO.UnidadeMedidaReceitaIngredienteVO;


public interface UnidadeMedidaReceitaIngredienteInterface {

	public boolean inserirUnidadeMedidaReceitaIngrediente(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo);
	public boolean alterarUnidadeMedidaReceitaIngrediente(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo);
	public boolean excluirUnidadeMedidaReceitaIngrediente(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo);
	public boolean pesquisarUnidadeMedidaReceitaIngrediente(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo);
	
}
