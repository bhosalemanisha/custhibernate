package com.tdn.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberutility {
	private static SessionFactory sessionFactory = null;
	 
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        }
 
        return sessionFactory;
    }


}
