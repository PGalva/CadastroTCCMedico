package med.vol.api.funcionario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "funcionario")
@Table(name = "funcionarios")
@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor

public class funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    private String email;

    private String cpf;



public funcionario (DadosCadastroFuncionario dados){
    this.nome = dados.nome();
    this.cpf = dados.cpf();
    this.email = dados.email();
}

}
