package com.tnsif.practice;

public class Child extends Father {
	void drinking() {
		System.out.println("coffee");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.drinking();
	}
	

}
