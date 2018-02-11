<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<fo:form method="post" action="addmob" modelAttribute="my">

<tr>
<td>Mobile Name</td>
<td><fo:input path="mobileName"/></td>
<td><fo:errors path="mobileName"></fo:errors></td>
</tr>

<tr>
<td>Mobile Price</td>
<td><fo:input path="mobilePrice"/>
<td><fo:errors path="mobilePrice"></fo:errors></td>
</tr>

<tr>
<td>Brand</td>
<td><fo:select path="mobileBrand" items="${mylist}"/>
</td>
</tr>

<tr>
<td>4G LTE Enabled</td>
<td>yes<fo:radiobutton path="feature" value="yes"/>
No<fo:radiobutton path="feature" value="no"/>
<td><fo:errors path="feature"></fo:errors></td>
</tr>

<tr>
<td><input type="submit" value="add mobile"/>
</tr>

</fo:form>
</table>
</body>
</html>