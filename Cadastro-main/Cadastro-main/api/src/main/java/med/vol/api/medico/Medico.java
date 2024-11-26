package med.vol.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
///import med.vol.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {


    /////Indica que o valor do id será gerado automaticamente pelo banco de dados.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    private String email;

    private String crm;

    private String telefone;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;


    ////@Embedded: Indica que a classe Endereco será incorporada na tabela medicos, permitindo armazenar os campos do endereço junto com os campos do médico.
////@Embedded
    ///private Endereco endereco;


    public Medico(DadosCadastrosMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        ///this.endereco = new Endereco(dados.endereco());
        this.telefone = dados.telefone();
    }
}
