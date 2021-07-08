package com.ravi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cust_id;
	private String cname;
	private String email_id;
	private String address;
}
