package br.com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.model.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Integer> {
	
	public List<Aluno> findByNomeContainingIgnoreCase(String nome);
	
}
