<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee you are WELCOME!!!</h2>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
<%--Your name: ${nameAttribute} ${description }--%>
Your name: ${employee.name}
<form:errors path="name"/>
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your salary: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Your Language (s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>


</body>

</html>