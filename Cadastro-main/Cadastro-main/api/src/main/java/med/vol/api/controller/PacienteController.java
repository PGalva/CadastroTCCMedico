//package med.vol.api.controller;
//
//
////////controller serve para definir qual será o caminho da requisição, nesse caso paciente e tbm o método responsavel por gerar os dados
//
//
//import jakarta.validation.Valid;
//import med.vol.api.paciente.DadosCadastroPacientes;
//import med.vol.api.paciente.Paciente;
//import med.vol.api.paciente.PacienteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequestMapping("pacientes")
//@RestController
//public class PacienteController {
//
//
//    @Autowired
//    private PacienteRepository repository;
//
//
//    public void Cadastrar (@RequestBody @Valid DadosCadastroPacientes dados ){
//        repository.save(new Paciente(dados));
//    }
//    }
//
