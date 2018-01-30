<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<script src="../javascript/main.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/main.css">
	<title>Mutation Test</title>
</head>
<body>
	<form action="../MutationServelet" name="frm" method="post">  <%--onSubmit="return validateForm();" --%>
		<label>Protein ID:</label>
		<input type="text" value="PA2GA_HUMAN" id="proteinid" name="proteinid" placeholder="e.g. PA2GA_HUMAN or P14555" required pattern="[a-zA-Z0-9\_]{5,}">

		<label>Mutation:</label>
		<input type="text" value="A10C" id="mutation" name="mutation" placeholder="e.g. A23C" required pattern="[A-Z][0-9]+[A-Z]">

		<input type="submit" value="request" />
	</form>
</body>
</html>