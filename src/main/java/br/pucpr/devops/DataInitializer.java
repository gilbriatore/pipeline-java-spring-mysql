package br.pucpr.devops;

import br.pucpr.devops.model.Pessoa;
import br.pucpr.devops.repository.PessoaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(PessoaRepository repository) {
        return args -> {
            repository.save(new Pessoa(null, "Maria"));
            repository.save(new Pessoa(null, "João"));
            repository.save(new Pessoa(null, "Ana"));
        };
    }
}
