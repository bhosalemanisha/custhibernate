<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@include file="header.jsp" %>

</head>
<body>
<div class="container">
 <%@include file="menu.jsp" %>
 
  <form action="<%=request.getContextPath()%>/AddcustomerServlet" method="post">
 	  <div class="form-group">
	    <label for="inputFirstName">First Name</label>
	    <input type="text" class="form-control" id="inputFirstName"  aria-describedby="emailHelp" name="first-name" placeholder="Enter First Name"/>	    
	  </div>
	   <div class="form-group">
	    <label for="inputlastName">Last Name</label>
	    <input type="text" class="form-control" id="inputlastName" aria-describedby="emailHelp" name="last-name" placeholder="Enter Last Name"/>	   
	  </div>
	   <div class="form-group">
	    <label for="inputMobileNo">Mobile No</label>
	    <input type="number" class="form-control" id="inputMobileNo" aria-describedby="emailHelp" name="mobile-no" placeholder="Mobile No"/>
	    <small id="emailHelp" class="form-text text-muted">Enter Mobile No in 10 digit format</small>
	  </div>
	  <div class="form-group">
	    <label for="inputaddressId">Address</label>
	    <input type="address" class="form-control" id="inputaddress" name="address" placeholder="Enter address"/>
	    <small id="addressHelp" class="form-text text-muted">Enter address</small>
	  </div>	 
	  <button type="submit" class="btn btn-primary">Add Customer</button>
	</form>
	
</div>


  
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


</body>
</html>