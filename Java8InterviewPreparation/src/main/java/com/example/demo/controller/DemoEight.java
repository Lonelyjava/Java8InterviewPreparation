package com.example.demo.controller;

import java.util.ArrayList;

public class DemoEight {

	public static void main(String[] args) {
		System.out.println("Stat learning java 1.8 with positive motivation ....by kundan kumar ");

		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			arrayList.add(i);
		}
		System.out.println("Arraylist" +arrayList);
		
		for(Integer i:arrayList) {
			System.out.println("Iterate the value from array .."+i);
		}
	}
}
