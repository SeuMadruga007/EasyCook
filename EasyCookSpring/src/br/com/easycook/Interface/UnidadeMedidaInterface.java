package br.com.easycook.Interface;

import java.sql.SQLException;

import br.com.easycook.classesVO.UnidadeMedidaVO;

public interface UnidadeMedidaInterface {

	public boolean inserirUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo)throws SQLException;
	public boolean alterarUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo)throws SQLException;
	public boolean excluirUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo)throws SQLException;
	public boolean pesquisarUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo)throws SQLException;
	
}
