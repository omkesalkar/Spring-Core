package com.nt.sbeans;

// User-defined class OR Target Class
import java.time.LocalTime;

public class WishMessageGenerator 
{
	//HAS-A property(Composition)
	private LocalTime time;		
	
	//0-Parameter Constructor
	public WishMessageGenerator() 
	{		
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	//Setter Method for Setter Injection (Basic Dependency Injection(DI) method)
	public void setTime(LocalTime time)
	{	 
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}
	
	//Develop b.method logic
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()");
		
		int hour = time.getHour(); //Get current Hour of the day using time.getHour(); 24hr Format
		
		if(hour < 12) {
			return "Good Morning:: " + user;
		} 
		else if(hour < 16) {
			return "Good Afternoon:: "+ user;
		}
		else if(hour < 20) {
			return "Good Evening:: "+ user;
		}
		else {
			return "Good Night:: "+ user;
		}
	}
	
}
