package Telas;
import java.util.*;
public class Extensao extends Curso {

    private int cargaHoraria;
    private ArrayList <Turma> listaExtensaoCiclo = new ArrayList <Turma>();

    // Constructor
    public Extensao(String codigo, String nome, String turno, int cargaHoraria) {
        super(codigo, nome, turno);
        this.cargaHoraria = cargaHoraria;
    }

    /*
	 * Método para pesquisar se uma Turma (curso de extensão) já foi adicionado em
	 * listaExtensaoCiclo. Parâmetros: nome do curso por turma de extensão. O
	 * retorno é o objeto procurado
     */
    public Turma procurarTurma(String nomeCurso) {

        for (int i = 0; i < this.getListaExtensaoCiclo().size(); i++) { // Compara o nome passado por parametro com todos
            // os nomes de cursos de cada objeto no
            // ArrayList
            //Para este metodo funcionar, é necessário que a classe Turma tenha um 
            //atributo do tipo Curso!
            //Se não tiver, não será possível procurar a turma por um nome de curso...
            if (this.getListaExtensaoCiclo().get(i).getCurso().getNome().equalsIgnoreCase(nomeCurso)) {
                return this.getListaExtensaoCiclo().get(i);
            }
        }
        System.out.println("Turma não encontrada.");
        return null;
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Turma> getListaExtensaoCiclo() {
        return listaExtensaoCiclo;
    }

    public void setListaExtensaoCiclo(ArrayList<Turma> listaExtensaoCiclo) {
        this.listaExtensaoCiclo = listaExtensaoCiclo;
    }
    
    
}
