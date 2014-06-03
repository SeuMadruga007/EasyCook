package br.com.easycook.implementacao;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.easycook.Interface.IngredienteInterface;
import br.com.easycook.classesVO.IngredienteVO;
import br.com.easycook.util.Conexao;

public class IngredienteImplementacao implements IngredienteInterface{
	Conexao objConexao = new Conexao();
	ArrayList<IngredienteVO> arrayIngrediente;
	IngredienteVO iVo;
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
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public boolean alterarIngrediente(IngredienteVO ingredienteVo) {
		try {
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("update ingrediente set  ")
			   .append("nome = '"+ingredienteVo.getNomeIngrediente()+"' ")
			   .append("where idIngrediente = "+ingredienteVo.getIdIngrediente());
			
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
	public boolean excluirIngrediente(IngredienteVO ingredienteVo) {
		try {
			StringBuffer sql = new StringBuffer();
			
			sql.append(" delete from ingrediente ")
			.append(" where idIngrediente= "+ingredienteVo.getIdIngrediente()+" ")
			.append(" and nome='"+ingredienteVo.getNomeIngrediente()+"' ");
			
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
	public ArrayList<IngredienteVO> pesquisarIngrediente() {
		try {
			
			StringBuilder sql = new StringBuilder();
			arrayIngrediente = new ArrayList<IngredienteVO>();
			sql.append("select * from ingrediente");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			while(rs.next()){
				iVo = new IngredienteVO();
				iVo.setIdIngrediente(rs.getInt(1));
				iVo.setNomeIngrediente(rs.getString(2));
				
				arrayIngrediente.add(iVo);
			}
			return arrayIngrediente;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			objConexao.fecharConexao();
		}
	}
	
	@Override
	public boolean validarIngrediente(String ingrediente) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append("select * ")
				.append("from ingrediente ")
				.append("where nome = '"+ingrediente.trim()+"'");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}


}
