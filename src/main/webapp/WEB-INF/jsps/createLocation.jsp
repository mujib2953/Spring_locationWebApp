<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Create Location</title>
	</head>
<body>
	<form method="saveLocation" action="POST">
		<pre>
		Id		: <input type="text" name="id" />
		Code	: <input type="text" name="code" />
		Name	: <input type="text" name="name" />
		Rural	: 
			Urban <input type="radio" name="type" value="URBANN" />
			Rural <input type="radio" name="type" value="RURAL" />
		<input type="submit" value="Save Location" />
		</pre>
	</form>
</body>
</html>