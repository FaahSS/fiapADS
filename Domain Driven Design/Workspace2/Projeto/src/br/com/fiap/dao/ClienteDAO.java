package br.com.fiap.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.bo.ClienteBO;
import br.com.fiap.connection.Conexao;


/**
 * Esta classe manipula a tabela T_DDD_CLIENTE
 * possui m�todos para: Cadastrar, consultar, alterar e excluir
 * @author F�bio Salgarella
 * @author Bob Good
 * @version 1.0
 * @since 1.0
 * @see ClienteBO
 * @see ClienteBeans
 */
public class ClienteDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	/**
	 * Neste m�todo construtor, estabelecemos a comunica��o com o banco
	 * @author F�bio Salgarella
	 * @param n�o possui par�metros
	 * @eturn n�o h� retorno
	 * @throws Exception Chamada da exce��o checked SQLException
	 */
	public ClienteDAO() throws Exception {
		con = new Conexao().conectar();
	}
	/**
	 * Respons�vel por adicionar uma linha na tabela T_DDD_CLIENTE
	 * @param cli Recebe um objeto do ipo Cliente Beans
	 * @return Uma string com a mensagem de confirma��o
	 * @throws Exception Chamada da exce��o checked
	 * @author F�bio Salgarella
	 */
	
	
	public String gravar(Cliente cli) throws Exception{
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_DDD_CLIENTE (NR_CLIENTE, NM_CLIENTE, QT_ESTRELAS, CD_ENDERECO) VALUES (?,?,?,?)");
		
		stmt.setInt(1, cli.getNumero());
		stmt.setString(2, cli.getNome());
		stmt.setInt(3, cli.getQtdeEstrelas());
		stmt.setInt(4, cli.getEndereco().getCodigo());
		stmt.executeUpdate();
		
		return "Cadastrado com Sucesso!";
	}

	//M�TODO consultarPorNumero
		public Cliente consultarPorNumero(int numero) throws Exception{
			stmt = con.prepareStatement
					("SELECT* FROM T_DDD_CLIENTE INNER JOIN T_DDD_ENDERECO ON (T_DDD_CLIENTE.CD_ENDERECO = T_DDD_ENDERECO.CD_ENDERECO) WHERE NR_CLIENTE=?");
			
			stmt.setInt(1, numero);
		
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				return new Cliente
						(rs.getString("NM_CLIENTE"),
						 rs.getInt("NR_CLIENTE"),
						 rs.getInt("QT_ESTRELAS"),
								new Endereco(
										rs.getInt("CD_ENDERECO"),
										rs.getString("DS_LOGRADOURO"),
										rs.getString("NR_ENDERECO"),
										rs.getString("NR_CEP")
										));
			}else {
				return new Cliente();
			}
		}
		
		
		//M�TODO consultarPorNome
		public List<Cliente> consultarPorNome(String nome) throws Exception{
			List<Cliente> lista = new ArrayList<Cliente>();
			stmt = con.prepareStatement
					("SELECT * FROM T_DDD_CLIENTE INNER JOIN ON (T_DDD_CLIENTE.CD_ENDERECO = T_DDD_ENDERECO.CD_ENDERECO) WHERE NM_CLIENTE LIKE ?");
			stmt.setString(1, "%" + nome + "%");
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				lista.add(new Cliente
						(rs.getString("NM_CLIENTE"),rs.getInt("NR_CLIENTE"),rs.getInt("QT_ESTRELAS"),
								new Endereco(
										rs.getInt("CD_ENDERECO"),
										rs.getString("DS_LOGRADOURO"),
										rs.getString("NR_ENDERECO"),
										rs.getString("NR_CEP")
										)));	
			}
				return lista;
			
		}
		
		public Cliente consultarPorEstrela(int estrelas) throws Exception{
			stmt = con.prepareStatement
					("SELECT * FROM T_DDD_CLIENTE INNER JOIN ON (T_DDD_CLIENTE.CD_ENDERECO = T_DDD_ENDERECO.CD_ENDERECO) WHERE QT_ESTRELAS=?");
			stmt.setInt(1, estrelas);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				return new Cliente
						(rs.getString("NM_CLIETE"), rs.getInt("NR_CLIENTE"),rs.getInt("QT_ESTRELAS"),
								new Endereco(
										rs.getInt("CD_ENDERECO"),
										rs.getString("DS_LOGRADOURO"),
										rs.getString("NR_ENDERECO"),
										rs.getString("NR_CEP")
										));
			}else {
				return new Cliente();
			}
		}
		
		public int apagar(int numero) throws Exception {
			stmt = con.prepareStatement("DELETE FROM T_DDD_CLIENTE WHERE NR_CLIENTE=?");
			stmt.setInt(1, numero);
			return stmt.executeUpdate();
		}
		
		public int promover(int numero) throws Exception {
			stmt = con.prepareStatement("UPDATE T_DDD_CLIENTE SET QT_ESTRELAS=QT_ESTRELAS+1 WHERE NR_CLIENTE=?");
			stmt.setInt(1, numero);
			return stmt.executeUpdate();
			
		}
		
		public void fechar() throws Exception {
			con.close();
		}
}
