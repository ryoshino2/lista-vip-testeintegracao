package br.com.listavip.service;


import br.com.listavip.repository.ConvidadoRepository;
import br.com.listavip.model.Convidado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Convidado> obterPorNome(String nome){
        return convidadoRepository.findByNomeIgnoreCase(nome);
    }

    public void salvar(Convidado convidado){
        if(convidadoRepository.findByNomeIgnoreCase(convidado.getNome()).size()>0){
            System.out.println("Entrou, não deveria salvar");
        }
        else{
            System.out.println("Entrou, passou direto");
            convidadoRepository.save(convidado);
        }
    }
}
