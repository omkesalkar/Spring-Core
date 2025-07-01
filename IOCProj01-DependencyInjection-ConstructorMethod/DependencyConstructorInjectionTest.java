package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyConstructorInjectionTest 
{
	public static void main(String[] args)
	{
		//Create IOC Container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get target spring bean class obj ref
		Object obj = ctx.getBean("wmg");
		
		//type casting (down casting)
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//invoke the b.method
		String result = generator.showWishMessage("OM KESALKAR");
		System.out.println(result);
		
		//Close IOC Container & vanish all the spring bean class obj
		ctx.close();
	}

}
