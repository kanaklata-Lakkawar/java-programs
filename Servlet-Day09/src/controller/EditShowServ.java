package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;


@WebServlet("/editshowserv")
public class EditShowServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		int  uid=Integer.parseInt(request.getParameter("id"));
		
		try {
			User u = new UserDao().getOneUser(uid);
			
			if(u!=null)
			{
			out.print("<h2>ID : "+u.getUid()+"</h2>");
			out.print("<form action='editserv' method='post'>");
			out.print("<input type='hidden' name='uid' value='"+u.getUid()+"' readonly><br>");
			out.print("<input type='text' name='uname' value='"+u.getUname()+"'><br>");
			out.print("<input type='text' name='uemail' value='"+u.getUemail()+"'><br>");
			out.print("<input type='text' name='upass' value='"+u.getUpass()+"'><br>");
			out.print("<input type='submit' value='Update'><br>");
			out.print("</form>");
			}
			else
			{
				out.print("<h2>User Not found</h2>");
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
