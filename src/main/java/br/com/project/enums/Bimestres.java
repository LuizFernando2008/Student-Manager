package br.com.project.enums;

public enum Bimestres {
	
	PRIM("1º Bimestre"),
	SEGUN("2º Bimestre"),
	TERC("3º Bimestre"),
	QUARTO("4º Bimestre");
	
	private String bimestres;

	private Bimestres(String bimestres) {
		this.bimestres = bimestres;
	}
	
	public String getName() {
		return bimestres;
	}
	
	
}
