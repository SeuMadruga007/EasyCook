package br.com.easycook.implementacao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.easycook.Interface.CategoriaInterface;
import br.com.easycook.classesVO.CategoriaVO;
import br.com.easycook.util.Conexao;

public class CategoriaImplementacao implements CategoriaInterface{
	Conexao objConexao = new Conexao();
	ArrayList<CategoriaVO> arrayCategoriaVo;
	CategoriaVO categoriaVo;
	private final int tipoCategoria=0;
	
	@Override
	public boolean inserirCategoria(CategoriaVO categoriaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" insert into categoria values ( ")
				.append("'"+categoriaVo.getNomeCategoria()+"',"+tipoCategoria+")");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public boolean alterarCategoria(CategoriaVO categoriaVo) {
		try {
			
			StringBuffer sql = new StringBuffer();
			
			sql.append(" update categoria set  ")
			   .append(" nome = '"+categoriaVo.getNomeCategoria()+"' ")
			   .append(" where idCategoria = '"+categoriaVo.getIdCategoria()+"'");
			
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public boolean excluirCategoria(CategoriaVO categoriaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" delete from Categoria ")
				.append(" where idCategoria ='"+categoriaVo.getIdCategoria()+"'");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}
	
	//Verifica se já existe uma categoria com esse nome
	@Override
	public boolean validarCategoriaService(String categoria) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" select * ")
				.append(" from categoria ")
				.append(" where nome = '"+categoria.trim()+"'");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public ArrayList<CategoriaVO> pesquisarCategoria()throws SQLException {
		try {
			StringBuilder sql = new StringBuilder();
			arrayCategoriaVo = new ArrayList<CategoriaVO>();
			sql.append("select * from categoria");
			ResultSet rs =	objConexao.executarConsulta(sql.toString());
			
			while(rs.next()){
				categoriaVo = new CategoriaVO();
				categoriaVo.setIdCategoria(Integer.parseInt(rs.getString(1)));
				categoriaVo.setNomeCategoria(rs.getString(2));
				categoriaVo.setTipoCategoria(rs.getInt(3));
				
				arrayCategoriaVo.add(categoriaVo);
			}
		
			return arrayCategoriaVo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			objConexao.fecharConexao();
		}
	}

}
