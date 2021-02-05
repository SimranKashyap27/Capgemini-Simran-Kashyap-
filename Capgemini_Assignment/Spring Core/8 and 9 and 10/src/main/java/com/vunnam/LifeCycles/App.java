package com.vunnam.LifeCycles;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Chowdary
 *
 */
public class App {
    public static void main( String[] args ){
    	//Context 1 for life cycle of bean
    	//Context 2 for xml based init and destroy methods
    	//Context 3 for postInit and preDestroy and ApplicationContextAware
    	//Comment other context codes to observe only one behavior
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
    	AbstractApplicationContext context3 = new ClassPathXmlApplicationContext("spring.xml");
    	context.registerShutdownHook();
    	context2.registerShutdownHook();
    	context3.registerShutdownHook();
    	Student stu = (Student) context.getBean("student");
    	System.out.println(stu);
    	System.out.println();
    	Student2 stu2 = (Student2)context2.getBean("student2");
    	System.out.println(stu2);
    	System.out.println();
    	Student3 stu3= (Student3)context3.getBean("student3");
    	System.out.println(stu3);
    }
}
