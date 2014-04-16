package br.com.easycook.Interface;

import java.sql.SQLException;

import br.com.easycook.classesVO.ReceitaVO;

public interface ReceitaInterface {

	public boolean inserirReceita(ReceitaVO ReceitaVo)throws SQLException;
	public boolean alterarReceita(ReceitaVO ReceitaVo);
	public boolean excluirReceita(ReceitaVO ReceitaVo);
	public boolean pesquisarReceita(ReceitaVO ReceitaVo);

	
}
