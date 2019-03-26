//package net.guides.springboot2.springboottestingexamples.controller;
//
//import net.guides.springboot2.springboottestingexamples.model.Employee;
//import net.guides.springboot2.springboottestingexamples.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class EmployeeController {
//    @Autowired
//    private EmployeeService service;
//
//    @GetMapping("/home")
//    public ModelAndView index(){
//        System.out.println("Entrou no controller");
//        return new ModelAndView("index");
//    }
//
//    @RequestMapping("/listaconvidados")
//    public ModelAndView listaConvidados(Employee employee){
//
//        ModelAndView modelAndView = new ModelAndView("listaconvidados");
//        Iterable<Employee> convidados = service.obterTodos();
//        modelAndView.addObject("convidados", convidados);
//        return modelAndView;
//    }
//
////    @RequestMapping(value = "salvar", method = RequestMethod.POST )
////    public ModelAndView salvar(@RequestParam("nome") String nome, @RequestParam("email")String email,
////                               @RequestParam("telefone") String telefone){
////
////        ModelAndView modelAndView = new ModelAndView("listaconvidados");
////        Convidado novoConvidado = new Convidado(nome, email, telefone);
////        service.salvar(novoConvidado);
////
////        new EmailService().enviar(nome, email);
////
////        Iterable<Convidado> convidados = service.obterTodos();
////        modelAndView.addObject("convidados", convidados);
////        return modelAndView;
////    }
//
//}
