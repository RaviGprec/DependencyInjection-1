package com.ravi.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp2")
@Data
@ConfigurationProperties(prefix="org.rk")
public class CompanyDetails2 {
	
	public String name;//name ha to be matched with "name" in org.rk in application.properties
	public String type;//type ha to be matched with "name" in org.rk in application.properties
	public String location;//location ha to be matched with "name" in org.rk in application.properties
	@Override
	public String toString() {
		return "CompanyDetails2 [name=" + name + ", type=" + type + ", location=" + location + "]";
	}
}
