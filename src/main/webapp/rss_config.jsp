
<%@ page language="java" import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="RSS.RSSFeedParser" %>
<%@ page import="RSS.FeedMessage" %>
<%@ page import="RSS.Feed" %>
<%@ page import="RSS.GoogleMail" %>
<%@ page import="RSS.RSSConfig" %>

<html>
<head>
    <style>
        td, h2, h3 {
            padding: 5px;
            display:table-cell;
            vertical-align:middle;
            font-family:"Verdana",Sans-Serif;
        }
        .with_borders {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h2> RSS CONFIG</h2>

<form action="remove_rss.jsp">
    <table>
        <tbody>
            <tr>
                <td>Add rss</td>
                <td><input type="text" name="rss_link" placeholder="http://rss.cnn.com/rss/edition.rss" style="width: 250px;height:2em"> <input type="submit" value="Add"/> </td>
            </tr>
            <tr>
                <td>Remove rss with id: </td>
                <td><input type="text" name="id" placeholder="0" style="width: 250px;height:2em"> <input type="submit" value="Remove"/> </td>
            </tr>

        </tbody>
    </table>
</form>
<br>

<h3> LIST OF CURRENT RSS SOURCES </h3>
<%
    RSSConfig rss = new RSSConfig();
    rss.loadConfig();
    rss.printConfig();

    List<String> list = rss.getList();

%>
<table>
    <tr>
        <th class="with_borders"> # </th>
        <th class="with_borders"> Source </th>
    </tr>
<%
    for (int i=0;i<list.size();i++){
        out.println("<tr>");
        out.println("<td class='with_borders'>" + i + "</td>");
        out.println("<td class='with_borders'>" + list.get(i) + "</td>");
        out.println("</tr>");
    }
%>
</table>




</body>
</html>
