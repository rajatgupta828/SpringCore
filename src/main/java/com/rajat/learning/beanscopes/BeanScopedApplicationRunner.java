package com.rajat.learning.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.learning.inversionControl.Interfaces.Coach;

public class BeanScopedApplicationRunner {
	
	public static void main(String[] args ) {
		System.out.println("Hello Bean scoped Java ");
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanscoped-applicationContext.xml");
		
		//Retrieve the bean 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Call the method on the bean
		boolean result = (alphaCoach == theCoach);
		
		System.out.println("Are both object pointed to same object : " + result);
		
		// Close the context
		context.close();
	}

}
