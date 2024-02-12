/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FLiX
 */
@WebServlet(urlPatterns = {"/ShowRequestHeders"})
public class ShowRequestHeders extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title="Showing Request Headers";
        
        
        out.println("<html><Body>\n"+
                "<h1>"+title+"</h1>\n"+
                "<table border=1>"+
                    "<tr bgcolor=#FFAD00><th>Header Name"
                    +"<th>Values</tr>");
        Enumeration headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = (String)headerNames.nextElement();
        
        out.println("<tr><td>"+headerName);
        out.println("<td>"+request.getHeader(headerName));}
        out.println("</table>\n</html>");
       // processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
