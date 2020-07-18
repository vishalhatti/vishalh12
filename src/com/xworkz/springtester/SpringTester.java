package com.xworkz.springtester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.farmer.Farmer;

public class SpringTester {
	public static void main(String[] args) {
		String metaInfo = "resources/spring.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(metaInfo);
		Farmer refOfFarmer = spring.getBean("faarmer1", Farmer.class);

		refOfFarmer.sowing();
		Farmer refOfFarmer1 = spring.getBean("faarmer", Farmer.class);

		refOfFarmer1.sowing();
	}
}
