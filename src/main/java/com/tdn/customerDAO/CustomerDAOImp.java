package com.tdn.customerDAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tdn.model.Customer;
import com.tdn.utility.Hiberutility;

public class CustomerDAOImp implements CustomerDAOI{

	private SessionFactory sessionFactory = Hiberutility.getSessionFactory();
	
	@Override
	public Long insertcustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Long id =(Long) session.save(customer);
		tx.commit();
		session.close();
		return id;

			}

}
