package com.tnsif.abstraction;

public  abstract class Shape {
	protected float area;
	abstract void calArea();
	void show() {
		System.out.println("area of shape:"+area);
	}

}
