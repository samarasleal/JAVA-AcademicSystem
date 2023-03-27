import java.util.ArrayList;

public class Pesquisador extends Professor{
	
	// Atributos
	private int cargaHoraria;
	// Lista de projetos
	private ArrayList<Projeto> listaProjetos;

	// M�todo Construtor
	public Pesquisador(int cargaHoraria, ArrayList<Projeto> listaProjetos, String nome, String titulacao, String CPF) {
		super(nome, titulacao, CPF);
		this.cargaHoraria = cargaHoraria;
		this.listaProjetos = listaProjetos;
	}	
	
	// M�todo para adicionar um projeto para o pesquisador
	public void adicionarProjeto(Projeto projeto, String nome, String descricao, ArrayList<Curso> listaCursos){
		projeto = new Projeto(nome, descricao, listaCursos);
                // Porque criar projeto aqui se já esta passando ele por parâmetro?
		listaProjetos.add(projeto);
	}
	
	// M�todo para pesquisar se um pesquisador est� alocado em um determinado projeto
	public boolean buscarPesquisador(String CPF, String nomeProjeto){
		if(getCargaHoraria() == 0){			
			return false;
		}else{
			for(int i = 0; i < listaProjetos.size(); i++){
				if(getCPF().equals(CPF)){
					return true;
				}
			}
			return false;
		}
	}

	// M�todos para atualizar e obter atributos da classe (getters and setters)
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public ArrayList<Projeto> getListaProjetos() {
		return listaProjetos;
	}
	public void setListaProjetos(ArrayList<Projeto> listaProjetos) {
		this.listaProjetos = listaProjetos;
	}	
	
}
