<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Customer Validation</title>

</head>

<body>

                <form:form method = "POST" action="custValidate" modelAttribute="command">

                                                <div class="form-group">

                                                                <form:label path="dateOfBirth" required = "true">Date Of Birth</form:label>

                                                                <br>

                                                                <form:input path="dateOfBirth" class="form-control" />

                                                                <br>

                                                                <form:errors path="dateOfBirth" />                                                                                      

                                                </div>

                                                                                                                                               

                                                <div class="form-group">

                                                                <form:label path="emailAddress">Email Address</form:label>

                                                                <br>

                                                                <form:input path="emailAddress" class="form-control" />

                                                                <br>

                                                                <form:errors path="emailAddress" />                                  

                                                </div>

                                               

                                                <input type="submit" class="btn btn-primary" value="Validate" />

                                               

                                                <div class="col-md-12 text-center">

                <div class="text-center text-danger">${message1}</div> 

            </div>

           

           <c:if test="${message2 ne null}">

                                                                <a href="personalDetails"> &nbsp;Proceed</a>     

                                   </c:if>                               

                                               

                                </form:form>  

</body>

</html>

