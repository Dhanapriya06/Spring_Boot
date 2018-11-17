<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>



<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>ID details</title>



</head>



<body>



<div class="item">



                                <form:form method = "POST" action="idValidate" modelAttribute="command">



                                                <div class="form-group">



                                                                <form:label path="idType" required = "true">ID Type</form:label>



                                                                <br>



                                                                <input value='<c:out value="Aadhar"></c:out>' readonly="readonly" >



                                                                <br>



                                                                <form:errors path="idType" />                                                                                



                                                </div>



                                               



                                                <div class="form-group">



                                                                <form:label path="state">State</form:label>



                                                                <br>



                                                               



                                                                <form:select path="state" class="form-control">



                                                                                <form:option value="" label="--- Select ---"/>



                                                                                <form:option value="Andaman and Nicobar Islands" label = "Andaman and Nicobar Islands" />



                                                                                <form:option value="Andhra Pradesh" label = "Andhra Pradesh" />



                                                                                <form:option value="Arunachal Pradesh" label = "Arunachal Pradesh" />



                                                                                <form:option value="Assam" label = "Assam" />



                                                                                <form:option value="Bihar" label ="Bihar " />



                                                                                <form:option value="Chandigarh" label = "Chandigarh" />



                                                                                <form:option value="Chhattisgarh" label = "Chhattisgarh" />



                                                                                <form:option value="Dadra and Nagar Haveli" label ="Dadra and Nagar Haveli" />



                                                                                <form:option value="Daman and Diu" label = "Daman and Diu" />



                                                                                <form:option value="Delhi" label = "Delhi" />



                                                                                <form:option value="Goa" label = "Goa" />



                                                                                <form:option value="Gujarat" label = "Gujarat" />



                                                                                <form:option value="Haryana" label = "Haryana" />



                                                                                <form:option value="Himachal Pradesh" label = "Himachal Pradesh" />



                                                                                <form:option value="Jammu and Kashmir" label = "Jammu and Kashmir" />



                                                                                <form:option value="Jharkhand" label = "Jharkhand" />



                                                                                <form:option value="Karnataka" label = "Karnataka" />



                                                                                <form:option value="Kerala" label = "Kerala" />



                                                                                <form:option value="Lakshadweep" label = "Lakshadweep" />



                                                                                <form:option value="Madhya Pradesh" label = "Madhya Pradesh" />



                                                                                <form:option value="Maharashtra" label = "Maharashtra" />



                                                                                <form:option value="Manipur" label = "Manipur" />



                                                                                <form:option value="Meghalaya" label = "Meghalaya" />



                                                                                <form:option value="Mizoram" label = "Mizoram" />



                                                                                <form:option value="Nagaland" label = "Nagaland" />



                                                                                <form:option value="Orissa" label = "Orissa" />



                                                                                <form:option value="Pondicherry" label = "Pondicherry" />



                                                                                <form:option value="Punjab" label = "Punjab" />



                                                                                <form:option value="Rajasthan" label = "Rajasthan" />



                                                                                <form:option value="Sikkim" label = "Sikkim" />



                                                                                <form:option value="Tamil Nadu" label = "Tamil Nadu" />



                                                                                <form:option value="Tripura" label ="Tripura" />



                                                                                <form:option value="Uttaranchal" label = "Uttaranchal" />



                                                                                <form:option value="Uttar Pradesh" label ="Uttar Pradesh" />



                                                                                <form:option value="West Bengal" label = "West Bengal" />



                                                                </form:select>



                                                                <br>



                                                                <form:errors path="state" />                                    



                                                </div>



                                                                                                                                               



                                                <div class="form-group">



                                                                <form:label path="uniqueIdNumber">Unique Id Number</form:label>



                                                                <br>



                                                                <form:input path="uniqueIdNumber" class="form-control" />



                                                                <br>



                                                                <form:errors path="uniqueIdNumber" />                                           



                                                </div>



                                               



                                                <div class="form-group">



                                                                <form:label path="firstName">First Name</form:label>



                                                                <br>



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



                                                                <form:label path="dateOfBirth">Date Of Birth</form:label>



                                                                <br>



                                                                <form:input path="dateOfBirth" class="form-control" />



                                                                <br>



                                                                <form:errors path="dateOfBirth" />                                      



                                                </div>



                                               



                                               



                                               



                                                <input type="submit" class="btn btn-primary" value="Validate ID" />



                                               



                                                <div class="col-md-12 text-center">



                <div class="text-center text-danger">${message1}</div> 



            </div>



           



           <c:if test="${message2 ne null}">



                                                                <div align="center">${message2}



                                                                <br>



                                                                Click <a href="summary" >



                        &nbsp;here </a>to view summary.



                  </div>



                                                </c:if>                  



                                               



                                </form:form>  



</div>                                  



</body>



</html>





