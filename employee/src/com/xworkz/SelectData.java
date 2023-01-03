package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "root",
					"Shashi@123");
			Statement stmt=connect.createStatement();
			String getRecord= "SELECT * FROM employee.employeerslist";
			String Place="SELECT * FROM employee.employeerslist where empplace = 'Hydrabad'";
			
		 ResultSet resu=stmt.executeQuery(Place);
		 while(resu.next()) {
			 System.out.println(resu.getString("empplace")+" "+resu.getNString("empsalary"));
			 
		 }  
		 System.out.println("Only Hydrabad Peoples");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
