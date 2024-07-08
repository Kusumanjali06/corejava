package com.tnsif.packages;

public class Publicdemo { //if i make private it will not access in other class or package
	public int a=0;
	public static void main(String[] args) {
		Publicdemo p= new Publicdemo();
		System.out.println(p.a);
	}

}
