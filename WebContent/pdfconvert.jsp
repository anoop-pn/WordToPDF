<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> WORD TO PDF CONVERTER </title>
</head>
<body>
<center><img src="backgroundimage.jpg"/></center>
<h1><center>Text TO PDF CONVERTER</center></h1>
<form action="pdfconverter1" method="get">
<label>Choose File:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="file" size="30" name="inputfile"/></label>
<br><br>
<label>Choose Location To Save PDF File:<input size="30" type="text" name="outfile"/></label><br><br><br>
<center><input type="submit" value="CONVERT To PDF"/></center>
</form>
</body>
</html>