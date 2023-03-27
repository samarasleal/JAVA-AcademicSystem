package SOOL;

public class TurmaGraduacao extends Turma {
    public int semestre;
    public int ano;
    
    public TurmaGraduacao(int semestre, int ano) {
        // Atributos da herança super()
        this.semestre = semestre;
        this.ano = ano;
    }
    
    public int VerificarAlunoTurma(String nome, String endereco) {
        for (Aluno aluno : this.getListaAlunos()) {
            if (aluno.getNome().equals(nome) && aluno.getEndereco().equals(endereco))
                return aluno.getMatricula();
        }
        
        return null;
        // Como retorna null se o tipo do retorno do método é int?
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
