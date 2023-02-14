package br.com.project.enums;

public enum Curso {
	
	EDUCACAO_INFANTIL("Educação Infantil (Inf. I - V)"),
	ENSINO_FUNDAMENTAL_1("Ensino Fundamental I (1º - 5º)"),
	ENSINO_FUNDAMENTAL_2("Ensino Fundamental II (6º - 8º)"),
	PRE_MEDIO("Pré-Médio (9º)"),
	MEDIO("Ensino Médio(1º EM - 3º EM)");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso = curso;
	}
	
	public String getName() {
		return curso;
	}
	
}
