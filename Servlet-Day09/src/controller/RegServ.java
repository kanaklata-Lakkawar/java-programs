package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.buf.UEncoder;

import model.User;
import model.UserDao;


@WebServlet("/regserv")
public class RegServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String uname=request.getParameter("uname");
		String uemail=request.getParameter("uemail");

		User u=new User(uname, uemail, request.getParameter("upass"));
		
	    UserDao db=new UserDao();
	    try {
			int a = db.insert(u);
			
			if(a>0)
			{
				System.out.print("Data Inserted!");
				response.sendRedirect("login.html");
			}
			else
			{
				out.print("Error: Data Not Inserted!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
