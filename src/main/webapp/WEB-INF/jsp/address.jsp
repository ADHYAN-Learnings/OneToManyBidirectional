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
<h2>Data is accessing from Address side</h2>
 <a href="/address/saveNewDetail">Create</a>
  <table border="2">
    <thead>
     <tr>
     <th>Location</th>
      <th>Fees</th>
      <th>Salary</th>
      <th>Maintenance</th>
      <th>Head Of Finance Department</th>
      <th>Update</th>
      <th>Delete</th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${address}" var="addr"> 
      <tr>
       <td>${addr.location}</td>
       <td>${addr.addressCoachingInstitute.fees }</td>
       <td>${addr.addressCoachingInstitute.salary}</td>
       <td>${addr.addressCoachingInstitute.maintenance }</td>
       <td>${addr.addressCoachingInstitute.head_of_financeDepartment}</td>
       <td><a href="/address/saveNewDetail?id=${addr.id }">Update</a></td>
       <td><a href="/address/delete?id=${addr.id }">Delete</a></td>
    <!--    <c:forEach items ="${inst.coachingInstituteAddress}" var ="place">
       <tr><td>Location</td><td>${place.location }</td></tr>
      </c:forEach>
     --> 
      </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>