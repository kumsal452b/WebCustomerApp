<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">


</head>
<body>
	<div id="wraper">
		<div id="Header">
			<h2>CRM-Customer Relationship Managar</h2>
			
		</div>
		<div id="container">
			<div id="content">
				<input type="button" value="Add customer"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button"
				>
				
				<table>
					<tr>
						<th>
							First Name
						</th>
						<th>
							Last Name
						</th>
						<th>
							Email
						</th>
						<th>
							Action
						</th>
					</tr>
					<c:forEach var="tempCustomer" items="${customer}" >
								<c:url var="updateLink" value="/customer/showFormForUpdate">
									<c:param name="customerId" value="${tempCustomer.id}" />
								</c:url>	
								<tr>
									<td>${tempCustomer.firstName}</td>
									<td>${tempCustomer.lastName}</td>
									<td>${tempCustomer.email}</td>
									<td>
						
										<a href="${updateLink}">Update</a>
									</td>
								</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>