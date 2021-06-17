package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ravi.beans.CompanyDetails1;
import com.ravi.beans.CompanyDetails2;

@SpringBootApplication
public class Proj3ConfigurationPropApplication {

	public static void main(String[] args) {
		//Get IOC Container
		ApplicationContext ctx = SpringApplication.run(Proj3ConfigurationPropApplication.class, args);
		//
		CompanyDetails1 c1 = ctx.getBean("comp1",CompanyDetails1.class);
		System.out.println("Company1 Details");
		System.out.println("-----------------------");
		CompanyDetails2 c2 = ctx.getBean("comp2",CompanyDetails2.class);
		System.out.println("NAME:"+c1.getTitle());
		System.out.println("TYPE:"+c1.getType());
		System.out.println("ADDRESS:"+c1.getAddr());
		System.out.println();
		System.out.println("Company2 Details");
		System.out.println("-----------------------");
		System.out.println("NAME:"+c2.getName());
		System.out.println("TYPE:"+c2.getType());
		System.out.println("ADDRESS:"+c2.getLocation());
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
