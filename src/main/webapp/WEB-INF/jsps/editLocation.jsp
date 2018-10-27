<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Edit Location</title>
	</head>
	<body>
		<h1>Edit Location</h1>
		<form method="POST" action="updateLoc">
			<pre>
			Id	: <input type="text" name="id" value="${activeLoc.id}" readonly="readonly"/>
			Code	: <input type="text" name="code" value="${activeLoc.code}" />
			Name	: <input type="text" name="name" value="${activeLoc.name}" />
			Type	: <input type="radio" name="type" value="URBAN" ${activeLoc.type=='URBAN'?'checked': '' } /> Urban 
				  <input type="radio" name="type" value="RURAL" ${activeLoc.type=='RURAL'?'checked': '' } /> Rural
				
			<input type="submit" value="Update Location" />
			</pre>
		</form>
		
	</body>
</html>