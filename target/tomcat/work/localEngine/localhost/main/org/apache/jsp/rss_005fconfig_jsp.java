package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import RSS.RSSFeedParser;
import RSS.FeedMessage;
import RSS.Feed;
import RSS.GoogleMail;
import RSS.RSSConfig;

public final class rss_005fconfig_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <style>\r\n");
      out.write("        td, h2, h3 {\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            display:table-cell;\r\n");
      out.write("            vertical-align:middle;\r\n");
      out.write("            font-family:\"Verdana\",Sans-Serif;\r\n");
      out.write("        }\r\n");
      out.write("        .with_borders {\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2> RSS CONFIG</h2>\r\n");
      out.write("\r\n");
      out.write("<form action=\"remove_rss.jsp\">\r\n");
      out.write("    <table>\r\n");
      out.write("        <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Add rss</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"rss_link\" placeholder=\"http://rss.cnn.com/rss/edition.rss\" style=\"width: 250px;height:2em\"> <input type=\"submit\" value=\"Add\"/> </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Remove rss with id: </td>\r\n");
      out.write("                <td><input type=\"text\" name=\"id\" placeholder=\"0\" style=\"width: 250px;height:2em\"> <input type=\"submit\" value=\"Remove\"/> </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<h3> LIST OF CURRENT RSS SOURCES </h3>\r\n");

    RSSConfig rss = new RSSConfig();
    rss.load_config();
    rss.print_config();

    List<String> list = rss.get_list();


      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th class=\"with_borders\"> # </th>\r\n");
      out.write("        <th class=\"with_borders\"> Source </th>\r\n");
      out.write("    </tr>\r\n");

    for (int i=0;i<list.size();i++){
        out.println("<tr>");
        out.println("<td class='with_borders'>" + i + "</td>");
        out.println("<td class='with_borders'>" + list.get(i) + "</td>");
        out.println("</tr>");
    }

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
