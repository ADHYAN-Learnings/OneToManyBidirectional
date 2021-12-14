 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<%@ page isELIgnored="false" %>

<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Insert Coaching Institute Details</title>
<style type="text/css">
 .error {
    color : red;
    font-style : italic;
 }
</style>
</head>
<body>
 <div>
  <h2>New Details</h2>
  <div>
    <form:form action="/add" modelAttribute="institute"  method="post">
    <div>
     <table>
      <tr><td><form:label path="salary">Salary :</form:label></td>
      <td>
        <form:input type="text" id="salary" path="salary"/>
        <form:errors path="salary" cssClass="error"/>
      </td>
      </tr>
      
      <tr><td><form:label path="fees">Fees</form:label></td>
      <td>
       <form:input type="text" id="fees" path="fees"/>
       <form:errors path="fees"  cssClass="error"/>
      </td>
      </tr>
      
      <tr><td><form:label path="maintenance">Maintenance</form:label></td>
      <td>
        <form:input type="text" id="maintenance" path="maintenance"/>
        <form:errors path="maintenance" cssClass="error"/>
      </td>
      </tr>
      
      <tr><td><form:label path="head_of_financeDepartment">Head Of Finance Department</form:label></td>
      <td>
      <form:input type="text" id="head_of_financeDepartment" path="head_of_financeDepartment"/>
      <form:errors path="head_of_financeDepartment" cssClass="error"/>
      </td></tr>
       
         <c:choose>
         <c:when test="${not empty institute.coachingInstituteAddress }">
           
           <c:forEach items ="${ institute.coachingInstituteAddress }" var ="place">
            <tr><td>Location</td><td><input type="text" name="location" value="${place.location}"></td></tr>
            
           </c:forEach>
          
         </c:when>
         <c:otherwise>
          <tr><td>Location</td><td><input type="text" name="location"></td></tr>
          <tr><td>Location</td><td><input type="text" name="location"></td></tr>
          <tr><td>Location</td><td><input type="text" name="location"></td></tr>
          <tr><td>Location</td><td><input type="text" name="location"></td></tr>
          <tr><td>Location</td><td><input type="text" name="location"></td></tr>
         </c:otherwise>
       </c:choose>
       
       
        <form:input type="hidden"  path="id"/>
    <tr><td colspan="2"><input type="submit" value="Add Details"></td></tr>
    </table>
    </div> 
    </form:form>
  </div>
 </div>
</body>
</html>	