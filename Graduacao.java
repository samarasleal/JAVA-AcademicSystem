package Telas;

import java.util.*;

public class Graduacao extends Curso {

    private String turno;
    private ArrayList<Ciclo> listaCiclo = new ArrayList<Ciclo>();

    //Constructor
    public Graduacao(String codigo, String nome, String turno, String turno2) {
        super(codigo, nome, turno);
        turno = turno2;
    }

    /*Método para pesquisar se um Período, no caso de curso de graduação, já foi adicionado na Lista de
    Ciclos.Parâmetros
    : número para busca por período.O retorno é o objeto procurado
    . Observe que o ArrayList listaCiclo deve ser acessada diretamente por este método
     */
    public Ciclo pesquisarPeriodo(int periodo) {
        for (int i = 0; i < this.getListaCiclo().size(); i++) {
            if (periodo == this.getListaCiclo().get(i).getPeriodo()) {
                return this.getListaCiclo().get(i);
                //Codigo apenas rodará se a classe curso tiver o arraylist
                //ListaCiclos. Diferentemente disto, esta classe a possui 
                //e seus respectvos gets e sets
            } else {
                System.out.println("Periodo não encontrado");
                return null;
            }

        }
        return null;
    }

    //Getters e Setters
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Ciclo> getListaCiclo() {
        return listaCiclo;
    }

    public void setListaCiclo(ArrayList<Ciclo> listaCiclo) {
        this.listaCiclo = listaCiclo;
    }

}
