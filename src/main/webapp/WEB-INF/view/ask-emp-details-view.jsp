<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<body>

<h2>Dear Employee, Please enter your details</h2>
<br>
<br>
<%-- Первый урок --%>
<%--<form action="show" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name"/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>

<form:form action="showEmpDetails" modelAttribute="employee">

    Name<form:input path="name"/>
    <br>
    <br>
    Surname<form:input path="surname"/>
    <br>
    <br>
    Salary<form:input path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>

</form:select>
    <br>
    <br>

    Which car do you want?
    <br>
    <br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>
    Foreign Language(s)
    <br>
    <br>
    <form:checkboxes path="languages" items="${employee.languageMap}"/>
    <br>
    <br>
    <input type="submit" value="OK!">

</form:form>
</body>

</html>