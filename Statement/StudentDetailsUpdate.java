package load.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDetailsUpdate {
public static void main(String[] args) {
	try {
//		Class.forName("com.mysql.jdbc.Driver");	
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		PreparedStatement cs = c.prepareStatement("Update studentinfo set Name='Junaid' where id=3 ");
		
//		cs.setString(2,"Rohan");
//		cs.setInt(1, 4);
		 
		cs.executeUpdate();
		
		c.close();
		cs.close();
		System.out.println("Data Updated");
		
	}      
	catch  (SQLException e) {
		
		e.printStackTrace();
	}
  }
}
