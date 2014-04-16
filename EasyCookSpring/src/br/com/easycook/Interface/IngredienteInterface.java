package br.com.easycook.Interface;

import java.sql.SQLException;

import br.com.easycook.classesVO.IngredienteVO;

public interface IngredienteInterface {

	public boolean inserirIngrediente(IngredienteVO IngredienteVo)throws SQLException;
	public boolean alterarIngrediente(IngredienteVO IngredienteVo)throws SQLException;
	public boolean excluirIngrediente(IngredienteVO IngredienteVo)throws SQLException;
	public IngredienteVO pesquisarIngrediente(IngredienteVO IngredienteVo)throws SQLException;

	
}
