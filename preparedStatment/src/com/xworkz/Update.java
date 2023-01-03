package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		  String Update="UPDATE bookslist.books SET BookCost = ?, BookAuthor = ? WHERE BookNo = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookslist", "root",
					"Shashi@123");
					System.out.println("System Connected");
        
      
        PreparedStatement pstmt= connect.prepareStatement(Update);
          pstmt.setInt(1, 600);
           pstmt.setString(2, "Wise and Otherwise");
           pstmt.setInt(3, 9);
           int result=pstmt.executeUpdate();
           System.out.println(result+"Updated Succefully");
               
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//UPDATE `bookslist`.`books` SET `BookCost` = '600' WHERE (`BookNo` = '4');

	}

}
