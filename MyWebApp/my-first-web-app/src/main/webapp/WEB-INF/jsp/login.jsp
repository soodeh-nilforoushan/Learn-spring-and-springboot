<html>
<head>
    <title>
        login page
    </title>
</head>
<body>

welcome to login page!
<%--    when we use get for requst method, all the information that we enter are showing in the url and it is not secure --%>
<%--the default value for method is get --%>
<pre>${errorMessage}</pre>
<form method="post">
    name: <input type="text" name="what's Your Name">
    password: <input type="password" name="what's Your Password">
    <input type="submit">
</form>
</body>

</html>