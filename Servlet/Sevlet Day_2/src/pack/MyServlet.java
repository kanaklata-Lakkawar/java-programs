package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<b>Welcome to MyServlet<b>");
		
		String name=req.getParameter("uname");
		String mail=req.getParameter("umail");
		String pass=req.getParameter("pass");
		
	   out.println("Welcome "+name+"<br>");
       out.println("your email "+mail+"<br>");	
       out.println("your pass "+pass);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("do post method");
		doGet(req,resp);
		
		
	}

}
