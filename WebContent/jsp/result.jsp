<%@page import="java.util.Date"%>
<%@page import="mutation.model.ResultModel"%>  
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<title>Mutation Test</title>
</head>
<body>
	<%
	ResultModel result = (ResultModel)request.getAttribute("result");
	String proteinid = result.getProteinID();
	String mutation = result.getMutation();
	char fromAA = result.getFromAA();
	char toAA = result.getToAA();
	int position = result.getPosition();
	%>
	<p>Protein ID: <% out.print(proteinid); %></p>
	<p>Mutation: <% out.print(mutation); %></p>
	<p>From: <%out.print(fromAA); %></p>
	<p>To: <%out.print(toAA); %></p>
	<p>Position: <%out.print(String.valueOf(position)); %></p>
</body>
</html>