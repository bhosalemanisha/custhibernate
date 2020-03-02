package com.tdn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tdn.customerDAO.CustomerDAOI;
import com.tdn.customerDAO.CustomerDAOImp;
import com.tdn.model.Customer;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Long id =Long.parseLong( request.getParameter("id"));
		CustomerDAOI customerdao= new CustomerDAOImp();
		  Customer customers =customerdao.findById(id);
		  request.setAttribute("customer", customers);
		  RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
	        dispatcher.forward(request, response);
	 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("last-name");
		String mobileNo = request.getParameter("mobile-no");
		String address= request.getParameter("address");
		Customer customer =  new Customer();
		customer.setId(id);
		System.out.println(customer.getId()+customer.getFirstName()+customer.getLastName()+customer.getAddress()+customer.getMobileNo());
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setMobileNo(mobileNo);
		customer.setAddress(address);
		
		CustomerDAOI customerDAO = new CustomerDAOImp();
		customerDAO.deletecustomer(customer);
		response.sendRedirect("sucess.jsp");

			}

}
