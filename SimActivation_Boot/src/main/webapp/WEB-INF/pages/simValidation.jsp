<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>







<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>



<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>Sim Validation</title>



</head>



<body>



	<div class="item">



		<h1>Your service details</h1>



		<form:form method="POST" action="simValidate" modelAttribute="command">



			<div class="form-group">



				<form:label path="simNumber" required="true">SIM Number</form:label>



				<br>



				<form:input path="simNumber" class="form-control" />



				<br>



				<form:errors path="simNumber" />



			</div>







			<div class="form-group">



				<form:label path="serviceNumber">Service Number</form:label>



				<br>



				<form:input path="serviceNumber" class="form-control" />



				<br>



				<form:errors path="serviceNumber" />



			</div>







			<input type="submit" class="btn btn-primary" value="Validate" />







			<div class="col-md-12 text-center">



				<div class="text-center text-danger">${message}</div>



			</div>







			<c:if test="${successMessage ne null}">



				<div align="center">${successMessage}



					<br> Click <a href="offer"> &nbsp;here </a>to view offers.



				</div>



			</c:if>







		</form:form>



	</div>



</body>



</html>



