package Classes;

public class Pessoa {

	protected String nome;
	protected String email;
	protected String cpf;
	protected String telefone;
	protected String data_nasc;
	protected String usuario;
	protected String senha;

	public Pessoa() {
		this("Não Informado", "Não Informado", "xxx.xxx.xxx-xx", "00 00000-0000", "00/00/0000", "Não Informado",
				"Não Informado");
	}

	public Pessoa(String nome, String email, String cpf, String telefone, String data_nasc, String usuario,
			String senha) {
		this.setNome(nome);
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
