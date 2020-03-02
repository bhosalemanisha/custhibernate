package com.tdn.customerDAO;

import java.util.List;

import com.tdn.model.Customer;
import com.tdn.model.Userlogin;

public interface CustomerDAOI {
	public Long insertcustomer(Customer customer);
	public List<Customer>getallcustomer();
	public Customer findById(long id);
	public void updatecustomer(Customer customer);
	public void deletecustomer(Customer customer);
	}
