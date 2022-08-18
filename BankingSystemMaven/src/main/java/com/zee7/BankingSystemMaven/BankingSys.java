package com.zee7.BankingSystemMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankingSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
		Bank axis = c.getBean("axisBank",Axis.class);
		
		axis.displayAll();
		
		
	}

}

//
//create a maven project with the name Customer_service, create a Customer_service class: Strin name, String url
//And use the setters and getters, dependency injection and print the name of the url, either method or use toString methode
//CustomerMain class(App.java),3 object customer1,2 and 3;
//Use a customer.xml