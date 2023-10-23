import java.sql.DriverManager;
import java.sql.Connection; 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Test {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll :");
		int roll=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter name :");
		String s=(sc.nextLine());
		
		System.out.println("Enter marks :");
		int marks=Integer.parseInt(sc.nextLine());
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 1");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "abc123");
		System.out.println("Step 2");
		
		Statement st=con.createStatement();
		System.out.println("Step 3");
		
		/*int a=st.executeUpdate("insert into test2.Persons values(5,'palak',66)");//insert,update,delete
		System.out.println("Step 4");
		*/
		st.executeUpdate("insert into test2.Persons(roll,name,marks) value('"+roll+"','"+s+"','"+marks+"')");
	    st.executeUpdate("insert into test2.Persons(roll,name) values('"+roll+"','"+s+"')");
		System.out.println("Step 4");
		
		con.close();
		System.out.println("Step 5");	
	}
	
	

}
