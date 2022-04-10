package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV2 {
	public static void main(String[] args) {
		
		ServiceV1 serviceV2 = new ServiceV1();
		//int intSum = serviceV2.sum(); 
		// private이라 보여지지 않음
		
		//int intSum2 = serviceV2.add();
		// 한정자는 같은 패키지에서만 호출가능
		
		
	}//end main

}
