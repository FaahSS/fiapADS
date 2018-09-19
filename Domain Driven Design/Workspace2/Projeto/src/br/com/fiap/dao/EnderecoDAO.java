package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Endereco;
import br.com.fiap.connection.Conexao;

public class EnderecoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public EnderecoDAO() throws Exception{
		con = new Conexao().conectar();
	}

	public String gravar(Endereco e) throws Exception{
		stmt = con.prepareStatement("INSERT INTO T_DDD_ENDERECO (CD_ENDERECO, DS_LOGRADOURO, NR_ENDERECO, NR_CEP) VALUES (?,?,?,?)");
		stmt.setInt(1, e.getCodigo());
		stmt.setString(2, e.getLogradouro());
		stmt.setString(3, e.getNumero());
		stmt.setString(4, e.getCep());
		stmt.executeUpdate();
		return "OK";
	}
	
	public Endereco consultarPorCodigo(int codigo) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM T_DDD_ENDERECO WHERE CD_ENDERECO = ?");
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Endereco(
					rs.getInt("CD_ENDERECO"),
					rs.getString("DS_LOGRADOURO"),
					rs.getString("NR_ENDERECO"),
					rs.getString("NR_CEP")
					);
		} else {
			return new Endereco(); 
		}
		
		
		
	}
	public void fechar() throws Exception{
		con.close();
	}
}
