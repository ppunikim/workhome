package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;

public class ControllerV1 {
	
	public static void main(String[] args) {
		
		ServiceV1 serviceV1 = new ServiceV1();
		int intSum = serviceV1.scoreSum();
		
		System.out.println("다섯명 학생 국어점수 합 : "+ intSum);
		
	}//end main

}
