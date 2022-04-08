package com.callor.var;

public class Var_0330 {
	
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 1000) + 1;
		int intNum2 = (int)(Math.random() * 1000) + 1;
		System.out.println("num1은 " + intNum1+ " 이다.");
		System.out.println("num2은 " + intNum2+ " 이다.");
		System.out.printf("%d 은 %d 보다 작다.",intNum1, intNum2 );

		boolean bYes = intNum1 >= intNum2;
		System.out.println("\n첫 번째 수가 더 큰가: " + bYes);
		
		boolean bEven = (intNum2 % 2) == 0;
		System.out.println("두 번째 수는 2의배수인가: " + bEven);
		
		if((intNum1 % 3)== 0) {
			
			System.out.println(intNum1 +" 은 3의 배수이다." );
		} else {
			System.out.println(intNum1 +" 은 3의 배수가 아니다.");
		}
		
		boolean bCompare = true;
		bCompare = intNum1 < intNum2;
		
		if(bCompare) {
			System.out.println(intNum1
							   + "은(는)"
							   + intNum2
							   + "보다 작다."
							   );
		} else {
			System.out.println(intNum1
							   + "은(는)"
					           + intNum2
					           + "보다 작지않다."
							    );
		}
		
	
		
	}

}
