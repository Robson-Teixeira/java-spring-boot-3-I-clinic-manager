package br.com.alura.clinic.manager.medico;

import br.com.alura.clinic.manager.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especilidade especialidade, DadosEndereco endereco) {
}
