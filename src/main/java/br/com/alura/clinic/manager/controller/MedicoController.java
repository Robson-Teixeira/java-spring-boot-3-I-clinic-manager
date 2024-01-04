package br.com.alura.clinic.manager.controller;

import br.com.alura.clinic.manager.medico.DadosCadastroMedico;
import br.com.alura.clinic.manager.medico.DadosListagemMedico;
import br.com.alura.clinic.manager.medico.Medico;
import br.com.alura.clinic.manager.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

	@Autowired // Injeção de dependência
	private MedicoRepository medicoRepository;

	@PostMapping
	@Transactional // Transação ativa com banco de dados
	public void cadastrar(@RequestBody @Valid DadosCadastroMedico dadosCadastroMedico) {
		medicoRepository.save(new Medico(dadosCadastroMedico));
	}

	@GetMapping
	public List<DadosListagemMedico> listar() {
		return medicoRepository.findAll().stream().map(DadosListagemMedico::new).toList();
	}

}
