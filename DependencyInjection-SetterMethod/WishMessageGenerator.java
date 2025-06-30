package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjection 
{
	public static void main(String[] args) 
	{
		//Create IOC Container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cgfs/applicationContext.xml");
		
		try( ctx; )
		{
			//get target spring bean class obj ref
			Object obj = ctx.getBean("wmg");
			
			//type-casting (DownCasting)
			WishMessageGenerator generator = (WishMessageGenerator)obj;
			
			//invoke the b.method
			String result = generator.showWishMessage("Om");
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
