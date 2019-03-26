//package net.guides.springboot2.springboottestingexamples;
//
//import net.guides.springboot2.springboottestingexamples.model.Employee;
//import net.guides.springboot2.springboottestingexamples.repository.EmployeeRepository;
//import net.guides.springboot2.springboottestingexamples.service.EmployeeService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class EmployeeServiceTest {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    private EmployeeService employeeService;
//
//    @Before
//    public void setup(){
//        employeeService = new EmployeeService(employeeRepository);
//    }
//
//    @Test
//    public void testSaveEmployee() {
//        Employee employee = new Employee("rafael", "admin", "admin@gmail.com");
//        employeeService.salvar(employee);
//        assertNotNull(employee);
//    }
//
//    @Test
//    public void testGetEmployeeName() {
//        Employee employee = new Employee("rafael", "admin", "admin@gmail.com");
//        employeeService.salvar(employee);
//        Employee employee2 = employeeService.obterPorNome("rafael");
//        assertNotNull(employee);
//        assertEquals(employee2.getFirstName(), employee.getFirstName());
//        assertEquals(employee2.getLastName(), employee.getLastName());
//    }
//}