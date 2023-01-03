package com.xworks.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRunner {

 public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Connected");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root",
			"Shashi@123");
			System.out.println("System Connected");
	
		 Statement stmt= connect.createStatement();
//		 String insertquarey="INSERT INTO `studentdatabase`.`studentdatabase` (`Sid`, `SName`, `SClass`, `Splace`) VALUES ('2', 'Shashi', '2', 'Naragund')"; 
//		 boolean result=stmt.execute(insertquarey);
//		 System.out.println("DB is succes");
		 String Updatequarey ="UPDATE `studentdatabase`.`studentdatabase` SET `Splace` = 'naragund' WHERE (`Sid` = '3');";
         String allRecords="SELECT * FROM studentdatabase.studentdatabase";
         ResultSet rs = stmt.executeQuery(allRecords);
		 rs.next();
         System.out.println("Class Loaded");
         String Delete ="DELETE FROM `studentdatabase`.`studentdatabase` WHERE (`Sid` = '3')";
         
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
