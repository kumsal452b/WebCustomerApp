<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	<div id="wraper">
		<div id="Header">
			<h2>CRM-Customer Relationship Managar</h2>
			
		</div>
		<div id="container">
			<div id="content">
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
					</tr>
					<?php foreach($rows as $value): ?>
   		
					<?php endforeach; ?>
				</table>
			</div>
		</div>
	</div>
</body>
</html>