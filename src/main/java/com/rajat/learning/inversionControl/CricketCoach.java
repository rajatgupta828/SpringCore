package com.rajat.learning.inversionControl;

import com.rajat.learning.inversionControl.Interfaces.Coach;
import com.rajat.learning.inversionControl.Interfaces.FortuneServices;

public class CricketCoach implements Coach {
	
	// Define a private field for Dependency Injection
	private FortuneServices fortuneServices;
	private String emailId;
	private String teamName;
	
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public FortuneServices getFortuneServices() {
		return fortuneServices;
	}

	public void setFortuneServices(FortuneServices fortuneServices) {
		this.fortuneServices = fortuneServices;
	}
	
	public String getDailyWorkouts() {
		System.out.println("Email Id is : " + this.emailId);
		System.out.println("Team Name is : " + this.teamName);
		return ("Practice Batting for 30 Mins");
	}

	public String getDailyFortune() {
		// Use My fortune Service
		return fortuneServices.getFortune();
	}
}
