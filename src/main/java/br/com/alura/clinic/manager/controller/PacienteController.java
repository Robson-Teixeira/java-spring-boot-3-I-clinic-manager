package br.com.alura.clinic.manager.controller;

import br.com.alura.clinic.manager.paciente.DadosCadastroPaciente;
import br.com.alura.clinic.manager.paciente.DadosListagemPaciente;
import br.com.alura.clinic.manager.paciente.Paciente;
import br.com.alura.clinic.manager.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dadosCadastroPaciente) {
        pacienteRepository.save(new Paciente(dadosCadastroPaciente));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(Pageable pageable) {
        return pacienteRepository.findAll(pageable).map(DadosListagemPaciente::new);
    }

}
