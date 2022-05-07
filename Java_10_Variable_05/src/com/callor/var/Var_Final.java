package com.callor.var;

public class Var_Final {
	public static void main(String[] args) {
		
		double douNum1=0.0;
		double douNum2=0.0;
		double douSum=0.0;
		
		douNum1 = Math.random() ;
		douNum2 = Math.random() ;
		douSum = douNum1 + douNum2;
		
		
		System.out.println(douNum1);
		System.out.println(douNum2);
		System.out.printf("%f + %f = %f", douNum1, douNum2, douSum);
		System.out.printf("\n\t %.2f + %.2f = %.2f", douNum1, douNum2, douSum );
		System.out.printf("\t\n %8.2f + %8.2f = %8.2f",douNum1, douNum2, douSum);
		System.out.println("\t\n=====================================================");
	
		double douNum3 = 0.0;
		double douNum4 = 0.0;
		double douDiffer = 0.0;
		
		douNum3 = Math.random() +1;
		douNum4 = Math.random() +1;
		douDiffer = douNum3 - douNum4;
		
		System.out.println(douDiffer);
		System.out.println("\t\n=====================================================");

		char charA = 'A';
	    char charB = '가';
	    int intA = (int)charA;
	    
	    System.out.println(charA);
		System.out.printf("%c 는 문자1개\n",charB);
		System.out.printf("%c는 아스키코드로 %d",charA, intA);
		System.out.println("\t\n=====================================================");

		String strChar= "";
		strChar = "뿌니";
		System.out.println(strChar);
		
		strChar += "김";
		System.out.println(strChar);
		System.out.printf("%s", strChar);
		System.out.println("\t\n=====================================================");
		
		System.out.println(douNum1 < douNum3);
		System.out.println(douNum1 == douNum3);
		
	}

}
