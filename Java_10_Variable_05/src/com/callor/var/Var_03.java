package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		
		double duNum1 = 0.0;
		double duNum2 = 0.0;
		
		duNum1 = 1+ Math.random()*1000 ;
		duNum2 = 1+ Math.random()*1000 ;
		
		System.out.println( duNum1);
		System.out.println( "\n");
		System.out.println( duNum1 + duNum2 );
		System.out.println( duNum1 - duNum2 );
		System.out.println( duNum1 * duNum2 );
		System.out.println( duNum1 / duNum2 );
	}

}
