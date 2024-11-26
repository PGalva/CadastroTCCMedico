/////package med.vol.api.paciente;
//
/////import jakarta.validation.Valid;
/////import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
/////import med.vol.api.endereco.DadosEndereco;
//
/////records servem para dados imutaveis, ou seja, nesse contexto ele define as strings e as esecificações delas
//public record DadosCadastroPacientes (
//
//
//        ///blank serve para ser obrigatório o preenchimento
//@NotBlank
//    String nome,
//
//////email especifico para email
//@NotBlank @Email
//    String email,
//@NotBlank
//    String telefone,
//
//////segue um padrao,sendo cpf tem que alguns dados especificos como numeros
//@NotBlank @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
//    String cpf,
//    @NotNull @Valid
//    DadosEndereco endereco) {
//}
