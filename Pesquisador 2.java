import java.util.ArrayList;

public class Pesquisador extends Professor{	
	// Declaracao de variavel //
	private int cargaHoraria;
	// Declarando uma lista do tipo Projeto // 
	private ArrayList <Projeto> listaProjetos;	
	// Metodo construtor //
	public Pesquisador(String nome, String titulacao, String CPF, int cargaHoraria) {
		super(nome, titulacao, CPF);
		this.cargaHoraria = cargaHoraria;
		listaProjetos = new ArrayList<Projeto>();
	}
	// Getter and Setter //
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	// Metodo para adicionar projeto a lista //
	public void addProjeto(Projeto projeto) {
		listaProjetos.add(projeto);
	}
	// NÃO FAZ SENTIDO USAR O CPF //
	public boolean pesquisaProjeto(String CPF, String nomeProjeto) {
		if(cargaHoraria == 0) {
			return false;
		}
		else {
			for(Projeto p: listaProjetos) {
				if(p.getNome().equalsIgnoreCase(nomeProjeto)) {
					return true;
				}
				else {
					return false;
				}
			}
		}
	}
}
