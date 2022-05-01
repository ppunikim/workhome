package com.callor.app.first;

public class ScoreController {
	
	public static int leng = 50;
	
	public static void main(String[] args) {
		
		ScoreService scoreService = new ScoreService();
	
		
		System.out.println(Line.dLine(leng));
		System.out.println("학번    국어    영어    수학    총점    평균");
		System.out.println(Line.sLine(leng));
		scoreService.makeScore();
		scoreService.scorePrint();
		System.out.println(Line.dLine(leng));
		scoreService.printSum();
		System.out.println(Line.sLine(leng));
		
		
	}//end main
}//end ScoreController
