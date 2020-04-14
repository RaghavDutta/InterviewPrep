package com.interviewprep.designpattern.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton instance = DbSingleton.getInstance();
		
		Connection conn = instance.getConnection();
		
		Statement sta;
		
		try {
			sta=conn.createStatement();
			String query = "CREATE TABLE Address (ID INT, "
					+ "StreetName VARCHAR(20), City VARCHAR(20))";
			int count = sta.executeUpdate(query);
			System.out.println("Table Created");
			sta.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
