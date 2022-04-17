package com.minhho.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
	
		// Call new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
		
	}

}