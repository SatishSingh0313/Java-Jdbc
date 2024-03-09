package load.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDeatailsGet {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("Select * From studentinfo where id in(1,2,3)");
			
			while(rs.next()) {
				
			System.out.println("ID     : "+rs.getInt(1));
 			System.out.println("Name   : "+rs.getString(2));
			System.out.println("Course : "+rs.getString(3));
			System.out.println("Mobile : "+rs.getString(4));
			
			System.out.println("-----------------");
			
			 }
			
			c.close();
			s.close();
			rs.close();
			System.out.println("Get Details");
			
		}
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
	}
}
