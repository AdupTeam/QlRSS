<%@ page language="java" import="java.util.*" %>
<%@ page language="java" import="java.io.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="RSS.*" %>

<html>
<meta http-equiv="refresh" content="3;URL='index.jsp'" />
<body>
<h2>RSS SUPER READER <small style="color: #AAA">/ sending email</small></h2>

</body>
<%
        long biggest_timestamp = -1;
        int itimestamp = -1;
        String timestamp_file = "timestamp.txt";


        String feedAll = "";
        RSSConfig rssconf = new RSSConfig();
        rssconf.loadConfig();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(timestamp_file));
            String timestamp = reader.readLine();
            itimestamp = Integer.parseInt(timestamp);
            reader.close();

        }catch (IOException ex ){
             System.out.println("Oups. Exception in reading file");
        }

        List<String> list = rssconf.getList();

        for (int i = 0; i < list.size(); i++){
            RSSFeedParser parser = new RSSFeedParser(list.get(i));
            Feed feed = parser.readFeed();
            for (FeedMessage message : feed.getMessages()) {

                String mydate = feed.getPubDate();
                System.out.println(mydate);
                SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
                Date date = df.parse(mydate);
                long epoch = date.getTime();
                System.out.println("BIGGEST: " + biggest_timestamp);
                System.out.println("EPOCH: " + epoch);
                System.out.println("EPOCH/1000: " + (epoch/1000));
                System.out.println("ITIMESTAMP: " + itimestamp);
                System.out.println(" ");
                if ( biggest_timestamp < (epoch/1000) ){
                    biggest_timestamp = (epoch/1000);
                }
                if ( (epoch/1000) > itimestamp ){
                    feedAll += "PUBLICATION DATE: " + feed.getPubDate() + "\n";
                    feedAll += "Timestamp: " + (epoch/1000) + "\n";
                    feedAll += message;
                }

            }
        }

        SendMail.send(request.getParameter("username"),
                request.getParameter("password"),
                request.getParameter("email"),
                "RSS Feeds for breakfast",
                feedAll);

        try {
            PrintWriter myout = new PrintWriter(new BufferedWriter(new FileWriter(timestamp_file, false)));
            myout.println(biggest_timestamp);
            myout.close();
        }catch (IOException e) {
            System.out.println("Oups. Exception while updating timestamp.");
        }

%>
<p style="color: #008800">Email with rss feeds has been sent to the recipient.</p>
</html>

