package SOOL;

import java.util.*;

public class TurmaExtensao extends Turma {
	public Date dataFim;
	public Date dataInicio;
	
        public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public TurmaExtensao(Turma turma, Date datainicio, Date datafim) {
		turma.setDatainicio(datainicio);
		turma.setDatainicio(datafim);		
	}
        // TurmaExtensao é filha de turm a e não recebe turma como parâmetro no construtor 
        // datainicio e datafim são atributos de TurmaExtensao
        /* O correto seria:
        public TurmaExtensao(Date datainicio, Date datafim, int codigoSequencia ){
                super(codigoSequencia);
                this.dataInicio = datainicio;
                this.dataFim = datafim;                   
        }
        */
	
	//Identificar aluno pelo array da turma 
	
	public int VerificarAlunoTurma(String nome, String endereco) {
            for (Aluno aluno : this.getListaAlunos()) {
                // O método getListaAlunos não esta em TurmaExtensão e aluno?
                if (aluno.getNome().equals(nome) && aluno.getEndereco().equals(endereco))
                    return aluno.getMatricula();
            }
        return null;
        
        // Como retorna null se o tipo do retorno do método é int?
        }
}
