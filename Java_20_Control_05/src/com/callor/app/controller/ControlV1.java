package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControlV1 {
	
	public static void main(String[] args) {
		
	
	ServiceV1 serviceV1 = new ServiceV1();
	int intSum = serviceV1.scoreSum();
	System.out.println( intSum );
	
	
	serviceV1.ScorePrint();
	
	
	
	
	}//end main
	
	

}
