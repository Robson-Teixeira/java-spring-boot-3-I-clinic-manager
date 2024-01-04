package br.com.alura.clinic.manager.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especilidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
