package load.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetailsInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement s = c.createStatement();
			
			s.execute("Insert into studentinfo Values(1,'Deepak','Python','8795412354'),(2,'Hitesh','HTML','7458794213'),(3,'Zuned','CSS','8796541254')");
			s.execute("Insert into studentinfo Values(5,'Rahul','React Js','8745745875')");
			System.out.println("Data Stored");
			c.close();
			s.close();
		}
		catch (ClassNotFoundException | SQLException  e) {
			
			e.printStackTrace();
		}
	}
}
