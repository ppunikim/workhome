package com.callor.var;

public class Var_02 {
	
	public static void main(String[] args) {
		   
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		
		double douSum = douNum1 + douNum2;
		double douDes = douNum1 - douNum2;
		double douMulti = douNum1 * douNum2;
		double douDiv = douNum1 / douNum2;
		
		/*
		 * printf() 를 사용하여 3개 변수에 담긴 데이터를 console에 출력하기
		 * " %d + %d = %d" 인, form String을 사용하여 출력할 모양을 지정하고
		 *                   각각 %d 위치에 표현할 데이터를 3개 나열했다.
		 * 여기에 %d는 Decimal(10진수)를 표현하는 키 단어이다.
		 * 그런데 douNum1, douNum2, douSum 변수는 double type이다.
		 * double type변수에 담긴 값을 %d로 표현하려면 
		 * 내부에서 데이터 type문제로 인한 중대한문제가 발생한다.
		 * %d는 정수만 표현할 수 있는데 실수값을 표현하라고 했기 때문에
		 *    발생하는 문제이다.
		 */
	     //System.out.printf("%d + %d = %d", douNum1, douNum2, douSum);
		
		/*
		 * printf() 를 사용하여 실수 데이터를 Console에 출력 하려면 %f 기호를
		 * 사용하여 표현해야 한다. float
		 */
		System.out.printf("\t%f + %f = %f\n", douNum1, douNum2, douSum);
		
		// %.2f : 정수부분은 모두 표현하고, 소수점 이하 2째자리까지 출력하라
		System.out.printf("\t%.2f + %.2f = %.2f\n", douNum1, douNum2, douSum);
		
		System.out.println("\t============================================");
		System.out.printf("\t%.2f + %.2f = %.2f\n", douNum1, douNum2, douSum);
		System.out.printf("\t%.2f x %.2f = %.2f\n", douNum1, douNum2, douMulti);
		
		/* %8.2f : 전체 자리수를 8개로 하고 소수점이하 2째까지 표현해라.
		*  만약 데이터가 전체 자릿수보다 작으면 남은 부분을 공백으로 표현
		*  숫자를 오른쪽으로 정렬할때 사용하는 방법
		*  8.2: 정수자릿수 + 소수점(1) + 소수점 이하 2자리를 모두 합한 개수가
		*       8개라는 표현이다.
		* 그래서 전체 자릿수가 8개를 넘어가면 form이 흐트러지는 경우도 있다.
		* 충분히 표현할 수 있는 자릿수로 만들기 
		*/
		System.out.println("\t============================================");
		System.out.printf("\t%.2f + %.2f = %8.2f\n", douNum1, douNum2, douSum);
		System.out.printf("\t%.2f x %.2f = %10.2f\n", douNum1, douNum2, douMulti);
		
		
	}

}
