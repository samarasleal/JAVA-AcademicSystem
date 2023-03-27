import java.util.ArrayList;

public class Projeto {
	// Declaracao de variavel //
	private String nome, descricao;
	// Declarando uma lista do tipo Curso //
	private ArrayList<Curso> listaCursos;	
	// Metodo construtor //
	public Projeto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.listaCursos = new ArrayList<Curso>();
	}
	// Getters and Setters //
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}	
	// Metodo para adicionar um novo curso //
	public void addCurso(Curso curso) {
		this.listaCursos.add(curso);
	}	
}
