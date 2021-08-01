package com.rajat.learning.inversionControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.learning.inversionControl.Interfaces.Coach;

public class SpringInversionControl {

	public static void main(String[] args) {
		// Load the Spring Configuration File

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retireve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// Call the method on the bean
		System.out.println(theCoach.getDailyWorkouts());
		System.out.println(theCoach.getDailyFortune());

		// retireve bean from spring container
		Coach footballCoach = context.getBean("football", Coach.class);

		// Call the method on the bean
		System.out.println(footballCoach.getDailyWorkouts());
		System.out.println(footballCoach.getDailyFortune());

		// Close the context
		context.close();

	}

}
