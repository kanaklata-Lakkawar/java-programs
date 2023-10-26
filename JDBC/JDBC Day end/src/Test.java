
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


import model.Student;

public class Test {

	public static void main(String args[]) throws ClassNotFoundException,SQLException{
	
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","abc123");
		
		Statement st=con.createStatement();
		
		String sql="select * from test.student";
		
		ResultSet rs=st.executeQuery(sql);
		
		List<Student>li=new ArrayList<Student>();
		
		while(rs.next()){
			
			Student s=new Student(rs.getString(2),rs.getInt(3));
			
			li.add(s);
			}
		
		con.close();
		
		
		for(Student s:li){
			System.out.println(s);
		}
	}

	

	

}
