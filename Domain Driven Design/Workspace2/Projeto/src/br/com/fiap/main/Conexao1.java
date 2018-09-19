package br.com.fiap.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.fiap.exception.Excecao;

public class Conexao1 {
	public static void main(String[] args) /* throws SQLException */ {
		Connection conexao = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		try {
		conexao = DriverManager.getConnection(url,"SYSTEM","4682500");
		System.out.println("Abriu conex�o");
		stmt = conexao.createStatement();
		String nome=JOptionPane.showInputDialog("Digite o nome para pesquisa").toUpperCase();
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero"));
		rs = stmt.executeQuery("select * from T_DDD_CLIENTE where NR_CLIENTE = "+numero+" and NM_CLIENTE = '"+nome+"'");
			if(rs.next()) {
				System.out.println("Logado com Sucesso...");
				System.out.println(rs.getString("NM_CLIENTE"));
				System.out.println(rs.getInt("NR_CLIENTE"));
				System.out.println(rs.getInt("QT_ESTRELAS"));
			}else {
				System.out.println("N�o foi poss�vel logar...");
			}
		
		/*while (rs.next()) {
			System.out.println(rs.getString("NM_CLIENTE"));
			System.out.println(rs.getInt("NR_CLIENTE"));
			System.out.println(rs.getInt("QT_ESTRELAS"));
		}
		*/
		//conexao.close();
		}catch(Exception e) {
			//1� Momento - testando
			e.printStackTrace();
			//2� Momento - sistema j� foi homologado
			System.out.println(Excecao.tratarExcecao(e));
		}finally {
			try {
			conexao.close();
			}catch(Exception e){
				//1� Momento - testando
				e.printStackTrace();
				//2� Momento - sistema j� foi homologado
				System.out.println(Excecao.tratarExcecao(e));
			}
		}
	}

}
