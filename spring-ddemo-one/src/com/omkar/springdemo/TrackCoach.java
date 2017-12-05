package com.omkar.springdemo;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach(){}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It..."+fortuneService.getFortune();
	}
	
	//init method
	public void doMyStartupStuff(){
		System.out.println("Doing Startup stuff in TrackCoach");
	}
	
	//destroy method
	public void doCleanupStuff(){
		System.out.println("Doing Cleanup stuff in TrackCoach");
	}

}
