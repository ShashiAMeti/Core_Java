package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root",
					"Shashi@123");
			Statement stmt=connect.createStatement();
			String delete= "DELETE FROM `employee`.`employeerslist` WHERE (`empid` = '4')";
			int result=stmt.executeUpdate(delete);
			System.out.println("Delete the data succesfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
