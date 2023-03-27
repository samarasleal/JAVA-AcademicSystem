
package soool;

import java.util.ArrayList;


public class Turma {
        private int codSequencia;
        private String codigo;
        protected ArrayList<Aluno> listaAlunos = new ArrayList<>();
        
        public Turma (int codSequencia, String codigo){
            this.codSequencia = 1;
            this.codigo = codigo;
        }

    public int getCodSequencia() {
        return codSequencia;
    }

    public void setCodSequencia(int codSequencia) {
        this.codSequencia = codSequencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
