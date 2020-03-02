package com.tdn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tdn.customerDAO.UserDAOI;
import com.tdn.customerDAO.UserDAOImp;
import com.tdn.model.Userlogin;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	String errormsg="";
			String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        if ((!username.isEmpty())&&(!password.isEmpty())) {
	        	UserDAOI userdao=new  UserDAOImp();
	        	Userlogin user = userdao.findByUserName(username);
	        	if (user!=null) {
	        		if (password.equals(user.getPassword())) {
	        			response.sendRedirect("dashboard.jsp");
	        			
	        		}else {
	        			request.setAttribute("errormsg", "invalid username Or password");
	        			 	RequestDispatcher dispatcher = request.getRequestDispatcher("loginform.jsp");
		      		        dispatcher.forward(request, response);
		        	
						
					}
					
				}
	        	
	        }
				
			}
	      
}
