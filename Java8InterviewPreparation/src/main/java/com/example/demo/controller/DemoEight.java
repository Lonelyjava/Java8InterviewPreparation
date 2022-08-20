package com.example.demo.controller;

import java.util.ArrayList;

public class DemoEight {

	public static void main(String[] args) {
		System.out.println("Stat learning java 1.8 with positive motivation ....by kundan kumar ");
		
		String str ="Hello";
		System.out.println("A"+str.indexOf('o'));
		System.out.println("B"+str.indexOf('t'));

		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			if(i==9) {
				arrayList.add(i);
			}
			
		}
		System.out.println("Arraylist" +arrayList);
		
		for(Integer i:arrayList) {
			System.out.println("Iterate the value from array .."+i);
		}
		
	}
	
	public static void getNameById() {
		String name = null;
	
		
		if(name.isBlank()) {
			System.out.println("kundan kumar");
		}
	}
}
