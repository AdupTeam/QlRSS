<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.*" %>
<html>
<meta http-equiv="refresh" content="3;URL='rss_config.jsp'" />
<body>
<h2>RSS SUPER READER <small>adding new source</small></h2>

</body>
<%
String source = request.getParameter("rss_source");
System.out.println(source);
RSSConfig rss = new RSSConfig();
rss.addSource(source);
%>
<p style="color: #008800">New RSS source has been added.</p>
</html>
