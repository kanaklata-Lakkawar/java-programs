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


@WebServlet("/editserv")
public class EditServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname=request.getParameter("uname");
		String uemail=request.getParameter("uemail");

		User u=new User(uid,uname, uemail, request.getParameter("upass"));
		
	    UserDao db=new UserDao();
	    
	    
	    try {
			int a = db.update(u);
			
			if(a>0)
			{
				System.out.print("Data Updated!");
				response.sendRedirect("profile");
			}
			else
			{
				out.print("Error: Data Not Updated!");
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
