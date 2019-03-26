package br.com.listavip.repository;

import br.com.listavip.model.Convidado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
    Convidado findByNomeIgnoreCase(String nome);

}
