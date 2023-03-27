/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIMG
 */
public class Turma extends Aluno {
    // Turma não é subclasse de Aluno. Turma tem uma lista de alunos. Tirar o extends
    
    private int codigoSequencia ;
    // valor inicial de codigoSequencia é 1
    // E o atributo listaAluno?

    public int getCodigoSequencia() {
        return codigoSequencia;
    }
    
    
    protected Turma(int codSequencia, String Nome, String Matricula, String Endereco){
        super(Matricula, Nome, Endereco);
        this.codigoSequencia = codSequencia;
    }
    
     public void adicionarAluno(Aluno aluno){
         // Tinha que incluir em uma lista de alunos (atributo que não foi criado)
        this.aluno.inserir(aluno);
    }
    
    public void AdicionarAluno(Aluno aluno){
        // Dois método iguais?
        this.aluno.inserir(aluno);
    } 
    
    // E o método para remover aluno da lista?
     
    public Aluno[] listaAluno(){
        Aluno[] alunos = (Aluno[])this.aluno.get();
        return alunos;
    }
    
    public String AlterarCodigo(String NovoCodigo, String getcodigoSequencia){
    getcodigoSequencia = NovoCodigo;
    return NovoCodigo;
    
        
    }
}
