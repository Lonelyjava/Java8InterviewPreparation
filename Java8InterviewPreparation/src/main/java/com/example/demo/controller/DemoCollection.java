package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoCollection {

	
	
	public static void main(String[] args) {
		
	List<Integer> list=	List.of(1,2,3,4,5,6,7,8);
	
	
	List<Integer> list1 = new ArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	
	
	List<Integer> list2=Arrays.asList(25,32,45,6,57,87,67,87);
		
		
	for(Integer i:list2) {
		System.out.println(i);
	}
	
	
	String name ="kundan";
	
	int count =0;
	char[] charlength = name.toCharArray();
	for(int i=0;i<=charlength.length;i++) {
	count=+i;	
	}
	System.out.println("lenght is "+count);
	System.out.println("lenght" +name.length());
	
	}
}
