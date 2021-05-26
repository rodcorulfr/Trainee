package Classes;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class BD {

	protected Connection connection = null;
	protected Statement statement = null;
	public ResultSet result = null;

	// Atriutos necessários
	public boolean acesso;
	String servidor = "jdbc:mysql://localhost:3306/colinf";
	String usuario = "root";
	String senha = "";
	String driver = "com.mysql.jdbc.Driver";

	// CONECTA
	public void conectar() {

		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	// VERIFICA SE TÁ CONECTADO AO BANCO DE DADOS OU NÃO
	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {
			return false;
		}
	}

	public void Login_t(String tabela, String usuario, String senha) throws SQLException {
		try {
			result = statement.executeQuery("SELECT usuario , senha, matricula FROM " + tabela + " where usuario ='"
					+ usuario + "'and senha = '" + senha + "'");
			if (result.next()) {
				gravar_id_trainee();
				acesso = true;
			} else {
				acesso = false;
			}
			this.desconectar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void Login_p(String tabela, String usuario, String senha) throws SQLException {
		try {
			result = statement.executeQuery("SELECT usuario , senha, registro FROM " + tabela + " where usuario ='"
					+ usuario + "'and senha = '" + senha + "'");
			if (result.next()) {
				gravar_id_professor();
				acesso = true;
			} else {
				acesso = false;
			}
			this.desconectar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void trazer(String tabela, String ordem) {
		try {
			String query = "SELECT * FROM " + tabela + " ORDER BY " + ordem;
			this.result = this.statement.executeQuery(query);

			/*
			 * while (this.result.next()) { }
			 */
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

	public void trazerWH(String tabela, String wh) throws SQLException {

		Laboratorio lab = new Laboratorio();

		String query = "SELECT * FROM " + tabela + " WHERE id_lab = " + wh;
		System.out.println("SELECT * FROM " + tabela + " WHERE id_lab =" + wh);
		this.result = this.statement.executeQuery(query);

	}

	public String[] trazer_nome_trainee() {
		try {
			int num = 0;
			String[] trainee = null;
			Statement statement = (Statement) connection.createStatement();
			result = statement.executeQuery("SELECT COUNT(nome) FROM trainee");
			if (result.next()) {
				num = Integer.parseInt(result.getString("COUNT(nome)"));
				trainee = new String[num];
			}
			result = statement.executeQuery("SELECT nome from trainee");

			while (result.next()) {
				System.out.println("Linha: " + result.getRow());
				trainee[result.getRow() - 1] = result.getString("nome");
			}

			statement.close();
			connection.close();
			return trainee;
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			return null;
		}

	}

	public void inserir(String tabela, String dados) {
		try {
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("INSERT INTO " + tabela + " VALUES (" + dados + ")");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Deu merda");
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void editar(String tabela, String alterar, String condicao) {
		try {
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("UPDATE " + tabela + " SET " + alterar + " WHERE " + condicao);
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void apagar(String tabela, String info) {
		try {
			conectar();
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("DELETE FROM " + tabela + " WHERE " + info);
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void apagar_atual(String tabela) {
		try {
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("DELETE FROM " + tabela);
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// DESCONECTA
	public void desconectar() {
		try {
			this.connection.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void gravar_id_trainee() {
		try {
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement
					.executeUpdate("INSERT INTO online_trainee VALUES(" + result.getString("matricula") + ")");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void gravar_id_professor() {
		try {
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement
					.executeUpdate("INSERT INTO online_prof VALUES(" + result.getString("registro") + ")");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void gravar_chamado(int id_lab) {
		try {
			result = statement.executeQuery(
					"SELECT nome, registro FROM professor INNER JOIN online_prof ON online_prof.identificacao = professor.registro");
			if (result.next()) {
				acesso = true;
				System.out.println(result.getString("nome"));
				Statement statement = (Statement) connection.createStatement();
				System.out.println("INSERT INTO chamado VALUES(" + result.getString("registro") + ",'"
						+ result.getString("nome") + "'," + id_lab + ", false)");
				int resultado = statement.executeUpdate("INSERT INTO chamado VALUES(" + result.getString("registro")
						+ ",'" + result.getString("nome") + "'," + id_lab + ", 'false')");
				statement.close();
				connection.close();
			} else {
				acesso = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verificar_chamado() {
		int resposta = 0;
		try {
			result = statement.executeQuery("SELECT * FROM chamado WHERE status = 'false'");
			if (result.next()) {
				System.out.println(result.getString("nome_prof"));
				resposta = JOptionPane.showConfirmDialog(null, "Profesor " + result.getString("nome_prof") + ""
						+ "\nestá solicitando sua presença no \nlaboratório " + result.getString("id_lab"));
			}
			if (resposta == JOptionPane.YES_OPTION) {
				try {
					Statement statement = (Statement) connection.createStatement();
					int resultado = statement
							.executeUpdate("UPDATE chamado SET status = 'true' WHERE status = 'false' AND nome_prof = '"
									+ result.getString("nome_prof") + "'");
					statement.close();
					connection.close();
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Nenhum chamado no momento");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Nenhum chamado no momento");
		}
	}

	public void perfil() {
		try {
			result = statement.executeQuery(
					"SELECT * FROM trainee INNER JOIN online_trainee ON online_trainee.matricula = trainee.matricula");

			if (result.next()) {
				acesso = true;
			} else {
				acesso = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void inserir_dados_email(String titulo) {
		this.conectar();
		try {
			result = statement.executeQuery("SELECT * FROM chat WHERE titulo = '" + titulo.trim() + "'");
			System.out.println("SELECT * FROM chat WHERE titulo = '" + titulo.trim() + "'");
			if (result.next()) {
				System.out.println("Tem valor no bd");
				System.out.println("BD poha : " + result.getString("titulo"));
			} else {
				acesso = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
