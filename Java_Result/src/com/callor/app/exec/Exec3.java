package com.callor.app.exec;

public class Exec3 {
	public static void main(String[] args) {
		
		int intSum = 0;
		for(int index = 0; index < 10; index++ ) {
			int intNum = (int)(Math.random()*100) + 1;
			intSum += even(intNum); 
		}
		System.out.println("짝수의 합" + intSum);
		
	}//end main
	
	public static int even(int num) {
		if( num % 2 == 0) {
			System.out.println();
		}
		
		
		return 0;
	}
	
}
