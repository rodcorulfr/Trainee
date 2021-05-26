package Classes;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Email {

	private String nome_remt;
	private String nome_dest;
	private String titulo;
	private String corpo;
	private String data;
	private String hora;
	private String abert_fechad;
	private String prioridade;
	private String[] info;

	BD bd = new BD();
	public boolean status;
	
	
	public Email() {
		this("Não Informado", "Não Informado", "Não Informado", "Não Informado", "XXxx/XX/XX", "XX:XX", "Não Informado",
				"Não Informado");
	}

	public Email(String nome_remt, String nome_dest, String titulo, String corpo, String data, String hora,
			String abrt_fechad, String prioridade) {
		// TODO Auto-generated constructor stub
		this.setNome_remt(nome_remt);
		this.setNome_dest(nome_dest);
		this.setTitulo(titulo);
		this.setCorpo(corpo);
		this.setData(data);
		this.setHora(hora);
		this.setAbert_fechad(abrt_fechad);
		this.setPrioridade(prioridade);

	}

	public String getNome_remt() {
		return nome_remt;
	}

	public void setNome_remt(String nome_remt) {
		this.nome_remt = nome_remt;
	}

	public String getNome_dest() {
		return nome_dest;
	}

	public void setNome_dest(String nome_dest) {
		this.nome_dest = nome_dest;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAbert_fechad() {
		return abert_fechad;
	}

	public void setAbert_fechad(String abert_fechad) {
		this.abert_fechad = abert_fechad;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	
	public String[] getInfo() {
		return info;
	}

	public void setInfo(String[] info) {
		this.info = info;
	}

	public void enviarEmail(String info) {

		try
		{
			Connection connection;
			connection = (Connection) DriverManager.getConnection(bd.servidor, bd.usuario, bd.senha);
			// ESTABELECENDO O ACESSO
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("INSERT INTO chat VALUES(" + info + ")");
			statement.close();
			connection.close();
			status = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void pegarRemetente(){
	
		try {
			String aux = null;
			Connection connection;
			connection = (Connection) DriverManager.getConnection(bd.servidor, bd.usuario, bd.senha);
			Statement statement = (Statement) connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM online_prof");
			if(result.next()){
				aux = result.getString(1);
			}
			result = statement.executeQuery("SELECT * FROM professor");
			while(result.next()){
				if(result.getString("registro").equals(aux)){
					this.setNome_remt(result.getString("nome"));
					break;
				}
			}
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public String[] trazerEmail() {
		try{
			Connection connection;
			connection = (Connection) DriverManager.getConnection(bd.servidor, bd.usuario, bd.senha);
			Statement statement = (Statement) connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM online_trainee");
			String matriculaON = null;
			String traineeON = null;
			
			if(result.next()){
				matriculaON = result.getString(1);
			}
			
			result = statement.executeQuery("SELECT * FROM trainee");
			while(result.next()){
				if(matriculaON.equals(result.getString("matricula"))){
					traineeON = result.getString("nome");
				}
			}
			
			result = statement.executeQuery("SELECT COUNT(titulo) FROM chat WHERE nome_dest = '"+traineeON+"'");
			if(result.next()){
				info = new String[result.getInt("COUNT(titulo)")];
			}
			
			result = statement.executeQuery("SELECT * from chat");
			
			while(result.next()){
				if(result.getString(2).equals(traineeON)){
					String titulo = result.getString("titulo");
					this.info[result.getRow()-1] = String.format("%-30s", titulo);
					
					
				}
			}
			
			
			
			
			statement.close();
			connection.close();
			return info;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}

}
