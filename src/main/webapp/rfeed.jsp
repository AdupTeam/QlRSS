<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="RSS.*" %>


<html>
<meta http-equiv="refresh" content="3;URL='index.jsp'" />
<body>
<h2>RSS SUPER READER <small style="color: #AAA">/ sending email</small></h2>

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
                feedAll += "PUBLICATION DATE: " + feed.getPubDate() + "\n";
                String mydate = feed.getPubDate();
                SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
                Date date = df.parse(mydate);
                long epoch = date.getTime();
                System.out.println(epoch/1000);

                feedAll += "Timestamp: " + (epoch/1000) + "\n";
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

