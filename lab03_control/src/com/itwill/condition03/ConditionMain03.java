package com.itwill.condition03;

import java.util.Scanner;

public class ConditionMain03 {

	public static void main(String[] args) {

		/* 1. Scanner 타입의 변수 선언, 초기화.
		2. 콘솔창에서 Java 과목 점수(0 ~ 100)를 입력받고 저장.		
		3. 콘솔창에서 SQL 점수를 입력받고 저장.		
		4. 콘솔창에서 JavaScript과목 점수를 입력받고 저장.
		
		5. 세 과목 총점(정수) 계산 출력
		6. 세 과목 평균(소수점까지) 계산 출력
		
		7. 세 과목 평균이 90점 이상이면, "A" 
		7. 세 과목 평균이 80점 이상이면, "B" 
		7. 세 과목 평균이 70점 이상이면, "C" 
		7. 세 과목 평균이 70점 미만이면, "F"  라고 출력.
		
		*/
		
		Scanner test = new Scanner(System.in);
		
		System.out.print("Java 점수는 : " );
		int java = test.nextInt();
		System.out.println("Java 점수는 : " + java +"점 입니다.");
		
		System.out.print("SQL 점수는 : " );
		int sql = test.nextInt();
		System.out.println("SQL 점수는 : " +sql +"점 입니다.");
		
		System.out.print("JavaScript 점수는 : " );
		int jasc = test.nextInt();
		System.out.println("JavaScript 점수는 : " +jasc +"점 입니다.");
		
		int total = java + sql + jasc;
		double avr = (double)total / 3;  /*  (double) total(int타입) =강제변환 casting   : total를 double로 바꾸고 /3를 해라.
		                                      total/3.0; 둘중 하나만 실수로 변환해줘도 됨.*/
				
		System.out.println("세 과목 총점은 " + total);
		System.out.println("세 과목 평균은 " + avr);
		
		
		if (avr >= 90) {
			System.out.println("A");
		} else if (avr >= 80) {
			System.out.println("B");
		} else if (avr >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}


}
