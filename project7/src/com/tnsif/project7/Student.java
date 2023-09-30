package com.tnsif.project7;

public class Student extends Citizen {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int rollno;
	private String collegename;
	public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}
	public Student(String name,long aadharno,String address,long phno) {
		 super(name,aadharno,address,phno);
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	//}
	
	}