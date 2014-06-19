<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.*" %>
<html>
<meta http-equiv="refresh" content="3;URL='rss_config.jsp'" />
<body>
<h2>RSS SUPER READER <small style="color: #AAA">/ removing source</small></h2>

</body>
<%
    int id = Integer.parseInt( request.getParameter("id") );
    System.out.println(id);
    RSSConfig rss = new RSSConfig();
    rss.removeSource(id);
%>
<p style="color: #008800">Specified RSS source has been removed</p>
</html>
