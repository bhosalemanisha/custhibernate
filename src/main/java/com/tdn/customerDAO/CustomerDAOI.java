package com.tdn.customerDAO;

import java.util.List;

import com.tdn.model.Customer;

public interface CustomerDAOI {
	public Long insertcustomer(Customer customer);
	public List<Customer>getallcustomer();
}
