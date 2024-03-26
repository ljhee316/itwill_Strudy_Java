package com.itwill.condition04;

public class ConditionMain04 {

	public static void main(String[] args) {
		// 중첩 조건문 : if 블록 또는 else 블록 안에 또 다른 조건문이 있는 경우.

		int number = -1;
		if (number > 0) { // number 값이 0보다 크면.
			System.out.println("양수");
		} else { // 그렇지 않으면, 0보다 크지않으면(0과 같거나, 작거나)
			if (number == 0) {
				System.out.println("영");
			} else {
				System.out.println("음수");

			}
		}

	}

}
