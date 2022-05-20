<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>
<div>
    <h1 align="center">Web Calculator</h1>
    <form action="calculate" method="POST">
        <div align="center">
            Input number <input type="number" name="a" required/>
            <br>
            Sign ( + / - *) <input name="sign" id="sign">
            <br>
            Input number <input type="number" name="b" required/>
            <br>
            <button type="submit">Submit</button>

        </div>
    </form>
</div>

</body>
</html>