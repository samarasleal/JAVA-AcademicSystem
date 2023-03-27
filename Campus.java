import java.util.ArrayList;

public class Campus {
	
	// Atributos
	private int nome;
	private int quantBlocos;
	// Lista de institutos
	private ArrayList<Instituto> listaInstituto;
	
	// M�todo Construtor
	public Campus(int nome, int quantBlocos, ArrayList<Instituto> listaInstituto) {
                // Porque chamou super??
		super();
		this.nome = nome;
		this.quantBlocos = quantBlocos;
		this.listaInstituto = listaInstituto;
	}
	
	// M�todo utilizado para adicionar um instituto ao campus
	public void adicionarInstituto(Instituto instituto){
		listaInstituto.add(instituto);
	}

	// M�todos para atualizar e obter atributos da classe (getters and setters)
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	public int getQuantBlocos() {
		return quantBlocos;
	}
	public void setQuantBlocos(int quantBlocos) {
		this.quantBlocos = quantBlocos;
	}

	public ArrayList<Instituto> getListaInstituto() {
		return listaInstituto;
	}
	public void setListaInstituto(ArrayList<Instituto> listaInstituto) {
		this.listaInstituto = listaInstituto;
	}	
	
}
