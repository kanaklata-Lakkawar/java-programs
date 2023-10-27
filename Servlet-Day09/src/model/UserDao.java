package model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {
	
	
	
	Connection getConnect() throws ClassNotFoundException, SQLException
	{
		//step 1
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 1");
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2023","root","abc123");
		System.out.println("Step 2");
		
		return con;
	}

	public int insert(User u) throws ClassNotFoundException, SQLException {
	
		  Connection con=getConnect();     
		//step 3
		PreparedStatement st=con.prepareStatement("insert into user_tbl (uname, uemail, upass) values(?,?,?)");
		st.setString(1, u.getUname());
		st.setString(2, u.getUemail());
		st.setString(3, u.getUpass());
		
		System.out.println("Step 3");
		        
		//step4
		int a=st.executeUpdate();// insert update delete 
		System.out.println("Step 4");
		
		//step 5
		con.close();
		System.out.println("Step 5");
		return a;
	}

	public boolean checkUser(String upass, String uemail) throws ClassNotFoundException, SQLException {

		 Connection con=getConnect();
		 
		 String sql="SELECT * FROM user_tbl where uemail=? and upass=?";
		 PreparedStatement st=con.prepareStatement(sql);
		 st.setString(1, uemail);
		 st.setString(2, upass);
		 
		 ResultSet rs= st.executeQuery();
		 
		 boolean a= rs.absolute(1);
		 con.close();
		return a;
	}

	public ArrayList<User> getAllUser() throws SQLException, ClassNotFoundException {
		
		Connection con=getConnect();
		 
		 String sql="SELECT * FROM user_tbl";
		 PreparedStatement st=con.prepareStatement(sql);
		 
		 ResultSet rs= st.executeQuery();
		 
		 ArrayList<User> ul=new ArrayList<>();
		 
		 while(rs.next())
		 {
			 User u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		
			 ul.add(u);
		 }
		 
		
		 con.close();
		return ul;
	}

	public int deletUser(int uid) throws ClassNotFoundException, SQLException {
			Connection con=getConnect();     
			//step 3
			PreparedStatement st=con.prepareStatement("delete from user_tbl where uid=?");
			st.setInt(1, uid);
					
			System.out.println("Step 3");
			        
			//step4
			int a=st.executeUpdate();// insert update delete 
			System.out.println("Step 4");
			
			//step 5
			con.close();
			System.out.println("Step 5");
			return a;
	}

	public User getOneUser(int uid) throws ClassNotFoundException, SQLException {
		Connection con=getConnect();     
		//step 3
		 String sql="SELECT * FROM user_tbl where uid=?";
		 PreparedStatement st=con.prepareStatement(sql);
		 st.setInt(1, uid);
		 
		 ResultSet rs= st.executeQuery();
		 User u=null;
		 while(rs.next())
		 {
			 u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		 }
		 
		
		 con.close();
		
		return u;
	}

	public int update(User u) throws ClassNotFoundException, SQLException {
		 Connection con=getConnect();     
			//step 3
			PreparedStatement st=con.prepareStatement("update user_tbl set uname=?, uemail=?, upass=? where uid=?");
			st.setString(1, u.getUname());
			st.setString(2, u.getUemail());
			st.setString(3, u.getUpass());
			st.setInt(4, u.getUid());
			
			System.out.println("Step 3");
			        
			//step4
			int a=st.executeUpdate();// insert update delete 
			System.out.println("Step 4");
			
			//step 5
			con.close();
			System.out.println("Step 5");
			return a;
	}
}
