package br.com.easycook.implementacao;

import java.sql.ResultSet;

import br.com.easycook.Interface.IngredienteInterface;
import br.com.easycook.classesVO.IngredienteVO;
import br.com.easycook.util.Conexao;

public class IngredienteImplementacao implements IngredienteInterface{
	Conexao objConexao = new Conexao();
	@Override
	public boolean inserirIngrediente(IngredienteVO ingredienteVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" insert into ingrediente values ( '")
				.append(ingredienteVo.getNomeIngrediente()+"' ) ");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterarIngrediente(IngredienteVO ingredienteVo) {
		try {
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("update usuario set  ")
			   .append("nome = '"+ingredienteVo.getNomeIngrediente()+"', ")
			   .append("where idIngrediente = "+ingredienteVo.getIdIngrediente());
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean excluirIngrediente(IngredienteVO ingredienteVo) {
		try {
			StringBuffer sql = new StringBuffer();
			
			sql.append(" delete from ingrediente where nome= '")
			.append(ingredienteVo.getNomeIngrediente()+"' ");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public IngredienteVO pesquisarIngrediente(IngredienteVO ingredienteVo) {
		try {
			
			StringBuilder sql = new StringBuilder();
			
			sql.append("select * from ingrediente");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			while(rs.next()){
				ingredienteVo.setIdIngrediente(rs.getInt(1));
				ingredienteVo.setNomeIngrediente(rs.getString(2));
			}
			return ingredienteVo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
