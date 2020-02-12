package com.Flexon.apitest.demo2;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Contacts{
	private String Name;
	private String Last_name;
	private Integer Phone_number;
	private String Email_address;
	private String Middle_name;
	private Integer SSN;
	public Contacts(String name, String last_name, Integer phone_number, String email_address,String Middle_name){
		Name=name;
		Last_name=last_name;
		Phone_number=phone_number;
		Email_address=email_address;

	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastname() {
		return Last_name;
	}

	public void setLastname(String lastname) {
		Last_name = lastname;
	}

	public Integer getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		Phone_number = phone_number;
	}

	public String getEmail_address() {
		return Email_address;
	}

	public void setEmail_address(String email_address) {
		Email_address = email_address;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getMiddle_name() {
		return Middle_name;
	}
	public void setMiddle_name(String middle_name) {
		Middle_name = middle_name;
	}
	public Integer getSSN() {
		return SSN;
	}
	public void setSSN(Integer sSN) {
		SSN = sSN;
	}
}