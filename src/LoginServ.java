

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		Cookie c[]=request.getCookies();
		
		
		if(c==null)
		{
		request.getRequestDispatcher("nav.html").include(request, response);
		
		out.print("<form action='logincontroller' >");
		out.print("<input type='text' name='uname' placeholder='user name'><br/><br/>");
		out.print("<input type='password' name='upass' placeholder='user password'><br/><br/>");
		out.print("<input type='submit' value='login'><br/><br/>");
		out.print("</form>");
		}
		else
		{
			response.sendRedirect("profile");
		}
	// M V C
	
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
