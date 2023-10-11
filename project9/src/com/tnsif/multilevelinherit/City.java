package com.tnsif.multilevelinherit;

public class City extends State {
	private String Cityname;
	public City() {
		super();
	}
	
	public City(String countryname,String statename) {
		super(countryname,statename);
	}
	
	public City(String countryname) {
		super(countryname);
	}
	public String getCityname() {
		return Cityname;
	}
	public void setCityname(String cityname) {
		Cityname=cityname;
	}
//	@Override
//	public String toString() {
//		return "City [Cityname=" + Cityname + "]";
	}
	


