package br.com.listavip.controller;

import br.com.listavip.service.ConvidadoService;
import br.com.listavip.model.Convidado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
