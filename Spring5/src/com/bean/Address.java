package com.bean;

public class Address {
	
	private String hno;
	private String city;
	private String state;
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "[House No.= " + hno + ", city= " + city + ", state= " + state + "]";
	}

}
