package com.callor.arrays.service;

public class ServiceV2 {
	
	public ServiceV2() {
		
	}//기존에 있는데 생략해놓은 것
	
	public int scoreKorSum() {
		// 정수형 배열 선언 = 100층 아파트 만들기
		int[] intKor = new int[100];
		
		// 정수형 배열 3층 요소 출력
		System.out.println(intKor[3]);
		
		//intKor아파트 3층에 사는 세입자는 43이다.
		intKor[3]= 43;
		System.out.println(intKor[3]);
		
		return intKor[3];
	}
	
}
