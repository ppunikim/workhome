package com.callor.var;

public class Var_03A {
	
	public static void main(String[] args) {
		
		double duNum1 = Math.random();
		/*
		 * Math.random() 이 실행된 결과가 담긴 duNum1 변수의 값에
		 * 1000을 곱하여 다시 duNum1에 저장하라.
		 * duNum1 = duNum1 * 1000; 과 같다
		 * duNum1 : 0.000 ~ 999.999범위의 실수가 저장
		 */
		duNum1 *= 1000;
		/*
		 *  duNum1 에 담긴 값에 1을 더하여 다시 duNUm1에 저장
		 * duNum1 : 1.000 ~ 1000.999 범위의 실수가 저장
		 */
		duNum1 ++;
		//정수값으로 변환
		// intNum1 : 1 ~ 1000 범위의 정수가 저장
		int intNum1 = (int)duNum1;
		
		
		
		//최종 정리
		double duNum2= Math.random() * 1000 + 1;
		int intNum2 = (int)duNum2;
		
		int intSum = intNum1 + intNum2;
		int intDes = intNum1 - intNum2;
		int intMulty = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		
		
		System.out.printf("\t%d + %d = %d \n", intNum1, intNum2, intSum);
		
	}

}
