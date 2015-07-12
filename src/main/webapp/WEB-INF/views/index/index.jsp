<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<c:forEach items="${events}" var="event">
    <p>${event}</p>
</c:forEach>
</body>
</html>