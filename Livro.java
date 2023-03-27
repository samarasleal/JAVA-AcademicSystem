
import java.util.*;

public class Livro {
	
	static int i;
	private static ArrayList ListaAlunos = null;
	private static ArrayList ListaInstituicoes = null;
	private static ArrayList<Livro> ListaLivros;
	private static ArrayList<Quantidade> ListaQuantidade;
        
        // E o atributo titulo ?

		//Construtor
		public void Curso() {
                        // Construtor com nome de outra classe - Esta classe é a Livro
			this.ListaLivros = new ArrayList<Livro>();
			this.ListaQuantidade = new ArrayList<Quantidade>();
		}

		public ArrayList getListaAlunos()
		{
			return ListaAlunos;
		}

		public void setListaAlunos(ArrayList ListaAlunos)
		{
			Livro.ListaAlunos = ListaAlunos;
		}

		public ArrayList getListaInstituicoes()
		{
			return ListaInstituicoes;
		}

		public void setListaInstituicoes(ArrayList ListaInstituicoes)
		{
			Livro.ListaInstituicoes = ListaInstituicoes;
		}

		public static void IncluirLivros()
		{
	                
					ListaLivros.add(i);
		}

		public static void ExcluirLivros()
		{
			for (int i = 0; i < ListaLivros.size(); i++)
			{
	                    ListaLivros.remove(i);
			}
		}

		public static void IncluirQuantidade(){
                    
	                ListaQuantidade.add(i);
		}

		public static void ExcluirQuantidade()
		{
			for (int i = 0; i < ListaQuantidade.size(); i++)
			{
	                    ListaQuantidade.remove(i);
			}
		}
	}
	


