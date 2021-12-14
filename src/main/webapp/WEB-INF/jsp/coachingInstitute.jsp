<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CoachingInstitute</title>
</head>
<body>
<h2>Data is accessing from Coaching Institute</h2>
 <a href="/saveNewDetail">Create</a>
  <table border="2">
    <thead>
     <tr>
      <th>Fees</th>
      <th>Salary</th>
      <th>Maintenance</th>
      <th>Head Of Finance Department</th>
      <th>Update</th>
      <th>Delete</th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${institute}" var="inst"> 
      <tr>
       <td>${inst.fees }</td>
       <td>${inst.salary}</td>
       <td>${inst.maintenance }</td>
       <td>${inst.head_of_financeDepartment}</td>
       <td><a href="/saveNewDetail?id=${inst.id }">Update</a></td>
       <td><a href="/delete?id=${inst.id }">Delete</a></td>
      <c:forEach items ="${inst.coachingInstituteAddress}" var ="place">
       <tr><td>Location</td><td>${place.location }</td></tr>
      </c:forEach>
      
      </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>