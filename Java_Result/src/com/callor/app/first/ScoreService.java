package com.callor.app.first;

import java.util.ArrayList;
import java.util.List;

public class ScoreService {
	
	private List<ScoreVO> scList;
	public ScoreService() {
		scList = new ArrayList<>();	
	}// 기본 생성자에서 초기화하기. 
	
	public void makeScore() {
		for(int i = 0; i < 20; i ++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setIntScore(i + 1);
			int kor = (int)(Math.random() * 50 ) + 51;
			int eng = (int)(Math.random() * 50 ) + 51;
			int math = (int)(Math.random() * 50 ) + 51;
			int Sum = kor + eng + math;
			int Avg = Sum / 3;
			scVO.setIntKor(kor);
			scVO.setIntEng(eng);
			scVO.setIntMath(math);
			scVO.setIntSum(Sum);
			scVO.setIntAvg(Avg);
			scList.add(scVO);
		}//end for
		
		
	}//end makeScore
	
	
	public void scorePrint() {
		for(ScoreVO scVO : scList) {
			System.out.printf("%2d번 \t %d \t %d \t %d \t %d \t %d \t \n",
							   scVO.getIntScore(),
							   scVO.getIntKor(),
							   scVO.getIntEng(),
							   scVO.getIntMath(),
							   scVO.getIntSum(),
							   scVO.getIntAvg()
							   );
		}//end for
	}//end scorePrint
	
}//end class
