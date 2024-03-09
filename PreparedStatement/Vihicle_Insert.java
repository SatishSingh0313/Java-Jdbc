package bikedetails;

import java.sql.Connection;       //Insert Data
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Vihicle_Insert {
	public static void main(String []args)
	{
		while(true) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = s1.nextInt();
		System.out.println("Enter the brand");
		String brand = s1.next();
		System.out.println("Enter the color");
		String color = s1.next();
		System.out.println("Enter Model");
		int model = s1.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
			
			PreparedStatement p = c.prepareStatement("Insert into vihicledetails values(?,?,?,?)");
			
			p.setInt(1, id);
			p.setString(2, brand);
			p.setString(3, color);
			p.setInt(4, model);
			
			p.execute();
			
			p.close();
			c.close();
		
			System.out.println("Data is inserted");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		  }
		}
	}
}


