import java.util.ArrayList;

public class Instituto {
	// Declaracao de variaveis //
	private String sigla, nome;
	// Declarando uma lista do tipo Coordenador //
	private List<Coordenador> listaCoordenadores;	
	// Metodo construtor //
	public Instituto(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
		this.listaCoordenadores = new ArrayList<Coordenador>();		
	}
	// Getter and Setter //
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	// Metodo para instanciar um novo coordenador e adiciona-lo em uma lista //
	public void addCoordenador(String nome, String titulacao, String CPF, int cargaHoraria, Emprestimo bonus) {
		Coordenador c = new Coordenador(nome, titulacao, CPF, cargaHoraria, bonus);
		listaCoordenadores.add(c);
	}
}
