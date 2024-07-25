package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("kus");
		l.add(2);
		l.add("sfjf");
		l.add(6.9);
		System.out.println("After invoking add() "+l);
		
		l.add(1, "apple");
		
		l.addFirst("g");
		l.addLast("kusuma");
		
		//l.remove(0);
		
		System.out.println(l);
	}
}
	




