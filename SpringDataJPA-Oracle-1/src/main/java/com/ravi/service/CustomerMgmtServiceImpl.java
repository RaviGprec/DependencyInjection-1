package com.ravi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.entity.Customers;
import com.ravi.repo.ICustomerRepo;

@Service("customerMgmtService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService{
	
	@Autowired
	private ICustomerRepo repository;
	
	@Override
	public String registerCustomer(Customers customer) {
		System.out.println("InMemory Proxy class name ::"+repository.getClass());
		Customers c = null;
		if(customer !=null)
			c = repository.save(customer);
			
		return c != null ? "Customer Registration is completed successfully": "Failed to register the customer";
	}

	@Override
	public List<Customers> fetchAllCustomer() {
		System.out.println("============Fetch All Customers=====================");
		List<Customers> fetchedCustomers= new ArrayList<Customers>();
		repository.findAll().forEach(c ->{
			fetchedCustomers.add(c);
		});
		return fetchedCustomers;
	}

	@Override
	public Optional<Customers> getCustomerDetailsById(Long cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
