<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.*" %>
<html>
<body>
<h2>RSS SUPER READER</h2>

</body>
<%
int id = Integer.parseInt( request.getParameter("id") );
System.out.println(id);
RSSConfig rss = new RSSConfig();
rss.removeSource(id);

%>
<p style="color: #008800">Specified RSS source has been removed</p>
</html>
