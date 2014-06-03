package br.com.easycook.service;

import br.com.easycook.classesVO.UnidadeMedidaReceitaIngredienteVO;
import br.com.easycook.implementacao.UnidadeMedidaReceitaIngredienteImplementacao;

public class UnidadeMedidaReceitaIngredienteService extends UnidadeMedidaReceitaIngredienteImplementacao{

	public void inserir_Unidade_Medida_Receita_Ingrediente_Service(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo){
		super.inserirUnidadeMedidaReceitaIngrediente(Unidade_Medida_Receita_IngredienteVo);
	}
	
	public void alterar_Unidade_Medida_Receita_Ingrediente_Service(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo){
		super.alterarUnidadeMedidaReceitaIngrediente(Unidade_Medida_Receita_IngredienteVo);
	}
	
	public void excluir_Unidade_Medida_Receita_Ingrediente_Service(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo){
		super.excluirUnidadeMedidaReceitaIngrediente(Unidade_Medida_Receita_IngredienteVo);
	}
	
	public void pesquisar_Unidade_Medida_Receita_Ingrediente_Service(UnidadeMedidaReceitaIngredienteVO Unidade_Medida_Receita_IngredienteVo){
		super.pesquisarUnidadeMedidaReceitaIngrediente(Unidade_Medida_Receita_IngredienteVo);
	}
	
	
}
