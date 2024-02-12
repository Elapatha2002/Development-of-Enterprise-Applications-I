package Functions;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String name = request.getParameter("uname");
            PrintWriter out = response.getWriter();
            out.println("Hello");
            
            if (name != null && !name.isEmpty()) {
            // Set the data as a request attribute
            request.setAttribute("name", name);
        }
            // Forward the request to the index.html file
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
        dispatcher.forward(request, response);
    }
    
}
