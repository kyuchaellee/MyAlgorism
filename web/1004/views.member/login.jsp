<%--
  Created by IntelliJ IDEA.
  User: zldnl
  Date: 2022-10-04
  Time: 오전 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    <h1>${param.errorr}</h1>
    <div>
        <input type="text" name="mid"/>
    </div>
    <div>
        <input type="text" name="mpw"/>
    </div>
    <div>
        <button>Login</button>
    </div>
</form>

</body>
</html>
