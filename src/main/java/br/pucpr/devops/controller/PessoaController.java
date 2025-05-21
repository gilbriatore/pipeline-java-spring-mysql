package br.pucpr.devops.controller;

import br.pucpr.devops.model.Pessoa;
import br.pucpr.devops.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }
}
