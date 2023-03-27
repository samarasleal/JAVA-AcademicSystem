package SOOL;

public class Aula {
    private String diaSemana = "";
    private String horaInicio = "";
    private String horaFim = "";
    private Professor professor;
    
	public Aula(String diaSemana, String horaInicio, String horaFim){
	    this.diaSemana = diaSemana;
	    this.horaInicio = horaInicio;
	    this.horaFim =  horaFim;
	
	    TurmaGraduacao turmagraduacao = new TurmaGraduacao();
	    Disciplina disciplina = new disciplina();
	}
	
	public String getDiaSemana() {
	    return diaSemana;
	}
	
	public void setDiaSemana(String diaSemana) {
	    this.diaSemana = diaSemana;
	}
	
	public String getHoraInicio() {
	    return horaInicio;
	}
	
	public void setHoraInicio(String horaInicio) {
	    this.horaInicio = horaInicio;
	}
	
	public String getHoraFim() {
	    return horaFim;
	}
	
	public void setHoraFim(String horaFim) {
	    this.horaFim = horaFim;
	}
}