package br.com.easycook.Interface;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.easycook.classesVO.IngredienteVO;

public interface IngredienteInterface {

	public boolean inserirIngrediente(IngredienteVO IngredienteVo)throws SQLException;
	public boolean alterarIngrediente(IngredienteVO IngredienteVo)throws SQLException;
	public boolean excluirIngrediente(IngredienteVO IngredienteVo)throws SQLException;
	public ArrayList<IngredienteVO> pesquisarIngrediente()throws SQLException;
	public boolean validarIngrediente(String categoria);
	
}
