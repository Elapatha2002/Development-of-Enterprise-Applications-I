package functions;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Servlet implementation class displayImage
 */
public class displayImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayImage() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// retrive the image path
		String imagePath = request.getParameter("image");

	            response.setContentType("image/jpeg");
	            ServletOutputStream out;
	            out = response.getOutputStream();
	            FileInputStream fin = new FileInputStream(imagePath);
                //D:\\DB gar\\blog3.jpg --> path should look like this.
	            BufferedInputStream bin = new BufferedInputStream(fin);
	            BufferedOutputStream bout = new BufferedOutputStream(out);
	            int ch =0; ;
	            while((ch=bin.read())!=-1)
	            {
	            bout.write(ch);
	            }

	            bin.close();
	            fin.close();
	            bout.close();
	            out.close();
	            
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
