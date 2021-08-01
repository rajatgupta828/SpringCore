package com.rajat.learning.inversionControl;

import com.rajat.learning.inversionControl.Interfaces.Coach;
import com.rajat.learning.inversionControl.Interfaces.FortuneServices;

public class FootBallCoach implements Coach {
	
	FortuneServices fortuneServices;
	
	public FootBallCoach(FortuneServices fortuneServices) {
		super();
		this.fortuneServices = fortuneServices;
	}

	public String getDailyWorkouts() {
		
		return ("Spend 30 Minutes on Dribbling");
	}

	public String getDailyFortune() {
		return fortuneServices.getFortune();
	}
}
