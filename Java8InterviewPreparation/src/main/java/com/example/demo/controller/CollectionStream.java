package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CollectionStream {

	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> getList= list.stream().filter(x->x.equals(5)).collect(Collectors.toList());
		System.out.println(getList);
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int index=1;
		int lastIndex =2;
		while(index<=lastIndex) {
			int last =a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=last;
			index++;
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}
}
