package com.tnsif.practice;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter a number");
		int num=reader.nextInt();
		if(num%2==0)
			System.out.println(num+"is even");
		else
			System.out.println(num+"is odd");
	}
	

}
