package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		intNum1 = num1();
		System.out.println(intNum1);
		
		int intNum2 = 0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 + 100;
		
		/*
		 * add() : add method라고 읽는다.
		 * add()를 실행(run, 명령을 수행)하여 그 결과를 
		 *        intNum2에 저장해 달라는 이야기 
		 */
		intNum2 = add();
	} //end main()
	
    /*
     * add()를 선언하기
     */
	public static int add() {
		//정수 55와 33을 덧셈하여 return하기
		return 55+33;
		
	}
	
	/*
	 * num1()를 선언하기
	 */
	public static int num1() {
	
		return 100; //100을 변수에 담아달라는 이야기
	
	}
	
//num1을 키워드로 만드는 과정, 연산에 필요한 data를 저장하기 위해
}
