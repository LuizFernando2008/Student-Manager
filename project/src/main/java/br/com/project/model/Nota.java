package br.com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.project.enums.Bimestres;
import br.com.project.enums.Materia;

@Entity
public class Nota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nota")
	private double nota;
	
	@ManyToOne
	@JoinColumn(name="Aluno")
	private Aluno aluno;
	
	@Column(name = "bimestre")
	@Enumerated(EnumType.STRING)
	private Bimestres bimestres;
	
	@Column(name = "materia")
	@Enumerated(EnumType.STRING)
	private Materia materia;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Bimestres getBimestres() {
		return bimestres;
	}

	public void setBimestres(Bimestres bimestres) {
		this.bimestres = bimestres;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
}
