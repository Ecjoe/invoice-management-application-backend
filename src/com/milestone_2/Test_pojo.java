package com.milestone_2;
//import java.util.*;
import java.sql.*;
import java.sql.Date;


public class Test_pojo {
	
	private String business_code;
	private String cust_number;
	private String name_customer;
	private Timestamp clear_date;
	private Integer buisness_year;
	private Long doc_id;
	private Date posting_date;
	private Date document_create_date;
	private Date document_create_date_1;
	private Date due_in_date;
	private String bill_currency;
	private String document_type;
	private Integer posting_id;
	private String area_business;
	private Double total_open_amount;
	private Date baseline_create_date;
	private String cust_payment_terms;
	private Long bill_id;
	private Integer isOpen;
	private String notes;
	
	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getBusiness_code() {
		return business_code;
	}


	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}


	public String getCust_number() {
		return cust_number;
	}


	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}


	public String getName_customer() {
		return name_customer;
	}


	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}


	public Timestamp getClear_date() {
		return clear_date;
	}


	public void setClear_date(Timestamp clear_date) {
		this.clear_date = clear_date;
	}


	public Integer getBuisness_year() {
		return buisness_year;
	}


	public void setBuisness_year(Integer buisness_year) {
		this.buisness_year = buisness_year;
	}


	public Long getDoc_id() {
		return doc_id;
	}


	public void setDoc_id(Long doc_id) {
		this.doc_id = doc_id;
	}


	public Date getPosting_date() {
		return posting_date;
	}


	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}


	public Date getDocument_create_date() {
		return document_create_date;
	}


	public void setDocument_create_date(Date document_create_date) {
		this.document_create_date = document_create_date;
	}


	public Date getDocument_create_date_1() {
		return document_create_date_1;
	}


	public void setDocument_create_date_1(Date document_create_date_1) {
		this.document_create_date_1 = document_create_date_1;
	}


	public Date getDue_in_date() {
		return due_in_date;
	}


	public void setDue_in_date(Date due_in_date) {
		this.due_in_date = due_in_date;
	}


	public String getBill_currency() {
		return bill_currency;
	}


	public void setBill_currency(String bill_currency) {
		this.bill_currency = bill_currency;
	}


	public String getDocument_type() {
		return document_type;
	}


	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}


	public Integer getPosting_id() {
		return posting_id;
	}


	public void setPosting_id(Integer posting_id) {
		this.posting_id = posting_id;
	}


	public String getArea_business() {
		return area_business;
	}


	public void setArea_business(String area_business) {
		this.area_business = area_business;
	}


	public Double getTotal_open_amount() {
		return total_open_amount;
	}


	public void setTotal_open_amount(Double total_open_amount) {
		this.total_open_amount = total_open_amount;
	}


	public Date getBaseline_create_date() {
		return baseline_create_date;
	}


	public void setBaseline_create_date(Date baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}


	public String getCust_payment_terms() {
		return cust_payment_terms;
	}


	public void setCust_payment_terms(String cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}


	public Long getBill_id() {
		return bill_id;
	}


	public void setBill_id(Long bill_id) {
		this.bill_id = bill_id;
	}


	public Integer getIsOpen() {
		return isOpen;
	}


	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	
	
	public String display() {
		return ("Data : [" + business_code + ", " + cust_number  + ", " + name_customer + ", " + clear_date +
                ", " + buisness_year +", " + doc_id +", " + posting_date  +", " + document_create_date  +", " + document_create_date_1 +", " + due_in_date +
                ", " + bill_currency  +", " + document_type  +", " + posting_id  +", " + area_business  +", " + total_open_amount  +
                ", " + baseline_create_date +", " + cust_payment_terms +", " + bill_id +", " + isOpen  + " ]"  );
	}



}
