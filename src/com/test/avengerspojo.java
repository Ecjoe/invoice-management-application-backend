package com.test;

public class avengerspojo {
	int serial;
	String first_name;
	String last_name;
	String alias;
	String quote;
	
	public avengerspojo(int serial, String first_name, String last_name, String alias, String quote) {
		super();
		this.serial = serial;
		this.first_name = first_name;
		this.last_name = last_name;
		this.alias = alias;
		this.quote = quote;
	}
	public avengerspojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
}
