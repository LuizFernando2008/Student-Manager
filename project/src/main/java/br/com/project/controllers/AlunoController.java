package br.com.project.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.project.DAO.AlunoDAO;
import br.com.project.DAO.NotaDAO;
import br.com.project.model.Aluno;
import br.com.project.model.Nota;

@Controller
public class AlunoController {

	@Autowired
	private AlunoDAO alunoRepository;

	@Autowired
	private NotaDAO notaRepository;

	@GetMapping("/cadastrarAluno")
	public ModelAndView insertAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Aluno/formAluno");
		mv.addObject("aluno", new Aluno());
		return mv;
	}

	@PostMapping("InsertAlunos")
	public ModelAndView inserirAluno(@Valid Aluno aluno, BindingResult br) {
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("Aluno/formAluno");
			mv.addObject("aluno");
		} else {
			mv.setViewName("redirect:/alunos-adicionados");
			alunoRepository.save(aluno);
		}
		return mv;
	}

	@GetMapping("alunos-adicionados")
	public ModelAndView listagemAlunos(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Aluno/listAlunos");
		mv.addObject("alunosList", alunoRepository.findAll());
		return mv;
	}

	@GetMapping("/alterar/{id}")
	public ModelAndView alterar(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Aluno/alterar");
		Aluno aluno = alunoRepository.getOne(id);
		mv.addObject("aluno", aluno);
		return mv;
	}

	@PostMapping("/alterar")
	public ModelAndView alterar(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		alunoRepository.save(aluno);
		mv.setViewName("redirect:/alunos-adicionados");
		return mv;
	}

	@GetMapping("/excluir/{id}")
	public String excluirAluno(@PathVariable("id") Integer id) {
		alunoRepository.deleteById(id);
		return "redirect:/alunos-adicionados";
	}

	@PostMapping("pesquisar-aluno")
	public ModelAndView pesquisarAluno(@RequestParam(required = false) String nome) {
		ModelAndView mv = new ModelAndView();
		List<Aluno> listAlunos;
		if (nome == null || nome.trim().isEmpty()) {
			listAlunos = alunoRepository.findAll();
		} else {
			listAlunos = alunoRepository.findByNomeContainingIgnoreCase(nome);
		}
		mv.addObject("ListaDeAlunos", listAlunos);
		mv.setViewName("Aluno/pesquisa-resultado");
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/insertNotas")
	public ModelAndView insertNota(Nota nota) {
		ModelAndView mv = new ModelAndView("Aluno/formNota");
		Iterable<Aluno> alunoIt = alunoRepository.findAll();
		mv.addObject("listAlunos", alunoIt);
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST, value = "InserirNotas")
	public ModelAndView inserirNota(Nota nota) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Aluno/formNota");
		mv.addObject("nota");
		mv.setViewName("redirect:/insertNotas");
		notaRepository.save(nota);
		return mv;
	}


	@GetMapping("listNotas/{id}")
	public ModelAndView listNotas(Nota nota, @PathVariable("id") Integer id) {
		List<Nota> listNotas;
		listNotas = notaRepository.findByAluno(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Aluno/listNotas");
		mv.addObject("listNotas", listNotas);
		return mv;
	}

}
