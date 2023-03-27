import java.util.ArrayList;

public class Projeto {
	
	// Atributos
	private String nome;
	private String descricao;
	// Lista de cursos
	private ArrayList<Curso> listaCursos;
	
	// Método Construtor
	public Projeto(String nome, String descricao, ArrayList<Curso> listaCursos) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.listaCursos = listaCursos;
	}
	
	// Método utilizado para adicionar um curso de atuação ao projeto
	public void adicionarCurso(Curso curso){
		this.listaCursos.add(curso);
	}
	
	// Métodos para atualizar e obter atributos da classe (getters and setters)
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
	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}
	
}
