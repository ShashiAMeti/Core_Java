package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMethod {

	public static void main(String[] args) {
		try {
			//Load and Resistre
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root",
			"Shashi@123");
			//create statement
			Statement stmt = connect.createStatement();
			String insert="INSERT INTO `employee`.`employeerslist` (`empid`, `empname`, `empplace`, `empdesignetion`, `empsalary`) VALUES ('4', 'Sagar', 'Hydrabad', 'Engineer', '50000')";
			//execute query
			int result=stmt.executeUpdate(insert);
		    System.out.println(result+"Created Succesfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
