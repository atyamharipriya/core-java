package com.tns.collection;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10;
    Integer i=new Integer(a);
    System.out.println("i is a object of type integer"+i);
    int unwrap=i.intValue();
    }

}
