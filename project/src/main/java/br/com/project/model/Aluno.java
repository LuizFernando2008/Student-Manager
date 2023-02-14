package br.com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.project.enums.AnoEscolar;
import br.com.project.enums.Curso;
import br.com.project.enums.Materia;
import br.com.project.enums.Turno;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nome")
	@Size(min = 5, max = 100, message = "O nome deve conter pelo menos 5 caractéres.")
	@NotBlank(message = "Este campo é obrigatório.")
	private String nome;
	
	@Column(name = "curso")
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Este campo é obrigatório.")
	private Curso curso;
	
	@Column(name = "materias")
	@Enumerated(EnumType.STRING)
	private Materia materias;
	
	@Column(name = "turno")
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Este campo é obrigatório.")
	private Turno turno;
	
	@Column(name = "serie")
	@Enumerated(EnumType.STRING)
	private AnoEscolar serie;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Materia getMaterias() {
		return materias;
	}

	public void setMaterias(Materia materias) {
		this.materias = materias;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public AnoEscolar getSerie() {
		return serie;
	}

	public void setSerie(AnoEscolar serie) {
		this.serie = serie;
	}
	
}
