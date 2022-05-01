package com.callor.app.exec;

public class Exec2 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		for(int i=0; i< intNum.length; i++) {
			intNum[i] = (int)(Math.random()*100)+1;
		}
		
		int intSum = 0;
		for(int i=0; i<intNum.length; i++) {
			intSum += intNum[i];
		}
		System.out.println(intSum);
		
		
		
		
	}//main
}
