package com.callor.app.exec;

public class Exec4 {
	public static void main(String[] args) {
		
		int intArr = (int)(Math.random()*100) + 1;
		
		if( intArr < 2 ) {
			System.out.println(intArr + "소수가 아니다.");
			return;
		}
		if( intArr == 2) {
			System.out.println(intArr + "소수이다.");
			return;
		}
		for( int i = 2; i < intArr ; i++ ) {
			if( intArr % i == 0 ) {
				System.out.println(intArr + "소수가 아니다.");
				return;
			}
		}
		System.out.println(intArr + "소수이다.");
		
	}//end main

}
