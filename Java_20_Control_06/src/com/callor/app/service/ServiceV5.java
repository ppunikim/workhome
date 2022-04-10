package com.callor.app.service;

import java.util.Scanner;

import com.callor.app.utils.LinePrint;

public class ServiceV5 {
	
		int intKor = (int)(Math.random()*100 )+1;
		int intEng = (int)(Math.random()*100 )+1;
		int intMath = (int)(Math.random()*100 )+1;

		public int scoreSum() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println(LinePrint.dLine);
			System.out.println("나라고등학교 성적처리");
			System.out.println(LinePrint.sLine);
			System.out.println("다음 성적을 50~100점 ");
			
			System.out.print("국어 > ");
			intKor = scanner.nextInt();
			
			System.out.print("영어 > ");
			intEng = scanner.nextInt();
			
			System.out.print("수학 > ");
			intMath = scanner.nextInt();
			
			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;
			
			
			return intSum;
			
		}//end scoreSum
		
		public void scorePrint() {
			int intSum = scoreSum();
			
			System.out.println(LinePrint.dLine);
			System.out.println("\t 햇살이의 성적표");
			System.out.println(LinePrint.sLine);
			System.out.println("\t 국어 : " + intKor);
			System.out.println("\t 영어 : " + intEng);
			System.out.println("\t 수학 : " + intMath);
			System.out.println(LinePrint.sLine);
			System.out.println("\t 세 과목 모두 합 : " + intSum);
			System.out.println(LinePrint.sLine);
			
			
		}//end scorePrint
		
		
		
		
		
		
		
}
