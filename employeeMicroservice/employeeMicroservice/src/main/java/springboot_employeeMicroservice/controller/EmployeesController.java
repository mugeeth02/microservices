package springboot_employeeMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot_employeeMicroservice.model.Employee;
import springboot_employeeMicroservice.service.NameService;

@RestController
public class EmployeesController {
    @Autowired
    private NameService nameService;
    @GetMapping
    @RequestMapping("/employees") //http://localhost:8080/employees
    public Employee getEmployeeDetails(){
        Employee employee = new Employee();

        String name = nameService.callNameService();

        employee.setName(name);
        employee.setSalary(10000);

        return employee;
    }
}
