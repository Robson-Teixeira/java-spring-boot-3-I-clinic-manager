package br.com.alura.clinic.manager.medico;

import br.com.alura.clinic.manager.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Medico")
@Table(name = "medicos")
@Getter // Geração dos métodos getters
@NoArgsConstructor // Construtor padrão (sem argumentos) exigido pela JPA
@AllArgsConstructor // Construtor com todos os campos/propriedades
@EqualsAndHashCode(of = "id") // Gera métodos equals e hashCode para id
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especilidade especilidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dadosCadastroMedico) {
        this.nome = dadosCadastroMedico.nome();
        this.email = dadosCadastroMedico.email();
        this.crm = dadosCadastroMedico.crm();
        this.especilidade = dadosCadastroMedico.especialidade();
        this.endereco = new Endereco(dadosCadastroMedico.endereco());
    }

}
