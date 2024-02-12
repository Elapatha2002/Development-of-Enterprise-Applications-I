package Validation;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw1");
		String confirmPw = request.getParameter("pw2");
		
		if(!isValidUsername(username)) {
			String errorMessage = "Signup Faild. Invalid Username.";
			sendErrorResponse(response,errorMessage);
			return;
		}
		if(!isValidPassword(pw)) {
			String errorMessage= "Signup Faild . Invalid Password.";
			sendErrorResponse(response,errorMessage);
			return;
		}
		if(email.length()==0) {
			String errorMessage= "Signup Faild . Email is empty.";
			sendErrorResponse(response,errorMessage);
			return;
		}
		//password matching validation
		if(!confirmPw.equals(pw)) {
			String errorMessage= "Signup Faild. Password do not match. Re-Enter the password.";
			sendErrorResponse(response,errorMessage);
			return;
		}
		
			String successMessage= "Signup Success. Enter your credentials & Login ";
			sendSuccessResponse(response,successMessage);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private boolean isValidUsername(String username) {
		//validate using regular expression
		return username.matches("[a-zA-Z0-9]+");
	}
	private boolean isValidPassword(String password) {
		//validate using regular expression at least using special character
		return password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?]{8}.*");
	}
	private void sendErrorResponse(HttpServletResponse response , String errorMessage)throws ServletException, IOException  {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><script>alert('"+errorMessage+"')</script><html>");
	}
	private void sendSuccessResponse(HttpServletResponse response , String successMessage)throws ServletException, IOException  {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><script>alert('"+successMessage+"')</script><html>");
	}
	
}
