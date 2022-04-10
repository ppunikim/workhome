package com.callor.arrays.service;

public class ServiceV1 {
	
	private int makeScore() {
		return (int)(Math.random()*100)+1;
	}//end makeScore  , private
	
	public int scoreSum() {

		int intPer1 = makeScore();
		int intPer2 = makeScore();
		int intPer3 = makeScore();
		int intPer4 = makeScore();
		int intPer5 = makeScore();
		
		int intSum = intPer1;
		intSum += intPer2;
		intSum += intPer3;
		intSum += intPer4;
		intSum += intPer5;
		
		return intSum;
	
	}
	
}
