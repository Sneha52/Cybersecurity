package org.apache.jsp.cybersecurity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/cybersecurity/header.jsp");
    _jspx_dependants.add("/cybersecurity/footer1.jsp");
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
      out.write("    <title>contact us</title>\n");
      out.write("     <link href=\"stylec.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/icofont.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:  url(images/bg2.jpg); background-repeat: no-repeat;background-size: cover;background-attachment: fixed\">\n");
      out.write("       ");
      out.write(" <div class=\"row\" style=\"background-color:black;padding-top: 12px\">\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <a class=\"a1\" href=\"#\" style=\"padding-left: 10px\"><i id=\"i1\"class=\" icofont icofont-ui-call \"></i>Under Attack? S.O.S.Line 800.800.800</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("        <ul>\n");
      out.write("           \n");
      out.write("            <li class=\"l1\" style=\"padding: 10px\"><a href=\"login2.jsp\">LOGIN</a></li>\n");
      out.write("            \n");
      out.write("            <li class=\"l1\" style=\"padding: 10px\"><a href=\"contact_us.jsp\">CONTACT US</a></li>\n");
      out.write("            <li class=\"l1\" style=\"padding: 10px\"><a href=\"register.jsp\">REGISTER</a></li>\n");
      out.write("           \n");
      out.write("            <li class=\"l1\" style=\"padding: 10px\"><a href=\"https://twitter.com/login\"><i id=\"i2\"class=\" icofont icofont-social-twitter \"></i></a></li>\n");
      out.write("            <li class=\"l1\"style=\"padding: 10px\"><a href=\"https://www.instagram.com/\"><i id=\"i2\"class=\" icofont icofont-social-instagram \"></i></a></li>\n");
      out.write("            <li class=\"l1\" style=\"padding: 10px\"><a href=\"https://www.facebook.com/\"><i id=\"i2\"class=\" icofont icofont-social-facebook \"></i></a></li>\n");
      out.write("            <li class=\"l1\" style=\"padding: 10px\"><a style=\"font-size: 50px\"  href=\"https://www.linkedin.com/\"><i id=\"i2\"class=\" icofont icofont-social-linkedin \"></i></a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"padding-top: 15px;padding-left: 20px;background-color: white\">\n");
      out.write("        <div class=\"col-md-1\">\n");
      out.write("            <img src=\"images/LOGO-MENU-DESKTOP2.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-1\"></div>\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"background-color: WHITE;text-align: center;padding-left: 150px\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expnded=\"false\" aria-label=\"Toggle anvigation\">\n");
      out.write("            <span class=\"navbar-togglericon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul>\n");
      out.write("              <li style=\"list-style-type: none;\n");
      out.write("     display: inline;\n");
      out.write("    padding: 10px;\">\n");
      out.write("                <a style=\"color: black; text-decoration: none\" href=\"cyber.jsp\">HOME</a>\n");
      out.write("      </li>\n");
      out.write("            <li style=\"list-style-type: none;\n");
      out.write("     display: inline;\n");
      out.write("    padding: 10px;\">\n");
      out.write("                <a style=\"color: black; text-decoration: none\" href=\"attackd1.jsp\">ATTACKS</a>\n");
      out.write("      </li>\n");
      out.write("                   <li style=\"list-style-type: none;\n");
      out.write("     display: inline;\n");
      out.write("    padding: 10px;\">\n");
      out.write("       <a style=\"color: black;text-decoration: none\" href=\"anewsd1.jsp\">ATTACK NEWS</a>\n");
      out.write("      </li>\n");
      out.write("                   <li style=\"list-style-type: none;\n");
      out.write("     display: inline;\n");
      out.write("    padding: 10px;\">\n");
      out.write("         <a style=\"color: black;text-decoration: none\" href=\"newsd1.jsp\">NEWS</a>\n");
      out.write("      </li>\n");
      out.write("                      <li style=\"list-style-type: none;\n");
      out.write("     display: inline;\n");
      out.write("    padding: 10px;\">\n");
      out.write("         <a style=\"color: black;text-decoration: none\" href=\"reachus.jsp\">REACH US</a>\n");
      out.write("      </li>    \n");
      out.write("                     \n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("              </nav>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("               <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-prepend\"><span class=\"input-group-text\"><i class=\"icofont icofont-ui-search\"></i></span></div>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                    </div>   \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("  ");
      out.write("\n");
      out.write("        <h1 style=\"text-align: center;padding-top: 50px;color: navy\">HAVE SOME QUESTIONS?</h1>\n");
      out.write("        <form class=\"needs-validation\" novalidate action=\"main1.jsp\" method=\"POST\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("         <div class=\"col-md-6\">\n");
      out.write("        <img style=\"height: 300px;width: 50%; border-radius: 25%; margin-left: 150px;margin-top: 50px\" src=\"images/mail5.jpg\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\" style=\"padding-right: 200px;margin-top: 25px\">\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                    <input  type=\"text\" name=\"f1\" required class=\"form-control\" pattern=\"[A-Z a-z]{3,30}\" placeholder=\"First Name\">\n");
      out.write("                    <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("             </div>   </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" name=\"l1\" required class=\"form-control\" pattern=\"[A-Z a-z]{3,30}\" placeholder=\"Last Name\">\n");
      out.write("                    <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("             </div></div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                    <input type=\"email\" name=\"e1\" required class=\"form-control\" placeholder=\"what's your email?\">\n");
      out.write("                    <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("                    </div></div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"tel\" name=\"t1\" required class=\"form-control\"  pattern=\"[0-9]{10}\" placeholder=\"Enter phone no.\">\n");
      out.write("                    <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("                    </div>\n");
      out.write("                     </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                   <textarea  rows=\"4\" type=\"text\" name=\"q\" required class=\"form-control\" placeholder=\"Your questions...\"></textarea>\n");
      out.write("                        <div class=\"valid-feedback\">valid</div>\n");
      out.write("                       <div class=\"invalid-feedback\">invalid</div>\n");
      out.write("                </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                   <input type=\"submit\" class=\"btn btn-block btn-outline-info\"  style=\"background-color:navy;color: white\"value=\"SEND MESSAGE\" >\n");
      out.write("                     </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("                 <script>\n");
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
      out.write("        alert(\"Thank you for Contacting\");\n");
      out.write("        </script>\n");
      out.write("    </form>\n");
      out.write("        <br/><br/>\n");
      out.write("         ");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("<div class=\"row\" style=\"background-color: white;padding:20px\">\n");
      out.write("    <div class=\"col-md-2\"style=\"margin-left: 35px\" >\n");
      out.write("        <img src=\"images/LOGO-MENU-DESKTOP2.png\"><br/><br/>\n");
      out.write("        <ul>\n");
      out.write("            <li>cyberinfo1214@gmail.com</li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-2\"style=\"margin-left: 50px\">\n");
      out.write("        <h3>PRODUCTS</h3><hr/>\n");
      out.write("         <ul>\n");
      out.write("            <li> Security Cameras</li>\n");
      out.write("            <li>Routers</li>\n");
      out.write("            <li>UPS</li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-md-2\"style=\"margin-left: 35px\">\n");
      out.write("         <h3>COMPANY</h3><hr/>\n");
      out.write("          <ul>\n");
      out.write("            <li>Job Offers</li>\n");
      out.write("            <li>News</li>\n");
      out.write("            <li>Our Team</li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-md-2\"style=\"margin-left: 35px\">\n");
      out.write("         <h3>SUPPORT</h3><hr/>\n");
      out.write("          <ul>\n");
      out.write("            <li>Helpdesk</li>\n");
      out.write("            <li>Documentation</li>\n");
      out.write("            <li>Getting Started</li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-md-2\"style=\"margin-left: 35px\">\n");
      out.write("         <h3>FOLLOW US</h3><hr/>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("         <button style=\"background-color: white\"><a href=\"https://twitter.com/login\" style=\"text-decoration: none;color: black\"><i style=\"font-size:25px\" class=\" icofont icofont-social-twitter \"></i></a></button>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("         <button style=\"background-color: white;\"><a href=\"https://www.facebook.com/\" style=\"text-decoration: none;color: black\">  <i style=\"font-size:25px\"class=\"icofont icofont-social-facebook \"></i></a></button>\n");
      out.write("             \n");
      out.write("         <button style=\"background-color: white\"> <a   href=\"https://myaccount.google.com/profile\" style=\"text-decoration: none;color: black\"><i style=\"font-size:25px\" class=\" icofont icofont-social-google-plus \"></i></a></button>\n");
      out.write("            <br/><br/>\n");
      out.write("            <button style=\"background-color: white\"><a  href=\"https://www.linkedin.com/\" style=\"text-decoration: none;color: black\"> <i style=\"font-size:25px\" class=\" icofont icofont-social-linkedin \"></i></a></button>\n");
      out.write("            \n");
      out.write("            <button style=\"background-color: white\"> <a href=\"https://www.instagram.com/\" style=\"text-decoration: none;color: black\"> <i style=\"font-size:25px\" class=\" icofont icofont-social-instagram \"></i></a></button>\n");
      out.write("            \n");
      out.write("            <button style=\"background-color: white\"> <a   href=\"https://webmail.au.syrahost.com/\" style=\"text-decoration: none;color: black\"><i style=\"font-size:25px\" class=\" icofont icofont-email \"></i></a></button>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</div></div></div>\n");
      out.write("    \n");
      out.write("<div class=\"row\" style=\"background-color: black;text-align: center\">\n");
      out.write("    <div class=\"col-md-12\" style=\"padding: 50px;color:white;\">\n");
      out.write("      <i id=\"i5\" class=\"icofont icofont-copyright\"></i>COPYRIGHT 2019 CYBER SECURITY ALL RIGHTS RESERVED\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</div>");
      out.write("\n");
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
