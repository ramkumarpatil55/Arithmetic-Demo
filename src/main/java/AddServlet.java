

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		
		int x=Integer.parseInt(request.getParameter("n1"));
		int y=Integer.parseInt(request.getParameter("n2"));
		
		int z=x+y;
		
		pw.write("<h1>Addition is "+z+"</h1>");
		pw.write("<a href='index.html'>Back to Menu.....</a>");
	}

}
