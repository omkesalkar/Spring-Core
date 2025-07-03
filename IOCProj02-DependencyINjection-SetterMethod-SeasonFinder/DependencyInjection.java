package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjection 
{
	public static void main(String[] args) 
	{
		//Create IOC Container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//target spring beans class object reference
		Object obj = ctx.getBean("sfc");
		
		//type casting (down casting)
		SeasonFinder finder = (SeasonFinder)obj;
		
		//invoke b.method
		String result = finder.showSeason("OM");
		System.out.println(result);
		
		//close IOC container
		ctx.close();
	}
}
