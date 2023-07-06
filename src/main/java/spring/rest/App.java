package spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.rest.configuration.MyConfig;
import spring.rest.entity.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication =
                context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        System.out.println(communication.getEmployee(4));

        Employee emp = new Employee("Sveta", "Sokolova", "HR", 900);
        emp.setId(11);

        communication.saveEmployee(emp);

        communication.deleteEmployee(11);

    }
}
