package bikedetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Vihicle_Update {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Brand");
		String brand = s.next();
		
		System.out.println("Enter Id");
		int id = s.nextInt();
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
			
       		PreparedStatement p = c.prepareStatement("Update vihicledetails set brand=? where id=?");
			//PreparedStatement p = c.prepareStatement("rename vihicledetails into vehicledetails");
			p.setString(2, brand);
			p.setInt(1, id);
			
			p.executeUpdate();
			p.close();
			c.close();
			System.out.println("Data is updated"); 
			
		    }
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

