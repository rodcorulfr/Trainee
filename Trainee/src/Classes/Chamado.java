package Classes;

public class Chamado {

	private int lab;
	private int qtd_pc;
	private String status;
	private String prioridade;
	private String descricao;

	public Chamado() {
		this(0, 0, "Não informado", "Não informado", "Não informado");
	}

	public Chamado(int lab, int qtd_pc, String status, String prioridade, String descricao) {
		// TODO Auto-generated constructor stub

		this.setLab(lab);
		this.setQtd_pc(qtd_pc);
		this.setStatus(status);
		this.setPrioridade(prioridade);
		this.setDescricao(descricao);
	}

	public int getLab() {
		return lab;
	}

	public void setLab(int lab) {
		this.lab = lab;
	}

	public int getQtd_pc() {
		return qtd_pc;
	}

	public void setQtd_pc(int qtd_pc) {
		this.qtd_pc = qtd_pc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
