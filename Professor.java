package SOOL;

public class Professor {
	private String Nome;
	private String Titulacao;
	private String Cpf;
	
	public Professor(String Nome, String Titulacao, String Cpf) {
		this.Nome = Nome;
		this.Titulacao = Titulacao;
		this.Cpf = Cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTitulacao() {
		return Titulacao;
	}

	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
}
