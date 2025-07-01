package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator 
{
	//Has-A properties (Composition)
	private LocalTime time;
	private LocalDate date;
	
	//Field Properties(simple)
	private int age;
	private String email;
	
	
	//WishMessageGenerator class property 4-parameter constructor
	public WishMessageGenerator(LocalTime time, LocalDate date, int age, String email) 
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator()-> 4-param constructor");
		
		this.time = time;
		this.date = date;
		this.age = age;
		this.email = email;
	}

	
	//Setter method for setter injection 
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	//develop b.method
	public String showWishMessage(String user) 
	{
		System.out.println("WishMessageGenerator.showWishMessage() -> Time::"+ time +", Date:: "+ date +", Age:: "+ age +", email:: "+ email);
		
		//get current hour of the day
		int hour = time.getHour();
		
		if(hour < 12) {
			return "Good Morning:: "+ user +", Today's date:: "+ date;
		}
		else if(hour < 16){
			return "Good Afternoon:: "+ user +", Today's date:: "+ date;
		}
		else if(hour < 20) {
			return "Good Evening:: "+ user +", Today's date:: "+ date;
		}
		else {
			return "Good Night:: "+ user +", Today's date:: "+ date;
		}
	}
	
}
