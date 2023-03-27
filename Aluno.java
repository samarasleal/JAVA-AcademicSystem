package SOOOL;

import java.util.ArrayList;

public class Aluno {
	private String matricula;
	private String nome;
	private String endereco;
	private ArrayList<Turma> listaTurmas = new ArrayList<>();

	public Aluno(String matricula, String nome, String endereco){
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		
	}

	public String getMatricula(){
		return matricula;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getEndereco(){
		return endereco;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	public Turma pesquisaAlunoInscritoNaTurma(int codigoTurma){
            
                for (Turma t : listaTurmas) 
                     if (t.getCodigo() == codigoTurma) {
                return listaTurmas;
                 }
   
                return null;
        }
                
}
