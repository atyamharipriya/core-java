package com.tnsif.multilevelinherit;

public class State extends Country {
	private String Statename;
	
	 public State() {
		 super();
	 }
	 
	 public State(String countryname) {
		 super(countryname);
	 }
	 
	 public State(String countryname,String statename) {
		 super(countryname);
		 this.Statename=statename;
	 }
	 
	 public String getStatename() {
		 return Statename;
	 }
	 public void setStatename(String statename) {
		 Statename=statename;
	 }

}
