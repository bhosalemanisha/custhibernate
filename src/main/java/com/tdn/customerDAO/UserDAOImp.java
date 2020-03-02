package com.tdn.customerDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tdn.customerDAO.UserDAOI;

import com.tdn.model.Userlogin;
import com.tdn.utility.Hiberutility;

public class UserDAOImp implements UserDAOI {
	private SessionFactory sessionFactory = Hiberutility.getSessionFactory();

	@Override
	public Userlogin findByUserName(String username) {
		Session session= sessionFactory.openSession();
		Userlogin user= session.get(Userlogin.class, username);
		session.close();
		return user;
			}

	
}
