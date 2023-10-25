import java.sql.DriverManager;

import java.sql.Connection; 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "abc123");
	
Statement st=con.createStatement();

/*System.out.println("Enter roll :");
int r=Integer.parseInt(sc.nextLine());
*/
System.out.println("Enter name :");
String s=sc.next();

System.out.println("Enter mail :");
String s1=sc.next();

System.out.println("Enter marks :");
int m=Integer.parseInt(sc.next());

st.executeUpdate("insert into test.Student (name,mail,marks) values('"+s+"','"+s1+"','"+m+"');");

con.close();

	}

}
