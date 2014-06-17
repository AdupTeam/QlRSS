<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.RSSFeedParser" %>
<%@ page import="RSS.FeedMessage" %>
<%@ page import="RSS.Feed" %>
<%@ page import="RSS.GoogleMail" %>
<html>
<body>
<h2>RSS SUPER READER</h2>

</body>
<%
RSSFeedParser parser = new RSSFeedParser(request.getParameter("feed"));
        Feed feed = parser.readFeed();
        String feedAll = "";
        for (FeedMessage message : feed.getMessages()) {
            feedAll += message;
        }

        GoogleMail.Send("informatykainzynierska",
                        "taradejnamusiodejsc",
                        "salaaaam+test@gmail.com",
                        "RSS Feeds for breakfast",
                        feedAll);
%>
<p style="color: #008800">Email with rss feeds has been sent to the recipient.</p>
</html>
