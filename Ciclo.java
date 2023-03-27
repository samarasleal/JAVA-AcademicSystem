import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ciclo {
	
	int Listademodulos;
	String codigo;
	String quantCreditos;
        
        // E o atributo descTema? 
        // E os métodos gets e sets?
        // E o método para pesquisar se um módulo esta associado a um ciclo e para incluir um módulo no ciclo?
	
	Scanner input = new Scanner(System.in);
	private static ArrayList<Ciclo> CriarLista;
	
	public static ArrayList<Ciclo> getCriarLista() {
		return CriarLista;
	}
	
	public ArrayList<Ciclo> iniciarLista() {
		return CriarLista;
	}
	
	public ArrayList<Ciclo> RetornarLista() {
		return CriarLista;
	}

	public ArrayList<Ciclo> ModuloRepetido() {
		if (codigo == codigo) {
                    // De onde vem o código?
			System.out.printf("Lista repetida.");
		}

		else if (codigo != codigo) {
			return CriarLista;
		}
		
		return null;
	}

	public void ExcluirLista() {
                // Deveria receber o código via passagem de parâmetro
		System.out.printf("Digite o codigo de qual lista você deseja excluir: ");
		codigo = input.nextLine();
	}
}