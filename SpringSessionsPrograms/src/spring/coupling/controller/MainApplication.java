
package spring.coupling.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.coupling.Employee;
import spring.coupling.Student;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springConfig.xml"); //to initialze srping container
		Student ob= (Student)ac.getBean("studentObj");   // object creation for a spring bean and injecting values to respective properties
		
		System.out.println(ob);
		
		Employee emp = (Employee)ac.getBean("empObj");
		Employee emp1 = (Employee)ac.getBean("empObj");
		Employee emp2 = (Employee)ac.getBean("empObj");
		
		
		System.out.println(emp);
		System.out.println(emp1==emp2);
		((ConfigurableApplicationContext)ac).close();
	}

}
