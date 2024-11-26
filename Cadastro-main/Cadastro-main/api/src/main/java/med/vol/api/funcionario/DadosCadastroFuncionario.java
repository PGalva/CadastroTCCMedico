package med.vol.api.funcionario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroFuncionario (
    @NotNull
    String nome,
    @NotNull @Email
    String email,
    @NotNull @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
    String cpf
){}

