import java.util.ArrayList;

public class Instituicao {
	
	// Atributos
	private String nome;
	private String cidade;
	private String UF;
	// Listas de campus e cursos
	private ArrayList<Campus> listaCampi;
	private ArrayList<Curso> listaCursos;
	
	private Campus campus;
s
	// M�todo Construtor
	public Instituicao(String nome, String cidade, String UF, ArrayList<Campus> listaCampi, ArrayList<Curso> listaCursos) {
		this.nome = nome;
		this.cidade = cidade;
		this.UF = UF;
		this.listaCampi = listaCampi;
                // Campus deve ser criado dentro de Instituição: Relacionamento de composição
		this.listaCursos = listaCursos;
	}
	
	// M�todo utilizado para adicionar um instituto ao campus
	public void adicionarInstituto(Instituto instituto){
		campus.getListaInstituto().add(instituto);
	}
	
	// M�todo utilizado para adicionar um curso ao campus
	public void adicionarCurso(Curso curso){
		listaCursos.add(curso);
	}
	
	// M�todos para atualizar e obter atributos da classe (getters and setters)
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String UF) {
		this.UF = UF;
	}	
	
	public ArrayList<Campus> getListaCampi() {
		return listaCampi;
	}
	public void setListaCampi(ArrayList<Campus> listaCampi) {
		this.listaCampi = listaCampi;
	}
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}
	
}
