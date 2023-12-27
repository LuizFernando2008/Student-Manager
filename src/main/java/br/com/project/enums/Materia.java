package br.com.project.enums;

public enum Materia {
	
	MATEMATICA("Matemática"),
	PORTUGUES("Português"),
	GEOGRAFIA("Geografia"),
	HISTORIA("História"),
	FILOSOFIA("Filosofia"),
	ENSINO_RELIGIOSO("Ensino Religioso"),
	INGLES("Inglês"),
	ESPANHOL("Espanhol"),
	ARTES("Artes"),
	EDUCACAO_FISICA("Educação Física");
	
	private String materia;
	
	private Materia(String materia) {
		this.materia = materia;
	}
	
	public String getName() {
		return materia;
	}
	
	public String getMateria() {
		return materia;
	}
	
}
