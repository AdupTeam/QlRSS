<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.*" %>
<html>
<body>
<h2>RSS SUPER READER</h2>

</body>
<%
        String feedAll = "";
        RSSConfig rssconf = new RSSConfig();
        rssconf.loadConfig();

        List<String> list = rssconf.getList();

        for (int i = 0; i < list.size(); i++){
            RSSFeedParser parser = new RSSFeedParser(list.get(i));
            Feed feed = parser.readFeed();
            for (FeedMessage message : feed.getMessages()) {
                feedAll += message;
            }
        }

        SendMail.send(request.getParameter("username"),
                request.getParameter("password"),
                request.getParameter("email"),
                "RSS Feeds for breakfast",
                feedAll);

%>
<p style="color: #008800">Email with rss feeds has been sent to the recipient.</p>
</html>
