import java.util.ArrayList;

public class Coordenador extends Professor{
	// Declaracao de variaveis //
	private int cargaHoraria;
	// Declarando varivel do Tipo Emprestimo //
	private Emprestimo bonus;
	// Lista do tipo Instituo e Curso //
	private ArrayList<Instituto> ListaInstitutos;
	private ArrayList<Curso> ListaCursos;
	// Construtor //
	public Coordenador(String nome, String titulacao, String CPF, int cargaHoraria, Emprestimo bonus) {
		super(nome, titulacao, CPF);
		this.cargaHoraria = cargaHoraria;
		this.bonus = bonus;
		this.ListaInstitutos = new ArrayList<Instituto>();
		this.ListaCursos = new ArrayList<Curso>();
	}
	// Getter and Setter //
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Emprestimo getBonus() {
		return bonus;
	}
	public void setBonus(Emprestimo bonus) {
		this.bonus = bonus;
	}
	// Adicionar um novo instituto //
	public void addInstituto(Instituto instituto) {
		this.ListaInstitutos.add(instituto);
	}
	// Retorna uma lista de curso do turno da noite, vinculadas a esse coordenador //
	public ArrayList<Curso> listarCursosNoite(){
		ArrayList<Curso> cursosNoite = new ArrayList<Curso>();
		for(Curso p: ListaCursos) {
			if(p.getTurno.equalsIgnoreCase("noite")) {
				cursosNoite.add(p);
			}
		}
		return cursosNoite;
	}
}
