package com.ravi.repo;

import org.springframework.data.repository.CrudRepository;

import com.ravi.entity.Customers;

public interface ICustomerRepo extends CrudRepository<Customers, Long>{

}
