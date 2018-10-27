<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %> 
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>All Locations</title>
		
		<style type="text/css">
			th, td {
				border: 2px solid lightgrey;
				padding: 5px;
			}
		</style>
	</head>
	<body>
		<h1>All Locations</h1>
		
		<table style="border: 3px solid #990000; border-collapse: collapse">
			<thead>
				<tr>
					<th>Id</th>
					<th>Code</th>
					<th>Name</th>
					<th>Type</th>
					<th>Operations</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allLocations}" var="location">
					<tr>
						<td>${location.id}</td>
						<td>${location.code}</td>
						<td>${location.name}</td>
						<td>${location.type}</td>
						<td>
							<a href="#">Edit</a> | <a href="#">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="createLoc">Add Location</a>
	</body>
</html>