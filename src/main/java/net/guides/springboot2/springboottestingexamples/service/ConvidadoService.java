package net.guides.springboot2.springboottestingexamples.service;


import net.guides.springboot2.springboottestingexamples.model.Convidado;
import net.guides.springboot2.springboottestingexamples.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    public ConvidadoService (ConvidadoRepository convidadoRepository){
        this.convidadoRepository= convidadoRepository;
    }
    public Iterable<Convidado> obterTodos(){
        Iterable<Convidado> convidados = convidadoRepository.findAll();
        return convidados;
    }

    public Optional<Convidado> obterPorId(Long id){
        return convidadoRepository.findById(id);
    }

    public Convidado obterPorNome(String nome){
        return convidadoRepository.findByNomeIgnoreCase(nome);
    }

    public void salvar(Convidado convidado){
        convidadoRepository.save(convidado);
    }
}
