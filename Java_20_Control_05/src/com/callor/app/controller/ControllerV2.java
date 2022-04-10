package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

public class ControllerV2 {
	
	public static void main(String[] args) {
		
	
	ServiceV2 serviceV2 = new ServiceV2();
	serviceV2.guguDan();
	System.out.println("\n===============");
	serviceV2.guguDanV2();
	System.out.println("\n===============");
	serviceV2.guguDanV2(6);

	}//end main
}
