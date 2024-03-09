package car.details;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Car {
public static void main(String[] args) {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","root");
		
	//	CallableStatement cs =c.prepareCall("Insert into cardetails values(1,'Audi','White')");
		
		CallableStatement cs =c.prepareCall("Insert into cardetails values(?,?,?)");
	
		cs.setInt(1,6);
		cs.setString(2,"Alto-800");
		cs.setString(3, "White");
		
		cs.execute();
		
		c.close();
		cs.close();
		
		
		System.out.println("Data Inserted");
	} 
	 catch (ClassNotFoundException | SQLException   e) {
		
		e.printStackTrace();
	}
}

}
