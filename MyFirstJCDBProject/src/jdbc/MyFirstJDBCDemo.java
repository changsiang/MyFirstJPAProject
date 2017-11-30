package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.*;

public class MyFirstJDBCDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*JDBC Programming Steps*/
		// 1st Load Driver
		Class.forName("com.mysql.jdbc.Driver");
		// 2nd Connect to database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false", "root", "password");
		// 3rd Create a Statement
		Statement statement = connection.createStatement();
		// 4th Execute SQL (executeQuery)
		ResultSet rs = statement.executeQuery("Select * from student");
		// 5th Process ResultSet and Error Handling
		while (rs.next()) {
			Student student = new Student();
			student.setStudentId(rs.getInt(1));
			student.setName(rs.getString("studentname"));
			student.setNickName(rs.getString(3));
			System.out.println(student.toString());
		}
		// 6th Close Statement object and Connection
		statement.close();
		connection.close();
	}

}
