package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMethod {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root",
					"Shashi@123");
			Statement stmt=connect.createStatement();
			String UPDATE= "UPDATE `employee`.`employeerslist` SET `empdesignetion` = 'IAS', `empsalary` = '75000' WHERE (`empid` = '3')";
			
			boolean result= stmt.execute(UPDATE);
			System.out.println("Updated Succesfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
