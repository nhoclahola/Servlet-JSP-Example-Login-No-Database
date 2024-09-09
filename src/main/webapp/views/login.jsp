<%--
  Created by IntelliJ IDEA.
  User: nhoclahola
  Date: 9/9/2024
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<core:if test="${msg == false}">Login failed</core:if>
<core:if test="${msg == true}"><h1>Hello:${uName}</h1></core:if>
<br/>

</body>
</html>
