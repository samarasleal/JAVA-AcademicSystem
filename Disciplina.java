
package soool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;


public class Disciplina {
	private String codigo;
	private String nome;
	private int cargaHoraria;
	private int quantCreditos;
	private int quantMinCreditos;
	private ArrayList<Turma> listaTurma = new ArrayList<>();
        Scanner input = new Scanner(System.in);
	
	public Disciplina (String codigo, String nome, int cargaHoraria, int quantCreditos, int quantMinCreditos){
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.quantCreditos = quantCreditos;
		this.quantMinCreditos = quantMinCreditos;
	}

	public String getCodigo(){
		return codigo;
	}

	public String getNome(){
		return nome;
	}

	public int getCargaHoraria(){
		return cargaHoraria;
	}

	public int getQuantCreditos(){
		return quantCreditos;
	}

	public int getQuantMinCreditos(){
		return quantMinCreditos;
	}


	public void adicionaTurmaExtensao(Date dataInicio, Date dataFim, int codSequencia) throws ParseException {
            System.out.println("Digite a data de inicio: ");
            
           
 
           DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
           Date date = (Date)formatter.parse("01/29/02");
 
            
       
            
            System.out.println("Digite o nome da disciplina: ");  
            nome = input.nextLine();  
            System.out.println("Digite a carga horaria da disciplina: ");  
            cargaHoraria = input.nextInt();
            System.out.println("Digite a quantidade de creditos da disciplina: ");  
            quantCreditos = input.nextInt();  
            System.out.println("Digite a quantidade minima de creditos da disciplina: ");  
            quantMinCreditos = input.nextInt();  
            
            System.out.println("Codigo da disciplina: " + codigo);
            System.out.println("Nome da disciplina: " + nome);
            System.out.println("Carga horaria da disciplina: " + cargaHoraria);
            System.out.println("Quantidade Minima de Creditos: " + quantMinCreditos);
            
           listaTurma.add(new Turma(3, "codSequencia")); // adiciona uma nova turma de extensao
            
        }
        
        public void adicionaTurmaGraduacao(int semestre, int ano, int codSequencia) throws ParseException{
            System.out.println("Digite a data de inicio: ");
            
           
 
           DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
           Date date = (Date)formatter.parse("01/29/02");
 
            
       
            
            System.out.println("Digite o nome da disciplina: ");  
            nome = input.nextLine();  
            System.out.println("Digite a carga horaria da disciplina: ");  
            cargaHoraria = input.nextInt();
            System.out.println("Digite a quantidade de creditos da disciplina: ");  
            quantCreditos = input.nextInt();  
            System.out.println("Digite a quantidade minima de creditos da disciplina: ");  
            quantMinCreditos = input.nextInt();  
            
            System.out.println("Codigo da disciplina: " + codigo);
            System.out.println("Nome da disciplina: " + nome);
            System.out.println("Carga horaria da disciplina: " + cargaHoraria);
            System.out.println("Quantidade Minima de Creditos: " + quantMinCreditos);
            
           listaTurma.add(new Turma(3, "codSequencia")); // adiciona uma nova turma de graduacao
        }
        
	public void removeTurma(String codigo){
             System.out.println("Digite o codigo da Turma a ser removida: ");  
             codigo = input.nextLine();  
            
            for(int i = 0; i < listaTurma.size(); i++){
                Turma t = listaTurma.get(i);

                if(t.getCodigo().equals(codigo)){  // compara se o codigo digitado é igual ao codigo da disciplina cadaastrada

                    listaTurma.remove(t); // remove a disciplina da listaDissciplina
                 break;
                }
            }
	}

	public void verificaTurma(int semestre, int ano){
            
            System.out.println("Digite o semestre da turma: ");  
            semestre = input.nextInt();  
            System.out.println("Digite o ano da turma: ");  
            ano = input.nextInt();
            
            for (Turma t : listaTurma) {
                 if (t.getCodigo() == codigo) { // verifica se o modulo ja possui a disciplina
                 
                     System.out.println("A turma já está na lista de turmas de uma disciplina");
                     System.out.println("Semestre: " + semestre + "\n  Ano: " + ano);
                     
                 }
                 
            }
            
                  
        }
            
	

	public void retornaQuantTurmas(){
                Iterator it = listaTurma.iterator();
           
           while (it.hasNext()){ 
               System.out.print(it); // imprime todos os elementos da lista
           }
           // Deve retornar o total de objetos de turma
        }
}

