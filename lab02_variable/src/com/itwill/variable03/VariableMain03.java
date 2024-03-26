package com.itwill.variable03;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int x = 1;
		System.out.println("x = " + x);
		
		
		x = 2;  // 이미 선언된 변수 x의 값을 변경함  -> 선언한게 아님.
		System.out.println("x = " + x);
		// int x = 3;     -> x 변수는 이미 선언 되어 있기 때문에 중복으로 선언 할 수가 없다.
		
	}

}
