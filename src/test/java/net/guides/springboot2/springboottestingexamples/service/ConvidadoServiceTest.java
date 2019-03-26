package net.guides.springboot2.springboottestingexamples.service;

import net.guides.springboot2.springboottestingexamples.model.Convidado;
import net.guides.springboot2.springboottestingexamples.repository.ConvidadoRepository;
import org.junit.Before;
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
public class ConvidadoServiceTest {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    private ConvidadoService convidadoService;
    private Convidado convidado;

    @Before
    public void setup(){
        convidadoService = new ConvidadoService(convidadoRepository);
        convidado = new Convidado("ana", "rafael@r.com.br", "123");
        convidadoService.salvar(convidado);
    }

    @Test
    public void testSaveConvidado() {
        Optional<Convidado> convidado2 = convidadoRepository.findById(1L);
        assertNotNull(convidado2);
    }

    @Test
    public void testFindByName() {
        assertEquals(convidadoService.obterPorNome("anA").getNome(), convidado.getNome());
    }
}
