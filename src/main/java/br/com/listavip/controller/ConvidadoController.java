package br.com.listavip.controller;

import br.com.alura.enviadorEmail.enviadorEmail.EmailService;
import br.com.listavip.service.ConvidadoService;
import br.com.listavip.model.Convidado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoService convidadoService;

    @GetMapping
    public ModelAndView index (){
        return new ModelAndView("index");
    }

    @RequestMapping("/listaconvidados")
    public ModelAndView listaConvidados(Convidado convidado){

        ModelAndView modelAndView = new ModelAndView("listaconvidados");
        Iterable<Convidado> convidados = convidadoService.obterTodos();
        modelAndView.addObject("convidados", convidados);
        return modelAndView;
    }

    @PostMapping(value = "salvar")
    public ModelAndView salvar(Convidado convidado){

        ModelAndView modelAndView = new ModelAndView("listaconvidados");

        convidadoService.salvar(convidado);

        new EmailService().enviar(convidado.getNome(), convidado.getEmail());

        Iterable<Convidado> convidados = convidadoService.obterTodos();
        modelAndView.addObject("convidados", convidados);
        return modelAndView;
    }

    @GetMapping("/listaconvidados/{id}")
    public ModelAndView findbyId(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("/listaconvidados");
        Optional<Convidado> convidados = convidadoService.obterPorId(id);
        modelAndView.addObject("convidados", convidados);

        return modelAndView;
    }

    @GetMapping("/{nome}")
    public ModelAndView findByName(@PathVariable("nome") String nome){
        ModelAndView modelAndView = new ModelAndView("/listaconvidados");
        Iterable<Convidado> convidados = convidadoService.obterPorNome(nome);
        modelAndView.addObject("convidados", convidados);

        return modelAndView;
    }
}
