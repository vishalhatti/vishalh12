package com.xworkz.soap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoapTester {
public static void main(String[] args) {
	String metaInfo = "resources/spring.xml";
	@SuppressWarnings("resource")
	ApplicationContext spring = new ClassPathXmlApplicationContext(metaInfo);
	/*
	 * Soap refSoap = spring.getBean("soap",Soap.class);
	 * refSoap.foaming("lifebuoy"); refSoap.foaming("vim");
	 */
	
	String refString = spring.getBean("strings",String.class);
	refString.getClass().getSimpleName();
	
	//Integer refinteger = spring.getBeanDefinitionCount();
	//System.out.println(refinteger);
	
	//Boolean refbooolean = spring.getBean("boolean",Boolean.class);
	/*
	 * ArrayList refList = spring.getBean("list",ArrayList.class); Thread refThread
	 * = spring.getBean("thread",Thread.class); Map refmap =
	 * spring.getBean("map",Map.class);
	 * 
	 * Set refSet = spring.getBean("set",Set.class);
	 */
	/*
	 * Set<String> hash_Set = new HashSet<String>(); hash_Set.add("visahl");
	 * hash_Set.add("vinay"); hash_Set.add("hahh"); hash_Set.add("Example");
	 * hash_Set.add("Set"); System.out.println(hash_Set);
	 * 
	 * List<String> list=new ArrayList<String>();
	 * 
	 * list.add("Mango"); list.add("Apple"); list.add("Banana"); list.add("Grapes");
	 */
	
	
}
}
