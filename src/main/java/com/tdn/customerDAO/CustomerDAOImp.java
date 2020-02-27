package com.tdn.customerDAO;

import org.hibernate.Session;

import com.tdn.model.Customer;
import com.tdn.utility.Hiberutility;

public class CustomerDAOImp implements CustomerDAOI{

	
	@Override
	public Long insertcustomer(Customer customer) {
		Session session = (Session) Hiberutility.getSessionFactory();
		Long id =(Long) session.save(customer);
		return id;

			}

}
