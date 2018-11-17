<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



 



 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>



<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>Summary</title>



</head>



<body>



                <div>



                <form:form method = "POST" action="complete" modelAttribute="command">



                                                <div class="form-group">



                                                                <form:label path="firstName" required = "true">First Name : </form:label>



                                                                <input value='<c:out value="${firstName}"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="firstName" />                                                                                          



                                                </div>



                                               



                                                <div class="form-group">



                                                                <form:label path="lastName" required = "true">Last Name : </form:label>



                                                                <input value='<c:out value="${lastName}"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="lastName" />                                                                                           



                                                </div>



                                               



                                                <div class="form-group">



                                                                <form:label path="dateOfBirth" required = "true">Date Of Birth : </form:label>



                                                                <input value='<c:out value="${dateOfBirth}"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="dateOfBirth" />                                                                                      



                                                </div>



                                                                                                                                               



                                                <div class="form-group">



                                                                <form:label path="emailAddress">Email Address : </form:label>



                                                                <br>



                                                                <input value='<c:out value="${emailAddress}"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="emailAddress" />                                  



                                                </div>



                                               



                                                <form:checkbox path="confirm" />Confirm Request



                                               



                                                <input type="submit" class="btn btn-primary" value="Activate Sim" />



                                                           



           <c:if test="${message2 ne null}">



                                                                <div align="center">${message2}</div>



                                                </c:if>  



                                               



                </form:form>



                </div>



</body>



</html>



