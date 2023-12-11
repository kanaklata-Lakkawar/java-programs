package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImgTblDao {

		private String db="sys";
		private String url="jdbc:mysql://localhost:3306/"+db;
		private String uname="root";
		private String pass="abc123";
		private Connection con;
		
		private Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
			return con;
		}
		public int saveName(String imageFileName) throws ClassNotFoundException, SQLException
		{
			String sql="insert into image_tbl (img_name) values(?)";
			PreparedStatement ps=getConnection().prepareStatement(sql);
			ps.setString(1,imageFileName);
			
			return ps.executeUpdate();
		}
		
		public List<ImgTbl> getAllImage() throws ClassNotFoundException, SQLException
		{
			String sql="SELECT * FROM image_tbl";
			PreparedStatement ps=getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			List<ImgTbl> imageList=new ArrayList<ImgTbl>();//il imageList
			
			
			while(rs.next())
			{
				ImgTbl it =new ImgTbl();
				it.setId(rs.getInt(1));
				it.setImageName(rs.getString(2));
				
				imageList.add(it);
			}
			
		
			return imageList;
		}
}