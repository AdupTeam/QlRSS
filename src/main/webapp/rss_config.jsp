
<%@ page language="java" import="java.util.*" %>

<html>
<head>
    <style>
        td, h2, h3 {
            padding: 5px;
            display:table-cell;
            vertical-align:middle;
            font-family:"Verdana",Sans-Serif;
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
                <td><input type="text" name="rss_link" placeholder="http://rss.cnn.com/rss/edition.rss" style="width: 500px;height:2em"></td>
            </tr>
            <tr>
                <td>Remove rss with id: </td>
                <td><input type="text" name="id" placeholder="0" style="width: 500px;height:2em"> </td>
            </tr>
            <tr>
                <td><input type="submit" value="Send RSS feeds"/></td>
            </tr>

        </tbody>
    </table>
</form>
<br>

<h3> LIST OF CURRENT RSS SOURCES </h3>

</body>
</html>
