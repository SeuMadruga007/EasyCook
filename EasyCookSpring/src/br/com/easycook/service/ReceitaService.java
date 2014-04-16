package br.com.easycook.service;

import java.sql.SQLException;

import br.com.easycook.classesVO.ReceitaVO;
import br.com.easycook.implementacao.ReceitaImplementacao;

public class ReceitaService extends ReceitaImplementacao{
	
	public void inserir_Receita_Service(ReceitaVO ReceitaVo) throws SQLException{
		super.inserirReceita(ReceitaVo);
	}
	
	public void alterar_Receita_Service(ReceitaVO ReceitaVo){
		super.alterarReceita(ReceitaVo);
	}
	
	public void excluir_Receita_Service(ReceitaVO ReceitaVo){
		super.excluirReceita(ReceitaVo);
	}
	
	public void pesquisar_Receita_Service(ReceitaVO ReceitaVo){
		super.pesquisarReceita(ReceitaVo);
	}

}
