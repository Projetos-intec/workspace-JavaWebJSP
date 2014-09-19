
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Calendar,java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='nl'>

<%!private Date datumBijdeclaratie;
	private Date datumInScriptlet;
%>

<head>
<title>Welkom bij Pizza Mama Mia</title>
<link rel='stylesheet' href='styles/default.css' />
</head>
<body>
	<header>
	<div id='logo'>
		<img src='images/pizzamamamia.png' alt='Pizza Mama Mia' />
	</div>
	<div id='demotitel'>
		<h1>Wellcome</h1>
	</div>
	</header>
	<nav>
	<ul>
		<li><a href='welkom'>Home</a></li>
		<li><a href='order'>Order</a></li>
		<li><a href='aboutus.html'>About us</a></li>
	</ul>
	</nav>
	<article>
	<h2>De best Pizza alles</h2>
		${msg}
		<br/>
	<%
		// dit is een declaratie 
			datumBijdeclaratie = new Date();
	%> <%
 	out.println("Datum in declaratie: " + datumBijdeclaratie);
 %><br />
	<%
		// dit is een scriptlet
			datumInScriptlet = new Date();
	%><br />
	<%
		out.println("Datum in scriptelet: " + datumInScriptlet);
	%><br />

	<%

		
	%> </article>
	<footer>
	<hr />
	Rocco Leplae - praktijk oefening JSP en Servlets </footer>
</body>
</html>

