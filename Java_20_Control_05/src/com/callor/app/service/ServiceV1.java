package com.callor.app.service;

public class ServiceV1 {
	
	int intKor= (int)(Math.random()*100)+1;
	int intEng= (int)(Math.random()*100)+1;
	int intMath= (int)(Math.random()*100)+1;

	public int scoreSum() {
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	
	}//end scoreSum , int type이어서 return이 있음
	
	public void ScorePrint() {
		
		System.out.println("==================================");
		System.out.println("햇살이의 성적표");
		System.out.println("-----------------------------------");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("-----------------------------------");

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		System.out.println("세 과목 총점 : " + intSum);
		System.out.println("====================================");
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
