package net.guides.springboot2.springboottestingexamples.repository;

import net.guides.springboot2.springboottestingexamples.model.Convidado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
    Convidado findByNomeIgnoreCase(String nome);

}
