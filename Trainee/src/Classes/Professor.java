package Classes;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Professor extends Pessoa {

	BD bd = new BD();
	private String registro;
	public boolean status;

	public Professor() {
		this("Não informado", "Não Informado", "Não Informado", "xxx.xxx.xxx-xx", "00 00000-0000", "00/00/0000",
				"Não Informado", "Não Informado");
	}

	public Professor(String registro, String nome, String email, String cpf, String telefone, String data_nasc,
			String usuario, String senha) {

		super(nome, email, cpf, telefone, data_nasc, usuario, senha);

		this.setRegistro(registro);

	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public void cadastrar_p(String info) {
		try

		{
			Connection connection;
			connection = (Connection) DriverManager.getConnection(bd.servidor, bd.usuario, bd.senha);
			// ESTABELECENDO O ACESSO
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("INSERT INTO professor VALUES(" + info + ")");
			statement.close();
			connection.close();
			status = true;
		}catch(
		SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
