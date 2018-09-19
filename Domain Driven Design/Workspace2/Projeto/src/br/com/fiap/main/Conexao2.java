package br.com.fiap.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.fiap.connection.Conexao;
import br.com.fiap.exception.Excecao;

public class Conexao2 {
	public static void main(String[] args) /* throws SQLException */ {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
		con = new Conexao().conectar();
		System.out.println("Abriu conexão");
		stmt = con.prepareStatement("select * from T_DDD_CLIENTE where NR_CLIENTE =? AND NM_CLIENTE=?");
		String nome=JOptionPane.showInputDialog("Digite o nome para pesquisa").toUpperCase();
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		stmt.setInt(1, numero);
		stmt.setString(2, nome);
		rs = stmt.executeQuery();
			if(rs.next()) {
				System.out.println("Logado com Sucesso...");
				System.out.println(rs.getString("NM_CLIENTE"));
				System.out.println(rs.getInt("NR_CLIENTE"));
				System.out.println(rs.getInt("QT_ESTRELAS"));
			}else {
				System.out.println("Não foi possível logar...");
			}
		}catch(Exception e) {
			//1º Momento - testando
			e.printStackTrace();
			//2º Momento - sistema já foi homologado
			System.out.println(Excecao.tratarExcecao(e));
		}finally {
			try {
			con.close();
			}catch(Exception e){
				//1º Momento - testando
				e.printStackTrace();
				//2º Momento - sistema já foi homologado
				System.out.println(Excecao.tratarExcecao(e));
			}
		}
	}

}
