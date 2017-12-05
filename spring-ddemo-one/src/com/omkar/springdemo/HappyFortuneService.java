package com.omkar.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	
	private String[] fortune={"Just Do It","Today is your lucky day","Health is Wealth"};
	
	private Random rnd=new Random();
	
	@Override
	public String getFortune() 
	{
		return fortune[rnd.nextInt(fortune.length)];
	}

}
