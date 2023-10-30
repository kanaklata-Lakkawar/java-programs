import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.Cookies;

@WebServlet("/serv1")
public class MyServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname =request.getParameter("uname");
		String upass =request.getParameter("upass");
		out.print("Welcome to : Serv 1 Page<br><h2>"+uname+"</h2><br>");
		Cookie c1=new Cookie("name ",uname);
		Cookie c2=new Cookie("upass",upass);
		response.addCookie(c1);
		response.addCookie(c2);
		
		out.print("Hey it's me "+uname+"  my psw is "+upass);
	    
		
		out.print("<a href='serv2'>Go Next Serv2</a>");;
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
