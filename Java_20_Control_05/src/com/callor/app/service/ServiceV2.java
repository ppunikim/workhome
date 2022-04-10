package com.callor.app.service;

public class ServiceV2 {
	
		public void guguDan(){
			
			int num = 1;
			System.out.println("3단 구구단");
			for(;num<10;num++) {
				System.out.printf("\n %d X %d = %d \n", 3,num,3*num );
			}//end for
		}//end guguDan
		
		public void guguDanV2() {
			int dan = 3;
			int index = 100;
			
			for(index=1; index<10; index++) {
				System.out.println("\n");
				System.out.print(dan);
				System.out.print("X");
				System.out.print(index);
				System.out.print("=");
				System.out.print(dan*index);
			}//end for
		}//end guguDanV2
		
		public void guguDanV2(int dan) {

			int index = 100;
			for(index=1; index<10; index++) {
				System.out.println(" \n ");
				System.out.print(dan);
				System.out.print("X");
				System.out.print(index);
				System.out.print("=");
				System.out.print(dan*index);
			}//end for
		}//end guguDanV2

		
		
		
		
		
		
}
