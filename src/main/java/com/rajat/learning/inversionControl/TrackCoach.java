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

}
