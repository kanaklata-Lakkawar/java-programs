

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv2")
public class MyServ2 extends HttpServlet {
	public MyServ2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");

		String upass=request.getParameter("upass");
		out.print("Welcom to serv2 "+uname);

		out.print("<form action='serv2'>");
		out.print("<input type='hidden' name='uname'> <br>");
				out.print("<input type='hidden' name=upass'> <br>");
				
				out.print("<input type='submit' value='Go'>  ");
				out.print("</form>");
				out.print("<a href='serv3?uname="+uname+"&upass="+upass+"'>Go Next Serv3</a>");;
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
