package bikedetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vehicle_GetDetails {
	public static void main(String []args)
	{
		try {
			
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
			
			PreparedStatement p = c.prepareStatement("Select * from vihicledetails");
			
			ResultSet r = p.executeQuery();
			while(r.next()) 
			{
				System.out.println("Id: "+r.getInt(1));
				System.out.println("Brand: "+r.getString(2));
				System.out.println("Color: "+r.getString(3));
				System.out.println("Model: "+r.getInt(4));

				System.out.println("--------------------------");
			}
			p.close();
			c.close();
		} catch (ClassNotFoundException | SQLException e) {


			e.printStackTrace();
		}
	}
}