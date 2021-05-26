package Classes;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Trainee extends Pessoa {

	BD bd = new BD();
	private String matricula;
	private String dia_servico;
	public boolean status;

	public Trainee() {
		this("Não Informado", "Não Informado", "xxx.xxx.xxx-xx", "00 00000-0000", "00/00/0000", "Não Informado",
				"Não Informado", "Não informado", "Não informado");
	}

	public Trainee(String matricula, String dia_serv, String nome, String email, String cpf, String telefone,
			String data_nasc, String usuario, String senha) {

		super(nome, email, cpf, telefone, data_nasc, usuario, senha);

		this.setMatricula(matricula);
		this.setDia_servico(dia_serv);

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDia_servico() {
		return dia_servico;
	}

	public void setDia_servico(String dia_servico) {
		this.dia_servico = dia_servico;
	}

	public void Cadastrar(String info) {

		try {
			Connection connection;
			connection = (Connection) DriverManager.getConnection(bd.servidor, bd.usuario, bd.senha);
			// ESTABELECENDO O ACESSO
			Statement statement = (Statement) connection.createStatement();
			int resultado = statement.executeUpdate("INSERT INTO trainee VALUES(" + info + ")");
			statement.close();
			connection.close();
			status = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
