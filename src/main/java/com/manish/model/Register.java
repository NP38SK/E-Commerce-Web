package com.manish.model;

public class Register {

	private String name;
	private String email;
	private String mobilenumber;
	private String password;
	private String address;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(String name, String email, String mobilenumber, String password, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", mobilenumber=" + mobilenumber + ", password="
				+ password + ", address=" + address + "]";
	}

}
