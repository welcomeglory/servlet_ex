<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="rectangle" method="post">
        폭: <input type="text" id="width" name="width" size="10">
         <button type="button" onclick="clearWidth()">Reset</button><br>
        높이: <input type="text" id="height" name="height" size="10">
         <button type="button" onclick="clearHeight()">Reset</button><br>
        <input type="reset"><br/>
        <input type="submit" value="제출">
    </form>
    <script>
            function clearWidth() {
            	document.getElementById("width").value = "";
            }
            function clearHeight() {
                document.getElementById("height").value = "";
            }
        </script>
</body>
</html>