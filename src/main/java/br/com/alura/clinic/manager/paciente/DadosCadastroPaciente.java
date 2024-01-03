package br.com.alura.clinic.manager.paciente;

import br.com.alura.clinic.manager.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
