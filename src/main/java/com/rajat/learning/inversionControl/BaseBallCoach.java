package com.rajat.learning.inversionControl;

import com.rajat.learning.inversionControl.Interfaces.Coach;
import com.rajat.learning.inversionControl.Interfaces.FortuneServices;

public class BaseBallCoach implements Coach {
	
	// Define a private field for Dependency Injection
	private FortuneServices fortuneServices;
	
	
	
	public BaseBallCoach(FortuneServices myFortuneService) {
		super();
		this.fortuneServices = myFortuneService;
	}
	
	public String getDailyWorkouts() {
		
		return ("Spend 30 Minutes on running");
	}

	public String getDailyFortune() {
		// Use My fortune Service
		return fortuneServices.getFortune();
	}
}
