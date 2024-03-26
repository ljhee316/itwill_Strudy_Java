package com.itwill.condition05;

public class ConditionMain05 {

	public static void main(String[] args) {
		// 삼항연산자 : if-else 구문을 간단히 쓰는 문법.
		// (조건식) ? 조건식이 참일때 선택할 값 : 조건식이 거짓일때 선택할 값

		int x = 10;
		int y = 3;
		int big; // x,y 중에서 더 크거나 같은수를 저장하기 위해 변수로 선언만 한 상태.

		if (x > y) {
			big = x;
		} else {
			big = y;
		}
		System.out.println("big = " + big);

		int big2 = (x > y) ? x : y;
		System.out.println("big2 = " + big2);

	}

}
