package com.example.demo.controller;

import com.example.demo.service.LambdaService;
import com.example.demo.service.StringLengthService;

public class LambdaController {

	public static void main(String[] args) {
		
		LambdaService lambdaService = new LambdaService() {
			
			@Override
			public int sum(int a, int b) {
				System.out.println(a+b);
				return a+b;
			}
			
		};
		lambdaService.sum(10, 20);
		
		LambdaService lambdaService1 =(a,b)->a+b;
		System.out.println(lambdaService1.sum(30, 40));
		
		StringLengthService lengthService =(str->str.length());
		System.out.println("length :"+lengthService.getLength("kundankumartanti"));
		
		
		Runnable runnable =()->{
			
			for(int i=0;i<=10;i++) {
				System.out.println("thread :"+i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.setName("kundan");
		thread.start();
		
	}
}
