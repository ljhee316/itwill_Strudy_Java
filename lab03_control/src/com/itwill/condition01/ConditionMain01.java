package com.itwill.condition01;

public class ConditionMain01 {

	public static void main(String[] args) {
		// 조건문(conditional statement)

		int number = 123;

		// 1. if 구문
		if (number > 0) {
			System.out.println("양의 정수"); // 조건만족시 실행할 코드블록.
		}

		// 2. if-else 구문
		number = 5;
		if (number % 2 == 0) { // if (조건식)
			// 조건식을 만족하는 경우에 실행할 코드블록.
			System.out.println("짝수");

		} else {
			// 조건식을 만족하지 못하는 경우에 실행할 코드블록.
			System.out.println("홀수");

		}

		System.out.println("=== 프로그램 종료 ===");

	}

}
