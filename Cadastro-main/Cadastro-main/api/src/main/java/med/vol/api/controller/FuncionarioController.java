package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.funcionario.DadosCadastroFuncionario;
import med.vol.api.funcionario.FuncionarioRepository;
import med.vol.api.funcionario.funcionario;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RequestMapping("funcionario")
@RestController
public class FuncionarioController {


    private FuncionarioRepository repository;


    public void cadastrar (@RequestBody @Valid DadosCadastroFuncionario dados) {repository.save( new funcionario(dados));
    }




}
