package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Load and Resistre
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root",
			"Shashi@123");
			//create statement
			Statement stmt = connect.createStatement();
			String creatTable="CREATE TABLE `employee`.`employeerslist` "
					+  " ( `empid` INT NOT NULL,"
					+ " `empname` VARCHAR(45) NULL,"
					+ " `empplace` VARCHAR(45) NULL,"
					+ "`empdesignetion` VARCHAR(45) NULL,"
					+ "`empsalary` VARCHAR(45) NULL,"
					+ " PRIMARY KEY (`empid`))";
			int result=stmt.executeUpdate(creatTable);
			System.out.println("Creat table succefully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
