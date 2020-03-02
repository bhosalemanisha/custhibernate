package com.tdn.customerDAO;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tdn.model.Customer;
import com.tdn.model.Userlogin;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getallcustomer() {
		Session session = sessionFactory.openSession();
		List<Customer> customerlist=session.createCriteria(Customer.class).list();		
		session.close();
		return customerlist;

		
		
	}

	@Override
	public Customer findById(long id) {
		Session session = sessionFactory.openSession();
		Customer customer= session.get(Customer.class, id);
		session.close();
		return customer;
	}

	@Override
	public void updatecustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(customer);
		tx.commit();
		session.close();
		//return id;
	}

	@Override
	public void deletecustomer(Customer customer) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(customer);
		tx.commit();
		session.close();
		
	}

	
	
	
}
