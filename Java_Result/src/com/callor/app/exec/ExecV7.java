package com.callor.app.exec;

public class ExecV7 {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[100];
		for( int i = 0; i < intArr.length; i++ ) {
			intArr[i] = (int)(Math.random()*100) + 1;
		}
		int intCount = 1;
		for( int i = 2; i < intArr.length; i++) {
			int intArrays = intArr[i];
			if ( intArrays % i != 0 ) {
				intCount++ ;
			}
		}
		System.out.println(intCount);
		
	}// end main
}
