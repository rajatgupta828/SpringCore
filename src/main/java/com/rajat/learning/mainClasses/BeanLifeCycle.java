package com.rajat.learning.mainClasses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.learning.inversionControl.Interfaces.Coach;

public class BeanLifeCycle {
	
	public static void main(String[] args ) {
		System.out.println("Hello Bean scoped Java ");
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycleapplicationContext.xml");
		
		//Retrieve the bean 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkouts());
		// Close the context
		context.close();
	}

}
