package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ravi.models.Employee;

@SpringBootApplication
public class Proj4InjectingDiffTypesOfValuesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(Proj4InjectingDiffTypesOfValuesApplication.class, args);
		
		Employee e1 = ctx.getBean("emp",Employee.class);
		System.out.println(e1);
		System.out.println("Employee Details");
		System.out.println("ID="+e1.getId());
		System.out.println("Name="+e1.getName());
		System.out.println("NickNames="+e1.getNickNames()[0]);
		System.out.println("PhoneNumbers="+e1.getPhoneNumbers());
		System.out.println("TeamMembers="+e1.getTeamMembers());
		System.out.println("CompanyDetails="+e1.getCompDetails());
		System.out.println("IdDetails="+e1.getIdDetails());
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
