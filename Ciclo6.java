/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticopoo;

import java.util.*;


/**
 *
 * @author CIMG
 */
public class Ciclo {
    
    private String descTema;

    public String getDescTema() {
        return descTema;
    }


    private List<Modulo> modulo = new ArrayList <> ();

    public List<Modulo> getMudulo() {
        return mudulo;
    }


    public  Ciclo (String descTema){
    this.descTema = descTema;
}
    public int getTamanho(){
	return (int)(modulo.length);	
    }
    public int getValor(int posicao){
	return modulo[posicao];
	 }
    public void RetornaModulo(){
        int i = 0;
        Iterator<Modulo> iterator = modulo.iterator();
        while (iterator.hasNext()) {
        i++;
        // Não esta retornando os módulos por ciclo.
    }
 
    }
    public void procuraModulo(String codigo, int qtdeCredito){
	for (int i=0; i<getTamanho();  i++)
		if(getValor(i)==qtdeCredito){
                    return modulo.codigo;
                    // Pode esta acessando módulo (objeto da classe ou lista)?
                    // usar getCodigo()
		}
		else{
		 System.out.println("nao existe");
		}
	}
    
    
    
    public int RemoverModulo(int codigo){
		return modulo = codigo;
                // Não esta removendo módulo
		}
    
    // E o método inclui um módulo em um ciclo?
}
