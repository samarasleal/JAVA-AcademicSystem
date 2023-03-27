package Telas;

import java.util.*;

public class TurmaExtensao extends Turma {

    private Date dataInicio;
    private Date dataFim;
    private ArrayList <Extensao> listaExtensaoCiclo = new ArrayList <Extensao>();

    //Construtor
    public TurmaExtensao(int codSequencia, Date dataInicio, Date dataFim) {
        super(codSequencia);
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;

    }
    /*Método para identificar se um aluno já está na turma. Parâmetros: nome e endereço.
     Se encotrado, retorna sua matrícula, senão retorna null.
     A listaAlunos dever ser acessada diretamente*/
    
    public String IdentificarAluno(String nome, String endereco){
        for(int i = 0; i < getListaAlunos().size(); i++){
            if(nome.equalsIgnoreCase(getListaAlunos().get(i).getNome())){
                return this.getListaAlunos().get(i).getMatricula();
            }
            else{
                return null;
            }
        }
        return null;
    }  
        //não sei como acessas a listaAlunos se alguem puder arrumar isso 
    

    //Métodos para alterar e obter os atributos local, dataInicio dataFim
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void AlterarDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void AlterarDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Extensao> getListaExtensaoCiclo() {
        return listaExtensaoCiclo;
    }

    public void setListaExtensaoCiclo(ArrayList<Extensao> listaExtensaoCiclo) {
        this.listaExtensaoCiclo = listaExtensaoCiclo;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    
}
