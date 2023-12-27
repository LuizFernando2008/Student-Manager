package br.com.project.enums;

public enum AnoEscolar {
	
	INFANTIL_1("Infantil I"),
	INFANTIL_2("Infantil II"),
	INFANTIL_3("Infantil III"),
	INFANTIL_4("Infantil IV"),	
	INFANTIL_5("Infantil V"),
	PRIMEIRO("1º Ano"),
	SEGUNDO("2º Ano"),
	TERCEIRO("3º Ano"),
	QUARTO("4º Ano"),
	QUINTO("5º Ano"),
	SEXTO("6º Ano"),
	SETIMO("7º Ano"),
	OITAVO("8º Ano"),
	NONO("9º Ano"),
	PRIMEIRO_EM("1º Ano - E.M."),
	SEGUNDO_EM("2º Ano - E.M."),
	TERCEIRO_EM("3º Ano - E.M.");
	
	private String serie;
	
	private AnoEscolar(String serie) {
		this.serie = serie;
	}
	
	public String getName() {
		return serie;
	}
	
}
