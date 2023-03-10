package br.com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.model.Nota;

public interface NotaDAO extends JpaRepository<Nota, Integer> {
	
		public List<Nota> findByAluno(Integer id);
	
}
