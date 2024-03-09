package bikedetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Vihicle_Delete {
	public static void main(String []args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
			
			PreparedStatement p = c.prepareStatement("Delete from vihicledetails where id=4");
			p.execute();
			
			c.close();
			p.close();
			System.out.println("Data Deleted");
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
