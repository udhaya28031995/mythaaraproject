<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="removeprod" method="GET">
<table>
<tr>
<td>Enter Product ID to be removed</td>
<td><input type="text" name="removeid"/></td>
</tr>
<tr>
<td>
<input type="submit" value="Delete"/></td>
</tr>
</table>

</form>
${msg}
</body>
</html>