package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Produto;
import br.com.fiap.connection.Conexao;

public class ProdutoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public ProdutoDAO()throws Exception{
		con = new Conexao().conectar();
	}
	
	//MÉTODO CADASTRAR PRODUTO
	public String gravar(Produto p) throws Exception{
		stmt = con.prepareStatement
				("INSERT INTO T_DDD_PRODUTO"+"(CD_PRODUTO,VL_PRODUTO,DS_PRODUTO)VALUES(?,?,?)");
		stmt.setInt(1, p.getCodigo());
		stmt.setDouble(2, p.getValor());
		stmt.setString(3, p.getDescricao());
		
		stmt.executeUpdate();
		
		return "Produto cadastrado com sucesso";
	}
	
	//MÉTODO CONSULTAR POR DESCRIÇÃO
	public Produto consultarPorDescricao(String descricao) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM T_DDD_PRODUTO WHERE DS_PRODUTO=?");
		
		stmt.setString(1, descricao);
		
		rs = stmt.executeQuery();
		
		
		if(rs.next()) {
			return new Produto
			(rs.getInt("CD_PRODUTO"), rs.getDouble("VL_PRODUTO"),rs.getString("DS_PRODUTO"));
		}else {
			return new Produto();
		}
	}
}
