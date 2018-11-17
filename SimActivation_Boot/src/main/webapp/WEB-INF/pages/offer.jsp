<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>



<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>Offers</title>



</head>



<body>



<h2>Your offer details</h2>



<h2>Special offer</h2>



<form:form action="customerValidate">



<c:if test="${callQty ne null}"> <div class="text-center text-danger">${callQty} min Free



<c:if test="${dataQty ne null}">



<span>+ ${dataQty} gb data</span>



</c:if>



</div>



</c:if>



<c:if test="${callQty eq null}"><div>No Offers available</div></c:if>



<input type="submit" class="btn btn-primary" value="Next" />



</form:form>



</body>



</html>





