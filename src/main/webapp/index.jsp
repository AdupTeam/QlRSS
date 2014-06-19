
<%@ page language="java" import="java.util.*" %>

<html>
<head>
    <style>
        td, h2 {
            padding: 5px;
            display:table-cell;
            vertical-align:middle;
            font-family:"Verdana",Sans-Serif;
        }
    </style>
</head>
<body>
<h2> RSS SUPER READER <small><a href="rss_config.jsp" style="text-decoration:none; color: #AAA">/ manage sources </a> </small></h2>
<br>
<form action="rfeed.jsp">
    <table>
        <tbody>
            <!-- Useless

            <tr>
                <td>Feed Url</td>
                <td><input type="text" name="feed" value="http://rss.cnn.com/rss/edition.rss" style="width: 500px;height:2em"></td>
            </tr>
            <tr>
                <td>SMTP Server: </td>
                <td><input type="text" name="server" value="smtp.gmail.com" style="width: 500px;height:2em"></td>
            </tr>
            -->
            <tr>
                <td>Send to: </td>
                <td><input type="text" name="email" placeholder="username@domain.com" style="width: 500px;height:2em"> </td>
            </tr>
            <tr>
                <td>Send from: </td>
                <td><input type="text" name="username" placeholder="username" style="width: 250px;height:2em"> @gmail.com</td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="password" name="password" placeholder="password" style="width: 250px;height:2em"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Send RSS feeds"/></td>
            </tr>

        </tbody>
    </table>
</form>
<br>


</body>
</html>
