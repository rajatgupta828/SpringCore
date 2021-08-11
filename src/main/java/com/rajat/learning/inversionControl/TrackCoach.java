package com.rajat.learning.inversionControl;

import com.rajat.learning.inversionControl.Interfaces.Coach;
import com.rajat.learning.inversionControl.Interfaces.FortuneServices;

public class TrackCoach implements Coach {
	
	private FortuneServices fortuneServices;

	public TrackCoach(FortuneServices fortuneServices) {
		super();
		this.fortuneServices = fortuneServices;
	}

	public String getDailyWorkouts() {
		
		return ("Run a 5K today");
	}

	public String getDailyFortune() {
		return fortuneServices.getFortune();
	}
	
	// Custom Init Method
	public void doMyStart() {
		System.out.println(" Calling Custom Start Method...");
	}
	
	// Custom Destroy Method
	public void doMyDestroy() {
		System.out.println(" Calling Custom destroy Method...");
	}
}
