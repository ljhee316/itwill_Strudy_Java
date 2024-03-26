package com.itwill.condition07;

import java.util.Random;

public class ConditionMain07 {

	public static void main(String[] args) {
		// 조건문, 비교/논리 연산자 연습

		// 난수(random number) 난수를 생성할 수 있는 타입의 변수를 선언하고 초기화. (import 해줘야함)
		Random rand = new Random();

		int java = rand.nextInt(101); // rand.nextInt(x); - 0 이상 x 미만. 범위내에서 랜덤으로 나옴.
										// rand.nextInt(x,y); - x 이상 y 미만.
		System.out.println("java: " + java);

		int sql = rand.nextInt(101);
		System.out.println("sql: " + sql);

		int javascript = rand.nextInt(101);
		System.out.println("javascript: " + javascript);

		// 세 과목이 모두 40점 이상이고, 평균이 60점 이상이면 "합격"
		// 그렇지 않으면 "불합격"

		int total = java + sql + javascript;
		double avr = (double) total / 3;

		String test = (java >= 40 && sql >= 40 && javascript >= 40 && avr >= 60) ? "합격" : "불합격";
		System.out.println("세 과목 평균: " + avr);
		System.out.println("시험 결과: " + test);

		if (java >= 40 && sql >= 40 && javascript >= 40 && avr >= 60) {
			System.out.println("시험 결과: 합격");
		} else {
			System.out.println("시험 결과: 불합격");
		}

	}

}
