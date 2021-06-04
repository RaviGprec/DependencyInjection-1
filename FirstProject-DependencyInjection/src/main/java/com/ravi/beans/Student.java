package com.ravi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("stud")

public class Student {
	@Autowired
	@Qualifier("courseId")
	private ICourseMaterial icourseMaterial;
	
	public void preparation(String examName) {
		System.out.println("Preparation Started for "+examName);
		String courseContent = icourseMaterial.courseContent();
		double price = icourseMaterial.price();
		System.out.println("preparation is going on using"+courseContent+" material  with price ::"+price);
		System.out.println("preparation is completed for "+examName);
	}
}
