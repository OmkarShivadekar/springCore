package com.omkar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) 
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);

		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		
		Coach newCoach=context.getBean("myNewCoach",Coach.class);
		
		Coach brandNewCoach=context.getBean("myNewCoach",Coach.class);
		
		//check if they are pointing to same memory location
		boolean result=(newCoach==brandNewCoach);
		
		System.out.println("\nPointing to the same object : "+result);
		
		System.out.println("\nMemory location for theCoach : "+newCoach);

		System.out.println("\nMemory location for alphaCoach : "+brandNewCoach+"\n");
		
		//close the context
		context.close();
		
	}

}
