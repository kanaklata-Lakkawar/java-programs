

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");

		String upass=request.getParameter("upass");
		out.print("Welcome to serv1  "+uname);

		out.print("<form action='serv1'>");
		out.print("<input type='hidden' name='uname'> <br>");
	    out.print("<input type='hidden' name=upass'> <br>");
		out.print("<input type='submit' value='Go'>  ");
		out.print("</form>");
	    out.print("<a href='serv2?uname="+uname+"&upass="+upass+"'>Go Next Serv2</a>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
