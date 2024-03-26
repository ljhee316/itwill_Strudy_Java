package com.itwill.variable05;

public class VariableMain05 {

	public static void main(String[] args) {
		// boolean 타입: true/false 만을 저장할 수 있는 데이터타입.
		// 비교 연산, 논리연산에서 사용함.
		// 비교 연산자: ==, !=, >, >=, <, <=
		// 논리 연산자: &&, ||, !
		// &: 비트연산 
		
		int x = 2;  //  = 할당연산자은  가장 나중에 수행됨.
		int y = 3;
		boolean b1 = (x != y);  // 코드 읽기 편하게 ()표시해줌.
		System.out.println(b1);
		
		boolean b2 = (x > y);
		System.out.println(b2);
		
		boolean b3 = (x > 0 && x <10);
		System.out.println(b3);

	}

}
