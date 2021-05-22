package com.milestone_1;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.text.*;

public class readfile {
		
		ArrayList<TestPojo>data= new ArrayList<>();
		
		public ArrayList<TestPojo> read(){
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
			
			try {
				FileReader fr = new FileReader("C:\\Users\\Ecjoee\\Downloads\\1805142.csv");
				BufferedReader br = new BufferedReader(fr);
				
	
				br.readLine();
				String i;
				while((i=br.readLine()) != null) {
					
					TestPojo obj = new TestPojo();
					//System.out.println(i);
					String[] parts = i.split(",");
					//System.out.println(parts[0]);	
					obj.setBusiness_code(parts[0]);
					obj.setCust_number(parts[1]);
					obj.setName_customer(parts[2]);
					
					//SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
					try {
						obj.setClear_date(new java.sql.Date(format.parse(parts[3]).getTime()));
					}catch(Exception e) {
						obj.setClear_date(null);
					}
	
					obj.setBusiness_year(Double.valueOf(parts[4]).intValue());
				
					obj.setDoc_id(Double.valueOf(parts[5]).longValue());
					try {
						obj.setPosting_date(new java.sql.Date(format1.parse(parts[6]).getTime()));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						obj.setDocument_create_date(new java.sql.Date(format.parse(parts[7]).getTime()));
					}catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						obj.setDocument_create_date_1(new java.sql.Date(format.parse(parts[8]).getTime()));
					}catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						obj.setDue_in_date(new java.sql.Date(format.parse(parts[9]).getTime()));
					}catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println("qckq");
					obj.setInvoice_currency(parts[10]);
					obj.setDocument_type(parts[11]);
					obj.setPosting_id(Double.valueOf(parts[12]).intValue());
					
					obj.setArea_business(null);// handle null values
					obj.setTotal_open_amount(Double.valueOf(parts[14]));
					
					try {
						obj.setBaseline_create_date(new java.sql.Date(format.parse(parts[15]).getTime()));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					obj.setCust_payment_terms(parts[16]);
					
					try{
						obj.setInvoice_id(Long.valueOf(parts[17]).longValue());
					}catch(Exception e) {
						//handle null values
						obj.setClear_date(null);
					}
					
					obj.setIsOpen(Integer.valueOf(parts[18]).intValue());
					
	                data.add(obj);
	                
				}
				/*int c=0;
                for(TestPojo a : data) {
                	System.out.println(a);
                	if(c++ >10)
                		break;
                }*/
                
				br.close();
				fr.close();
			}
			catch(IOException ex) {
					System.err.println("IO Exception was caught!");
					ex.printStackTrace();
			}
			finally {
				System.out.println("Read File finished");
			}
			return data;
		}
}