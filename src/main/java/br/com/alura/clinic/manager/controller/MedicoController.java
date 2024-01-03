package br.com.alura.clinic.manager.controller;

import br.com.alura.clinic.manager.medico.DadosCadastroMedico;
import br.com.alura.clinic.manager.medico.Medico;
import br.com.alura.clinic.manager.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

	@Autowired // Injeção de dependência
	private MedicoRepository medicoRepository;

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dadosCadastroMedico) {
		medicoRepository.save(new Medico(dadosCadastroMedico));
	}

}
