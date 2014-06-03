package br.com.easycook.Interface;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.easycook.classesVO.CategoriaVO;

public interface CategoriaInterface {
	
	public boolean inserirCategoria(CategoriaVO categoriaVo);
	public boolean alterarCategoria(CategoriaVO categoriaVo);
	public boolean excluirCategoria(CategoriaVO categoriaVo);
	public ArrayList<CategoriaVO> pesquisarCategoria()throws SQLException;
	public boolean validarCategoriaService(String categoria);
	
}
