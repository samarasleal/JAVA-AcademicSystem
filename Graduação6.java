/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIMG
 */
public class Graduação extends Curso {
    
    private String turno;

    public String getTurno() {
        return turno;
    }
    
    public Graduação (String codigo, String nome, String turno, String TurnoG){
        super(codigo,nome,turno);
        this.turno = TurnoG;
    }
    
    public String AlterarTurno(String NovoTurno, String getTurno){
        getTurno = NovoTurno;
        return NovoTurno;
        
    }
    // E o método para pesquisar período?
    
    
    
}
