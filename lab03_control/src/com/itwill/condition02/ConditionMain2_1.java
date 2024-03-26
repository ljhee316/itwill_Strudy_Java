package com.itwill.condition02;

import java.util.Scanner;

public class ConditionMain2_1 {

	public static void main(String[] args) {
		// 콘솔 창에서 정수 1개를 입력받고, int 타입 변수에 저장

		// 만약 입력 받은 정수가 0보다 크면, "positive" 라고 출력.
		// 0이면, "zero"라고 출력.
		// 그렇지 않으면, "negative"라고 출력.

		Scanner inputData = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int n = inputData.nextInt();

		if (n > 0) {
			System.out.println("positive");
		} else if (n == 0) {
			System.out.println("zero");
		} else {
			System.out.println("negative");
		}

	}

}
