package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		
		String Insert ="INSERT INTO `bookslist`.`books` (`BookNo`, `BookName`, `BookCost`, `BookAuthor`) VALUES (?, ?, ?, ? )";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookslist", "root",
					"Shashi@123");
					System.out.println("System Connected");
		     PreparedStatement pstmt=connect.prepareStatement(Insert);
		         pstmt.setInt(1, 9);  
		         pstmt.setString(2, "Dollar Bahu");  
		         pstmt.setInt(3, 350);  
		         pstmt.setString(4, "Sudha Murty");   
		         int result=pstmt.executeUpdate();  
		         System.out.println(result+"Employee Added....");
		         pstmt.setInt(1, 12);
		         pstmt.setString(2, "The Magic of the Lost Temple");
		         pstmt.setInt(3, 300);
		         pstmt.setString(4, "Sudha Murty");
		         int result1=pstmt.executeUpdate();
		         System.out.println(result+"2Employee Added....");
		         
		         
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
