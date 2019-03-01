
package spring.coupling.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.coupling.Student;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springConfig.xml");
		Student ob= (Student)ac.getBean("studentObj");
		
		System.out.println(ob);
		((ConfigurableApplicationContext)ac).close();
	}

}
