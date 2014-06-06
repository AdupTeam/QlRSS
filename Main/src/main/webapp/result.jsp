<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="com.example.Calculator" %>
<html>
<body>
<h2>Super Example Calc</h2>

</body>
<%
    Calculator calc = new Calculator();
    calc.add(Integer.parseInt(request.getParameter("number1")),Integer.parseInt(request.getParameter("number2")));
%>
<p>Result: <%=calc.getResult()%></p>
</html>
