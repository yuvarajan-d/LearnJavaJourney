package core_java_internal_mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	
	static String url="jdbc:mysql://localhost:3306/college";
	static String username="root";
	static String password="Yuva#211315";
	
	public static Connection dbconnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return conn;
	}

}
