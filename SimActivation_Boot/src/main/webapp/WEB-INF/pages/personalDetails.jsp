<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>



<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>Customer Details</title>



</head>



<body>



                <form:form method = "POST" action="verifyDetails" modelAttribute="command">



                               



                                <div class="form-group">



                                                                <form:label path="dateOfBirth" required = "true">Date Of Birth</form:label>



                                                                <br>



                                                                <input value='<c:out value="${dateOfBirth}"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="dateOfBirth" />                                                                                      



                                                </div>



                                                                                                                                               



                                                <div class="form-group">



                                                                <form:label path="emailAddress">Email Address</form:label>



                                                                <br>



                                                                <input value='<c:out value="${emailAddress}"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="emailAddress" />                                  



                                                </div>



               



                                <div class="form-group">



                                                                <form:label path="firstName" required = "true">First Name</form:label>



                                                                <br>



                                                                <select>



                                                                <option label="---" value =""/>



                                                                <option label="Mr." value="Mr." />



                                                                <option label="Mrs." value="Mrs." />



                                                                <option label="Ms." value="Ms." />



                                                                </select>



                                                                <form:input path="firstName" class="form-control" />



                                                                <br>



                                                                <form:errors path="firstName" />                                                                                          



                                                </div>



                                                                                                                                               



                                                <div class="form-group">



                                                                <form:label path="lastName">Last Name</form:label>



                                                                <br>



                                                                <form:input path="lastName" class="form-control" />



                                                                <br>



                                                                <form:errors path="lastName" />                                           



                                                </div>



                                               



                                                <div class="form-group">



                                                                <form:label path="confirmEmailAddress">Confirm Email Address</form:label>



                                                                <br>



                                                                <form:input path="confirmEmailAddress" class="form-control" />



                                                                <br>



                                                                <form:errors path="confirmEmailAddress" />                                   



                                                </div>



                                               



                                                <input type="submit" class="btn btn-primary" value="Verify" />



                                               



                                                <div class="col-md-12 text-center">



                <div class="text-center text-danger">${message1}</div> 



            </div>



           



           <c:if test="${message2 ne null}">



                                                                <a href="address"> &nbsp;Proceed</a>     



                                   </c:if>                               



 



 



</form:form>



</body>



</html>



