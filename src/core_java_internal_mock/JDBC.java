package core_java_internal_mock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBC {
	
	String tablecreation="create table student("
			+ "id int primary key,"
			+ "name varchar(50),"
			+ "marks double"
			+ ");";
	
	Connection conn = Dbconnection.dbconnection();
	Scanner sc=new Scanner(System.in);
	
	public void studenttablecreation() {
		
		try {
			Statement st= conn.createStatement();
			st.executeUpdate(tablecreation);
			System.out.println("Table created");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	String sql = "insert into student(id, name, marks) values(?,?,?);";
	
	public void insertdata() {
		try {
			PreparedStatement ps =  conn.prepareStatement(sql);
			ps.setInt(1, 101);
			ps.setString(2, "Yuvarajan");
			ps.setDouble(3, 90);
			
			int row = ps.executeUpdate();
			if(row==1) {
				System.out.println("Student Inserted Successfully");
			}else {
				System.out.println("Insufficeint data");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Dbconnection.dbconnection());
		JDBC obj = new JDBC();
		obj.studenttablecreation();
		obj.insertdata();
		


	}

}
