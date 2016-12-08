<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form method="post" action="test.action">
    1 + 1 = :<input type="text" name="answer">
    <input type="submit" value="send to Test">
</form>
<form method="post" action="testImpAction">
    1 + 1 = :<input type="text" name="answer">
    <input type="submit" value="send to TestImpAction">
</form>
<form method="post" action="testExtendsActionSupport.action">
    1 + 1 = :<input type="text" name="answer">
    <input type="submit" value="send to TestExtendsActionSupport">
</form>
</body>
</html>
