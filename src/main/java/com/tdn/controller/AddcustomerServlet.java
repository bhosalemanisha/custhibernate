package com.tdn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tdn.model.Customer;
import com.tdn.utility.Hiberutility;


@WebServlet("/AddcustomerServlet")
public class AddcustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddcustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("last-name");
		String mobileNo = request.getParameter("mobile-no");
		String address= request.getParameter("address");
		
		if(!(firstName.isEmpty()) || !(lastName.isEmpty()) || !(mobileNo.isEmpty()) || !(address.isEmpty())) {
			Customer customer =  new Customer();
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setMobileNo(mobileNo);
			customer.setAddress(address);;
			
			SessionFactory sessionFactory = Hiberutility.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.save(customer);
			session.flush();
			tx.commit();
			session.close();
			response.sendRedirect("sucess.jsp");
		
			}

	}
	}
