package br.pucpr.devops.repository;

import br.pucpr.devops.model.Pessoa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PessoaRepositoryTest {

    @Autowired
    private PessoaRepository repository;

    @Test
    void deveSalvarPessoa() {
        Pessoa p = new Pessoa();
        p.setNome("Carlos");
        Pessoa salvo = repository.save(p);
        assertNotNull(salvo.getId());
    }
}