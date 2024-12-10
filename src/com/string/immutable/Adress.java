package com.string.immutable;

public class Adress {
	
	private int hn;
	private String city;
	
	public Adress(int hn, String city) {
		super();
		this.hn = hn;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adress [hn=" + hn + ", city=" + city + "]";
	}
	public int getHn() {
		return hn;
	}
	public void setHn(int hn) {
		this.hn = hn;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
