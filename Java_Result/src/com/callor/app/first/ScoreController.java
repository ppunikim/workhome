package com.callor.app.first;

public class ScoreController {
	
	
	public static void main(String[] args) {
		
		ScoreService scoreService = new ScoreService();
	
		
		System.out.println(Line.dLine(50));
		System.out.println("학번    국어    영어    수학    총점    평균");
		System.out.println(Line.sLine(50));
		scoreService.makeScore();
		scoreService.scorePrint();
		System.out.println(Line.dLine(50));
		System.out.println("총점 \t %d \t %d \t %d \t %d \n"
							
				);
		
		
	}//end main
}//end ScoreController
