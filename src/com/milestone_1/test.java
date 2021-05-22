package com.milestone_1;

//import data from readfile.java;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class test {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		int count=0;
		
		readfile object = new readfile();
		ArrayList<TestPojo> arr = object.read();
		System.out.println(arr.size());
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://localhost/h2h_internship","root","kiit");
			//System.out.println("connection success");
			String sql = "INSERT INTO invoice_details(business_code , cust_number , name_customer , clear_date , business_year , doc_id , posting_date , document_create_date , due_in_date , invoice_currency , document_type, posting_id , area_business , total_open_amount , baseline_create_date , cust_payment_terms , invoice_id , isOpen ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ptst = conn.prepareStatement(sql);
			//System.out.println("insertion success");
			
			
			for (int i=0 ; i< arr.size() ; i++) {
				ptst.setString(1,arr.get(i).getBusiness_code());
				ptst.setString(2,arr.get(i).getCust_number());
				ptst.setString(3,arr.get(i).getName_customer());
				ptst.setDate(4, (Date) arr.get(i).getClear_date());
				ptst.setInt(5,arr.get(i).getBusiness_year());
				ptst.setLong(6,arr.get(i).getDoc_id());
				ptst.setDate(7,(Date)arr.get(i).getPosting_date());
				ptst.setDate(8,(Date)arr.get(i).getDocument_create_date());
				//ptst.setDate(9,(Date)arr.get(i).getDocument_create_date_1());
				ptst.setDate(9,(Date)arr.get(i).getDue_in_date());
				ptst.setString(10,arr.get(i).getInvoice_currency());
				ptst.setString(11,arr.get(i).getDocument_type());
				ptst.setInt(12,arr.get(i).getPosting_id());
				ptst.setString(13,arr.get(i).getArea_business());
				ptst.setDouble(14,arr.get(i).getTotal_open_amount());
				ptst.setDate(15,(Date)arr.get(i).getBaseline_create_date());
				ptst.setString(16,arr.get(i).getCust_payment_terms());
				//ptst.setLong(1,arr.get(i).getInvoice_id());
				Long id = arr.get(i).getInvoice_id();
				if(id != null) {
					ptst.setLong(17, id);
				}else {
					ptst.setNull(17, java.sql.Types.INTEGER);
				}
				ptst.setInt(18,arr.get(i).getIsOpen());
				ptst.addBatch();
				count++;
				if(count % 1000 == 0){
	                  System.out.println("Commit the batch");
	                  ptst.executeBatch();
	                  //System.out.println("Number of rows inserted: "+ result.length);
	                                  //connection.commit();
	              }
				//System.out.println("insertion success");
			}
			//ptst.executeBatch();
			//System.out.println("insertion success");
			//stmt = conn.createStatement();
			//String display= "select * from h2h_internship.invoice_details";
			//ResultSet rs = stmt.executeQuery(display);

			
			//rs.close();
			//stmt.close();
			conn.close();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
	/*finally {
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
	}*/
		System.out.println("byeeee");
	}
}
