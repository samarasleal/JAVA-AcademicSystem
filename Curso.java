
import java.util.ArrayList;


public class Curso {
    
	private String codigo;
	private String nome;
	private String turno;
	private static ArrayList<Aluno> ListaAlunos;
	private static ArrayList<Instituicao> ListaInstituicoes;
	private static ArrayList<Projeto> ListaProjetos;

	public Curso(String codigo, String nome, String turno) {
		this.codigo = codigo;
		this.nome = nome;
		this.turno = turno;
		this.ListaAlunos = new ArrayList<Aluno>();
		this.ListaInstituicoes = new ArrayList<Instituicao>();
		this.ListaProjetos = new ArrayList<Projeto>(); 
        }

    //Metodos GET e SET
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList getListaAlunos() {
        return ListaAlunos;
    }

    public void setListaAlunos(ArrayList ListaAlunos) {
        this.ListaAlunos = ListaAlunos;
    }

    public ArrayList getListaInstituicoes() {
        return ListaInstituicoes;
    }

    public void setListaInstituicoes(ArrayList ListaInstituicoes) {
        this.ListaInstituicoes = ListaInstituicoes;
    }

    public ArrayList getListaProjetos() {
        return ListaProjetos;
    }

    public void setListaProjetos(ArrayList ListaProjetos) {
        this.ListaProjetos = ListaProjetos;
    }

    public static void IncluirAlunos() {
        
            for (int i = 0; i < ListaAlunos.size(); i++) {
                    ListaAlunos.add(i);
    }
 }
    
    public static void ExcluirAlunos(String excluirAluno) {
        
           for (int i = 0; i < ListaAlunos.size(); i++) {
                    ListaAlunos.remove (i);
                    
           }
     }

     public static void IncluirInstituicao() {   
         
            for (int i = 0; i < ListaInstituicoes.size(); i++) {
                    ListaInstituicoes.add(i);                    
    }
            
      }
  
     public static void ExcluirInstituicao() {  
         
            for (int i = 0; i < ListaInstituicoes.size(); i++) {
                    ListaInstituicoes.remove(i);
            }
     }
   
     public static void IncluirProjeto() {
         
	    for (int i = 0; i < ListaProjetos.size(); i++) {
                              ListaProjetos.add(i);
     }
            
     }
   
     public static void ExcluirProjeto() {
         
	    for (int i = 0; i < ListaProjetos.size(); i++) {
                        ListaProjetos.remove(i);
            }
     }
}