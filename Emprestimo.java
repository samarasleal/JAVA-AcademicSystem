
package soool;

import java.util.ArrayList;
import java.util.Date;


public class Emprestimo {
	private Date dataEmp;
	private Date dataDev;
        ArrayList<Aluno> a = new ArrayList();
        ArrayList<Livro> l = new ArrayList();

	public Emprestimo (Date dataEmp, Date dataDev){
		this.dataEmp = dataEmp;
		this.dataDev = dataDev;
	}

	public Date getDataEmp(){
		return dataEmp;
	}

	public void setDataEmp(Date dataEmp){
		this.dataEmp = dataEmp;
	}

	public Date getDataDev(){
		return dataDev;
	}

	public void setDataDev(Date dataDev){
		this.dataDev = dataDev;
	}
        
        public void pesquisarAlunosPegaramLivros(String tituloLivro, String matricula){
                
            /*System.out.print("Digite a matricula do aluno: ");
            matricula = a.nextLine();  
            
            System.out.print("Digite o titulo do livro");
            tituloLivro = l.nextLine();
            
             for (Aluno d : a) {
                 if (d.Aluno.getMatricula() == a){ 
                    
                    
                    
                     
                 }
                 else
                     System.out.print("O aluno não possui cadaastrado no sistema");
        
             }*/
        }
        
        public void pesquisarLivroEmprestado(){
            
        }
        
        // Falou a implementação do método
}