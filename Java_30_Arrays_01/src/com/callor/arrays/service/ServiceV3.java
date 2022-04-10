package com.callor.arrays.service;

public class ServiceV3 {
	
	// 이제 지을 신축 아파트이름만 붙이기
	int[] intKor;
	int[] intEng;
	
	public ServiceV3() {
		//신축 아파트를 층수 정하기
		intKor = new int[10];
		intEng = new int[30];
		
		//각 층수(3층)에 들어갈 세입자 이름
		intKor[3] = 10;
		intEng[3] = 130; 
		
	}//end ServiceV3
	
	public void viewKor3() {
		System.out.println(intKor[3]);
	}
	
	public void viewEng3() {
		System.out.println(intEng[3]);
	}

}
