package org.apache.jsp.cybersecurity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminchange_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cybersecurity/sidebar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>form</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/icofont.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"stylec.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icofont.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sidebar/style.default.css\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.png\">\n");
      out.write("    <link href=\"stylec.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\" style=\"padding-top: 30px; background-color: #072E5F;\">\n");
      out.write("          <div class=\"col-md-8\" style=\"color:white;font-size: 25px;padding-bottom: 20px;padding-left: 50px;\"><b>WELCOME TO ADMIN DASHBOARD</b></div>\n");
      out.write("          <div class=\"col-md-4\" style=\"padding-left:250px;color: white\">\n");
      out.write("              <i class=\"icofont icofont-logout\"></i>\n");
      out.write("              \n");
      out.write("              <button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\".bs-example-modal-sm\">Logout modal</button>\n");
      out.write("\n");
      out.write("<div class=\"modal bs-example-modal-sm\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-sm\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\"><h4>Logout <i class=\"fa fa-lock\"></i></h4></div>\n");
      out.write("      <div class=\"modal-body\"><i class=\"fa fa-question-circle\"></i> Are you sure you want to log-off?</div>\n");
      out.write("      <div class=\"modal-footer\"><a href=\"javascript:;\" class=\"btn btn-primary btn-block\">Logout</a></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("          </div></div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("       ");
      out.write("\n");
      out.write("<style>.ho:hover{color: #072E5F}</style>\n");
      out.write("        <nav class=\"side-navbar\" style=\"padding-bottom: 200px;background-color:#072E5F\">\n");
      out.write("               \n");
      out.write("            <img src=\"images/download (3).jpg\" style=\"width: 250px; height: 150px\">\n");
      out.write("          <!-- Sidebar Header-->\n");
      out.write("          <a id=\"toggle-btn\" href=\"#\" class=\"menu-btn active\"><span></span><span></span><span></span></a>\n");
      out.write("          <!-- Sidebar Navidation Menus-->\n");
      out.write("          <ul class=\"list-unstyled\">\n");
      out.write("           \n");
      out.write("              \n");
      out.write("             <li><a href=\"#usersDropdown\" style=\"color:white;background-color: #072E5F\" aria-expanded=\"false\" data-toggle=\"collapse\"> <i class=\"icofont icofont-user\"></i>Users </a>\n");
      out.write("              <ul id=\"usersDropdown\" class=\"collapse list-unstyled \">\n");
      out.write("                  <li><a style=\"background-color:white;color:#072E5F\" class=\"ho\" href=\"register.jsp\">Add</a></li>\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\" href=\"user.jsp\">Display</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("              <hr/>\n");
      out.write("          \n");
      out.write("         <li><a href=\"#newsDropdown\" style=\"color:white;background-color: #072E5F\" aria-expanded=\"false\" data-toggle=\"collapse\"> <i class=\"icofont icofont-news\"></i>News</a>\n");
      out.write("              <ul id=\"newsDropdown\" class=\"collapse list-unstyled \">\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\" href=\"admin.jsp\">Add</a></li>\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\"  href=\"news.jsp\">Display</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("            <hr/>\n");
      out.write("            <li><a href=\"#attackDropdown\" style=\"color:white;background-color: #072E5F\" aria-expanded=\"false\" data-toggle=\"collapse\"> <i class=\"icofont icofont-exclamation-tringle\"></i>Attacks </a>\n");
      out.write("              <ul id=\"attackDropdown\" class=\"collapse list-unstyled \">\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\" href=\"attacks.jsp\">Add</a></li>\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\" href=\"attackd.jsp\">Display</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <hr/>\n");
      out.write("             <li><a href=\"#attacknewsDropdown\" style=\"color:white;background-color: #072E5F\" aria-expanded=\"false\" data-toggle=\"collapse\"> <i class=\"icofont icofont-not-allowed\"></i>Attack News</a>\n");
      out.write("              <ul id=\"attacknewsDropdown\" class=\"collapse list-unstyled \">\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\" href=\"anews.jsp\">Add</a></li>\n");
      out.write("                <li><a style=\"background-color:white;color:#072E5F\" href=\"anewsd.jsp\">Display</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("             <hr/>\n");
      out.write("              <li><a href=\"consultd.jsp\" style=\"color:white;background-color: #072E5F\"> <i class=\"icofont icofont-not-allowed\"></i>Consult</a>\n");
      out.write("             \n");
      out.write("            </li>\n");
      out.write("            <hr/>\n");
      out.write("             <li><a href=\"expert.jsp\" style=\"color:white;background-color: #072E5F\"> <i class=\"icofont icofont-not-allowed\"></i>Expert</a>\n");
      out.write("             \n");
      out.write("            </li>\n");
      out.write("            <hr/>\n");
      out.write("          </ul>\n");
      out.write("          <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"> </script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/front.js\"></script>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("      ");
      out.write("\n");
      out.write("          </div>\n");
      out.write("              <div class=\"col-md-8\" style=\"padding-left:100px\">\n");
      out.write("  \n");
      out.write("        <div class=\"container mt-2\">\n");
      out.write("        <form class=\"needs-validation\" novalidate action=\"main7.jsp\" method=\"POST\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("         \n");
      out.write("            <div class=\"col-md-8\" style=\"padding-top:100px\">\n");
      out.write("                <h2 style=\"color:#008080;font-size: 35px\" class=\"text-center \"><b></b>CHANGE PASSWORD </h2><br/>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                     \n");
      out.write("                    <input type=\"text\" name=\"op\" required class=\"form-control\" placeholder=\"Enter Old Password\">\n");
      out.write("                         <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" name=\"np\" required class=\"form-control\"  placeholder=\"Enter New Password\">\n");
      out.write("                         <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("                        <div class=\"input-group-append\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" name=\"cp\" required class=\"form-control\"  placeholder=\"Confirm Password\">\n");
      out.write("                         <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("                        <div class=\"input-group-append\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-block btn-outline-info\"  style=\"background-color:#008080;color: white\" value=\"SUBMIT\" >\n");
      out.write("                     </div>\n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"col-md-4\"></div> \n");
      out.write("            <script>\n");
      out.write("        (function()\n");
      out.write("        {\n");
      out.write("         'use strict';\n");
      out.write("         window.addEventListener('load',function()\n");
      out.write("                                {\n");
      out.write("             var forms=document.getElementsByClassName('needs-validation');\n");
      out.write("             var validation=Array.prototype.filter.call(forms,function(form)\n");
      out.write("                {\n");
      out.write("             form.addEventListener('submit',function(event)\n");
      out.write("             {\n");
      out.write("                if(form.checkValidity()==false)\n");
      out.write("             {\n");
      out.write("                 event.preventDefault();\n");
      out.write("                 event.stopPropagation();\n");
      out.write("             }\n");
      out.write("             form.classList.add('was-validated');\n");
      out.write("      },false);\n");
      out.write("         });\n");
      out.write(" },false);\n");
      out.write("        })();\n");
      out.write("        </script>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
