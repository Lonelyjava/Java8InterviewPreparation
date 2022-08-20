package com.example.demo.controller;

public class FactiralNo { 
	
	
	//factirial no 5
	
	public Integer factrioal(int num) {
		int factNum = 1;
		int factoruial=1;
		if(factNum<=num) {
		for(int i=1;i<=num;i++)
		{
			
			factoruial=i*factoruial;
			
		}
		}
//		
			System.out.println("factNum --" +factoruial);
		factNum++;
		return factrioal(num);
	}
	
	
	public static void main(String[] args) {
		
		int fact =5;
		int factNum=1;
		for(int i=1;i<=fact;i++) {
			
			factNum=i*factNum;
		}
		System.out.println(factNum);
		FactiralNo fac = new FactiralNo();
		fac.factrioal(5);
	}

}
