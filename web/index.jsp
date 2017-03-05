<%--
  Created by IntelliJ IDEA.
  User: Алёна
  Date: 27.02.2017
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyPage</title>
    <meta charset="utf-8">
    <title>Results</title>
</head>
<body>
Hello! Input coeffs of the quadratic equation, please.
<form action="/page">
    <p><input name="A"></p>
    <p><input name="B"></p>
    <p><input name="C"></p>
    <p><input type="submit" , value="Go"></p>
</form>
<form method="post" action="">
    <table class="grid" id="dynamic" width="250" border="1" cellspacing="0" cellpadding="5">
        <caption>Results</caption>
        <tr>
            <th scope="col">First Root</th>
            <th scope="col">Second Root</th>
        </tr>
        <tr>
            <td>${outputA}</td>
            <td>${outputB}</td>
        </tr>
    </table>
</form>
</body>
</html>