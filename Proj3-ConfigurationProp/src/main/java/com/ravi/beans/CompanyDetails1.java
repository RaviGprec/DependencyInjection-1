package com.ravi.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp1")
@Data
public class CompanyDetails1 {
	
	@Value("${org.rk.name}")
	public String title;
	@Value("${org.rk.type}")
	public String type;
	@Value("${org.rk.location}")
	public String addr;
	@Override
	public String toString() {
		return "CompanyDetails1 [title=" + title + ", type=" + type + ", addr=" + addr + "]";
	}
	
}
