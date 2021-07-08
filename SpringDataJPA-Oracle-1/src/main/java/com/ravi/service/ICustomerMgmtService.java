package com.ravi.service;

import java.util.*;

import com.ravi.entity.Customers;

public interface ICustomerMgmtService {
	public String registerCustomer(Customers customer);
	public List<Customers> fetchAllCustomer();
	public Optional<Customers> getCustomerDetailsById(Long cid);
	
}
