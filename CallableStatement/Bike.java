package bike.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//1st add MySql Connector jar file (create one lib. folder and add inside lib. folder Jar file 

public class Bike {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter Brand");
		String brand = sc.next();
		
		System.out.println("Enter Color");
		String color = sc.next();
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			
			//Statement s = c.createStatement();
			//s.execute("Delete from  bikedetails  where id in(1,2,3)");
			//s.execute("Insert into employeedetails value (1,'Ramesh','Java','879654123')");*/
			
			PreparedStatement p = c.prepareStatement("Insert into bikedetails values(?,?,?)");
			
			p.setInt(1,id);
			p.setString(2, "Brand");
			p.setString(3, "Color");
			
			p.execute();
			
			p.close();
			
			c.close();
			
			
			System.out.println("Data Stored");
		}
		catch( SQLException e) {
			e.printStackTrace();
		}
	}

}

