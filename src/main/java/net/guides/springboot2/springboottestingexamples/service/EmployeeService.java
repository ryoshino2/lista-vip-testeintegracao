//package net.guides.springboot2.springboottestingexamples.service;
//
//import net.guides.springboot2.springboottestingexamples.model.Employee;
//import net.guides.springboot2.springboottestingexamples.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public EmployeeService (EmployeeRepository employeeRepository){
//        this.employeeRepository = employeeRepository;
//    }
//    public Iterable<Employee> obterTodos(){
//        Iterable<Employee> employee = employeeRepository.findAll();
//        return employee;
//    }
//
//    public Optional<Employee> obterPorId(Long id){
//        return employeeRepository.findById(id);
//    }
//
//    public Employee obterPorNome(String firstName){
//        return employeeRepository.findByFirstNameIgnoreCase(firstName);
//    }
//
//    public void salvar(Employee employee){
//        employeeRepository.save(employee);
//    }
//}
