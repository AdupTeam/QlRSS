<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.RSSFeedParser" %>
<%@ page import="RSS.FeedMessage" %>
<%@ page import="RSS.Feed" %>
<html>
<body>
<h2>Super Example Calc</h2>

</body>
<%
RSSFeedParser parser = new RSSFeedParser(request.getParameter("feed"));
        Feed feed = parser.readFeed();
        String feedAll = "";
        for (FeedMessage message : feed.getMessages()) {
            feedAll += message + "<br />";
        }
%>
<p>Result: <%=feedAll%></p>
</html>
