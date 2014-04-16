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
	@Override
	public boolean inserirCategoria(CategoriaVO categoriaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" insert into categoria values ( ")
				.append("'"+categoriaVo.getNomeCategoria()+"')");
			
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
			   .append(" Tipo_categoria = '"+categoriaVo.getNomeCategoria()+"' ")
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
				.append(" where tipo_Categoria ='"+categoriaVo.getNomeCategoria()+"'");
			
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
	public boolean validarCategoria(String categoria) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append("select * ")
				.append("from categoria ")
				.append("where tipo_categoria = '"+categoria.trim()+"'");
			
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
