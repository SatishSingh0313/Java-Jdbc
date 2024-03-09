package load.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDetailsDelete {
public static void main(String[] args) {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement s = c.createStatement();
		s.execute("Delete from  studentinfo  where id in(5)");
		
		System.out.println("Data Deleted");
		
		c.close();
		s.close();
				
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
