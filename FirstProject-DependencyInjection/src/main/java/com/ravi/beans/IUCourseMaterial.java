package com.ravi.beans;

import org.springframework.stereotype.Component;

@Component("UI")
public class IUCourseMaterial implements ICourseMaterial{

	public IUCourseMaterial() {
		// TODO Auto-generated constructor stub
		System.out.println("0-param Constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("UICourseMaterial.courseContent()");
		return "1.html ,2.java script ,3.css  and etc..";
	}

	@Override
	public double price() {
		System.out.println("UICourseMaterial.price()");
		return 200;
	}
	
	
}
