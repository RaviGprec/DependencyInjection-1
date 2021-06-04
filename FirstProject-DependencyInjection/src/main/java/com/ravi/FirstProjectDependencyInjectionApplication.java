package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.ravi.beans.Student;

@SpringBootApplication
@ImportResource("com/ravi/cfgs/applicationContext.xml")
public class FirstProjectDependencyInjectionApplication {

	public static void main(String[] args) {
		//Get IOC Container
		ApplicationContext ctx = SpringApplication.run(FirstProjectDependencyInjectionApplication.class, args);
		//get Target Spring bean class object
		Student s = ctx.getBean("stud",Student.class);
		//invoke preparation method
		s.preparation("Google Interview");
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
