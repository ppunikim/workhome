package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		
		int intNum1 = 33;
		int intNum2 = 55;
		
		int intSum = intNum1+intNum2;
		int intSubtraction = intNum1-intNum2;
		int intDouble = intNum1*intNum2;
		int intDivision = intNum1/intNum2;
		
		System.out.println( intSum );
		System.out.println( intSubtraction );
		System.out.println( intDouble );
		System.out.println( intDivision );
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intSubtraction);
		System.out.printf("%d * %d = %d\n", intNum1, intNum2, intDouble);
		System.out.printf("%d / %d = %d\n", intNum1, intNum2, intDivision);
	
	}

}


