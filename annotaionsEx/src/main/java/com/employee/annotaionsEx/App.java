package com.employee.annotaionsEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac= new AnnotationConfigApplicationContext("employeeConfig.xml");
        Employee e= (Employee)ac.getBean("emp");
        System.out.println(e.getEmpName());
    }
}
