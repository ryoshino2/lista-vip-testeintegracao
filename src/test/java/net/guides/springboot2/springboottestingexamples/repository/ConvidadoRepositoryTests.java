package net.guides.springboot2.springboottestingexamples.repository;

import net.guides.springboot2.springboottestingexamples.model.Convidado;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ConvidadoRepositoryTests {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    @Test
    public void testSaveConvidado() {
        Convidado convidado1 = new Convidado("ana", "rafael@r.com.br", "123");
        convidadoRepository.save(convidado1);
        Optional<Convidado> convidado2 = convidadoRepository.findById(1L);
        assertNotNull(convidado2);
    }

    @Test
    public void testFindByName() {
        Convidado convidado1 = new Convidado("ana", "rafael@r.com.br", "123");
        convidadoRepository.save(convidado1);
        assertEquals(convidadoRepository.findByNomeIgnoreCase("Ana").getNome(), convidado1.getNome());
    }
}
