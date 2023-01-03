package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		String Delete=" DELETE FROM bookslist.books WHERE (BookNo = ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookslist", "root",
					"Shashi@123");
			System.out.println("System Connected");
			
			PreparedStatement pstmt= connect.prepareStatement(Delete);
			pstmt.setInt(1, 250);
			int result=pstmt.executeUpdate();
			System.out.println(result+"Deleted one line");
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();   
	   }
  	}
}
