package com.tdn.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tdn.customerDAO.CustomerDAOI;
import com.tdn.customerDAO.CustomerDAOImp;
import com.tdn.model.Customer;


@WebServlet("/ListSevlet")
public class ListSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CustomerDAOI customerdao= new CustomerDAOImp();
		  List<Customer> customers =customerdao.getallcustomer();
		  if(!customers.isEmpty()) {
			  request.setAttribute("listUser", customers);
		       // System.out.println(customers);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("list-all.jsp");
		        dispatcher.forward(request, response);
		  } else {
			  response.sendRedirect("error.jsp");
		  }
		   

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	}

}
