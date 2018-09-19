package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Veiculo;
import br.com.fiap.connection.Conexao;

public class VeiculoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public VeiculoDAO() throws Exception{
		con = new Conexao().conectar();
	}

	//Gravar
	public String gravar(Veiculo p) throws Exception {
		stmt = con.prepareStatement("INSERT INTO T_DDD_VEICULO (NR_PLACA, DS_MODELO, NM_COR, NR_ANO, VL_VENDA, VL_COMPRA) VALUES (?, ?, ?, ?, ?, ?)");
		stmt.setString(1, p.getPlaca());
		stmt.setString(2, p.getModelo());
		stmt.setString(3, p.getCor());
		stmt.setInt(4, p.getAno());
		stmt.setDouble(5, p.getVenda());
		stmt.setDouble(6, p.getCompra());
		stmt.executeUpdate();
		return "Veiculo Cadastrado!";
	}

	//Consultar por Placa
	public Veiculo consultarPorPlaca(String placa) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM T_DDD_VEICULO WHERE NR_PLACA=?");
		stmt.setString(1, placa);
		rs = stmt.executeQuery();
		if(rs.next()) {
			return new Veiculo(rs.getString("NR_PLACA"), rs.getString("DS_MODELO"), rs.getString("NM_COR"), rs.getInt("NR_ANO"), rs.getDouble("VL_VENDA"), rs.getDouble("VL_COMPRA"));
		} else {
			return new Veiculo();
		}
	}
	//Consultar por Modelo
	public List<Veiculo> consultarPorModelo(String modelo) throws Exception{
		List<Veiculo> lista = new ArrayList<Veiculo>();
		stmt = con.prepareStatement("SELECT * FROM T_DDD_VEICULO WHERE DS_MODELO LIKE ?");
		stmt.setString(1, "%" + modelo + "%");
		rs = stmt.executeQuery();
		while(rs.next()) {
			lista.add(new Veiculo(rs.getString("NR_PLACA"), rs.getString("DS_MODELO"), rs.getString("NM_COR"), rs.getInt("NR_ANO"), rs.getDouble("VL_VENDA"), rs.getDouble("VL_COMPRA")));
		}
		return lista;
	}

	//Depreciar
	public double depreciar() throws Exception{
		stmt = con.prepareStatement("UPDATE T_DDD_VEICULO SET VL_VENDA=VL_VENDA-(VL_VENDA*0.03)");
		return stmt.executeUpdate();
	}

	//Apagar por Ano
	public int apagarPorAno(int numero) throws Exception{
		stmt = con.prepareStatement("DELETE FROM T_DDD_VEICULO WHERE NR_ANO=?");
		stmt.setInt(1, numero);
		return stmt.executeUpdate();
	}
	
	//atualizar
	public String atualizar(Veiculo v) throws Exception {
		stmt = con.prepareStatement("UPDATE T_DDD_VEICULO SET DS_MODELO=?, NM_COR=?, NR_ANO=?, VL_VENDA=?, VL_COMPRA=? WHERE NR_PLACA=?");
		stmt.setString(6, v.getPlaca());
		stmt.setString(1, v.getModelo());
		stmt.setString(2, v.getCor());
		stmt.setInt(3, v.getAno());
		stmt.setDouble(4, v.getVenda());
		stmt.setDouble(5, v.getCompra());
		return stmt.executeUpdate() + " linhas foram afetadas!";
	}

	public void fechar() throws Exception {
		con.close();
	}
}
