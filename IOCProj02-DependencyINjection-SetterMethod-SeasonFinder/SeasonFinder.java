package com.nt.sbeans;
//target class / user-defined class

import java.time.LocalDate;

public class SeasonFinder
{
	//HAS-A Property (Composition)
	private LocalDate date;
	
	//0-Parameter Constructor
	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()");
	}
	
	//Setter method of setter injection
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}
	
	//Develop b.method logic
	public String showSeason(String user) 
	{
		System.out.println("SeasonFinder.showSeason()");
		//get current month value
		int month = date.getMonthValue();
		
		if(month >= 12 || month <= 2) {
		    return "Winter Season:: " + user;
		} 
		else if(month >= 3 && month <= 6) {
		    return "Summer Season:: " + user;
		} 
		else if(month >= 7 && month <= 9) {
		    return "Monsoon Season:: " + user;
		}
		else {
		    return "Autumn Season:: " + user;
		}

	}
}
