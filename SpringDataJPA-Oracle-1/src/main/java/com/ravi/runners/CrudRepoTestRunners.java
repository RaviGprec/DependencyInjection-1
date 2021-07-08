package com.ravi.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.ravi.entity.Customers;
import com.ravi.service.ICustomerMgmtService;

import java.util.*;

@Component
public class CrudRepoTestRunners implements CommandLineRunner{
	
	@Autowired
	private ICustomerMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Customers c1 = new Customers(null,"Sahil","sahi@gmail.com","DHL");
 
		try {
			String registerCust = service.registerCustomer(c1);
			List<Customers> savedCustomers = service.fetchAllCustomer();
			savedCustomers.forEach(System.out::println);
			}
			catch(DataAccessException dae) {
				dae.printStackTrace();
			}
	}

}
