package br.com.project.enums;

public enum Turno {
	
	MANHA("Manhã"),
	TARDE("Tarde"),
	NOITE("Noite");
	
	private String turno;
	
	private Turno(String turno) {
		this.turno = turno;
	}

	public String getName() {
		return turno;
	}
	
}
