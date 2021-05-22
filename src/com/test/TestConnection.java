package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class TestConnection{
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	//static final String DB_URL = "jdbc:mysql://localhost/sakila";
	//static final String USER = "root";
	//static final String PASS = "kiit";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://localhost/avengers","root","kiit");
			
			stmt=conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT first_name,last_name,serial,alias,quote FROM avengers");
			ArrayList<avengerspojo> heroes = new ArrayList<>();
			while(rs.next()) {
				
				avengerspojo avengers = new avengerspojo();
				avengers.setSerial(rs.getInt("serial"));
				avengers.setFirst_name(rs.getString("first_name"));
				avengers.setLast_name(rs.getString("last_name"));
				avengers.setAlias(rs.getString("alias"));
				avengers.setQuote(rs.getString("quote"));
				heroes.add(avengers);
			}
			while(true) {
				System.out.println("Enter 1 or 2");
				int choice = sc.nextInt();
				switch(choice) {
				case 1: System.out.println("Case 1: ");
					for(avengerspojo obj : heroes) {
						System.out.println("Serial: "+obj.getSerial());
						System.out.println("First Name: "+obj.getFirst_name() + ", ");
						System.out.println("Last Name: "+obj.getLast_name() + ", ");
						System.out.println("Alias: "+obj.getAlias() + ", ");
						System.out.println("Quote: "+obj.getQuote() + ", ");
						System.out.println();
					}
					break;
				case 2:System.out.println("Case 2: ");
					System.out.println("enter serial");
					int ser=sc.nextInt();
					for(avengerspojo obj : heroes) {
						if(obj.getSerial() == ser) {
							System.out.println("Alias: "+obj.getAlias() + ", ");
							System.out.println("Quote: "+obj.getQuote() + ", ");
							System.out.println();
						}
					}
					break;
				default:
					System.out.println("Try Again");
				}
			rs.close();
			stmt.close();
			conn.close();
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!= null)
					stmt.close();
				
			}catch(SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();
				
			}catch(SQLException se2) {
				se2.printStackTrace();
			}
		}
		System.out.println("byeeee");
	}
}
