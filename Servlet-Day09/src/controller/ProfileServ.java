package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;


@WebServlet("/profile")
public class ProfileServ extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String upass=request.getParameter("upass");
		String uemail=request.getParameter("uemail");
		out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
		out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js'></script>");
		out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
		
		out.print("<h1> Welcome "+uemail+"</h1>");
		
		
		try {
			
			
			ArrayList<User> ul=new UserDao().getAllUser();
			
			out.print("<table class='table table-bordered'>");
			out.print("<thead>");
			out.print("<tr><th>Sr.No.</th><th>UserName</th><th>Email</th><th>Action</th></tr>");
			out.print("</thead>");
			out.print("<tbody>");
			
			for(User u:ul)
			{
			
			out.print("<tr><td>"+u.getUid()+"</td><td>"+u.getUname()+"</td><td>"+u.getUemail()+"</td><td><a href='editshowserv?id="+u.getUid()+"' class='btn btn-primary'>Edit</a>  <a href='deleteserv?id="+u.getUid()+"' class='btn btn-danger'>Detele</a> </td></tr>");
			}
			out.print("</tbody>");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
