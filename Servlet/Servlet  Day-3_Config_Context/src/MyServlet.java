import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		ServletConfig c=getServletConfig();
		String hrName=c.getInitParameter("hr");
		out.print("<br>It is the most common pathological cause of anaemia during pregnancy."+hrName+" It may result from "
			+hrName+"insufficient dietary intake, blood loss from menstruation or previous "+hrName+"pregnancies, increased" 
+hrName+"demand for iron during pregnancy, "+hrName+"or impaired iron absorption from the gut."+hrName+"deficiencies (in pathological anaemia):"+hrName+"Hemoglobin levels lower than 10 g/dL suggest"+hrName+" the possibility of a pathologic process.");
		
		ServletContext sc=getServletContext();
		String CEO= sc.getInitParameter("CEO");
		out.print("<br><br><br>It is the most common pathological cause of anaemia during pregnancy."+CEO+" It may result from "
				+CEO+"insufficient dietary intake, blood loss from menstruation or previous "+CEO+"pregnancies, increased" 
	+CEO+"demand for iron during pregnancy, "+CEO+"or impaired iron absorption from the gut."+CEO+"deficiencies (in pathological anaemia):"+CEO+"Hemoglobin levels lower than 10 g/dL suggest"+CEO+" the possibility of a pathologic process.");
		
		    	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
