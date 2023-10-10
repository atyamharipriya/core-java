package com.tns.staticprograms;

public class Myclass {

	
	private int section ;
	private static int srNo;
	
	
	static {
		System.out.println("----static block----");
		srNo=1000;
	}
	
	Myclass(){
		System.out.println("-----default constructor------");
		srNo++;
		section++;
	}
 
	static void display1() {
		//System.out.println("section"+section);
		System.out.println("serialNo"+srNo);	
	}
	
	
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	static void display() {
		
	}
}
