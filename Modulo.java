
package soool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Modulo {
	private String codigo;
	private int quantCreditos;
	private ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
	public Modulo (String codigo, int quantCreditos){ // construtor
		this.codigo = codigo;
		this.quantCreditos = quantCreditos;
	}

	public String getCodigo(){
		return codigo;
	}
        
        public void setCodigo(String codigo){
            this.codigo = codigo;
        }

	public int getQuantCreditos(){
		return quantCreditos;
	}
        
        public void setQuantCreditos(int quantCreditos){
            this.quantCreditos = quantCreditos;
        }
	
        
        public void retornalistaDisciplinas(){ // retorna  a lista de disciplinas
           
           Iterator it = listaDisciplinas.iterator();
           
           while (it.hasNext()){ 
               System.out.print(it); // imprime todos os elementos da lista
           }
        }
        
        public String pesquisaDisciplinaAssociadaModulo(String nome, int cargaHoraria, int quantCreditos){ // pesquisa se uma disciplina já foi associada a um módulo
              
            
            // Já recebe os atributos por parâmetro, não precisa dos inputs
            System.out.println("Digite o nome da disciplina: ");  
            nome = input.nextLine();  
            System.out.println("Digite o nome da disciplina: ");  
            cargaHoraria = input.nextInt();  
            System.out.println("Digite o nome da disciplina: ");  
            quantCreditos = input.nextInt();  
            
            
            for (Disciplina d : listaDisciplinas) {
                // Verificar pelo nome da disciplina que recebe via parâmetro
                 if (d.getCodigo() == codigo) { // verifica se o modulo ja possui a disciplina
                 
                     System.out.println("A disciplina já foi associada a um modulo!!!");
                     return codigo;
                 }
            }
            System.out.println("A disciplina ainda não foi associada a um modulo!!!");
            return null;      
}
        
        
        public void incluiDisciplina(String codigo, String nome, int cargaHoraria, int quantCreditos, int quantMinCreditos){
            // Recebe os dados via parâmetro não precisa dos inputs
            System.out.println("Digite o codigo da disciplina: ");  
            codigo = input.nextLine();  
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
            
           listaDisciplinas.add(new Disciplina(codigo,nome,cargaHoraria,quantCreditos,quantMinCreditos)); // adiciona uma nova disciplina na listaDisciplinas
            
        }
        
       
        public void excluiDisciplina(String codigo){
            System.out.println("Digite o codigo da disciplina a ser removida: ");  
            codigo = input.nextLine();  
            
            for(int i = 0; i < listaDisciplinas.size(); i++){
                Disciplina d = listaDisciplinas.get(i);

                if(d.getCodigo().equals(codigo)){  // compara se o codigo digitado é igual ao codigo da disciplina cadaastrada

                    listaDisciplinas.remove(d); // remove a disciplina da listaDissciplina
                 break;
                }
            }

        }
}