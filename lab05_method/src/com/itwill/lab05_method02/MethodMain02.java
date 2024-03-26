package com.itwill.lab05_method02;

/*
 * 메서드를 선언(정의) 하는방법.
 * [수식어]리턴타입 메서드이름([파라미터선언,...]) {code; ...}   ->[] 대괄호는 생략가능.  리턴타입=반환하는 값의데이터타입. 
 * 수식어는 생략가능
 * 아규먼트를 갖지않는 메서드는 파라미터를 선언하지 않음.
 * 메서드의 반환값이 없는 경우에는 리턴타입으로 void를 사용.
 * 메서드는 클래스안에서만 선언할 수 있다.
 * 다른 메서드안에서 메서드를 선언할 수 없다.
 */

public class MethodMain02 {

	public static void main(String[] args) {
		// 아규먼트가 필요하고 반환값이 있는 메서드를 작성하는법.

		// add method 호출
		double result = add(1.0, 2.0); // add메서드 호출해서 result 변수선언과 값을 저장하는방법.
		System.out.println(result);

		//subtract 호출
		double sub = subtract(5, 3);
		System.out.println(sub);
		
		// multiply 호출
		double multi = multiply(3.5, 2.0);
		System.out.println(multi);

		// divide 호출
		System.out.println("div= " + divide(4.5, 2.0)); //메서드 호출해서 리턴값을 출력함.

	}// end main

	// 문서주석 설명해주는방법.
	/**
	 * 숫자 2개를 전달받아서 두 숫자의 덧셈 결과를 반환.
	 * 
	 * @param x 실수(double).
	 * @param y 실수(double).
	 * @return x + y를 반환
	 */
	public static double add(double x, double y) {
		return x + y; // return문 : 메서드를 호출한 곳으로 값을 반환하는 문장.

		// TODO
	}
	/**
	* subtract.
    * 숫자 2개를 전달받아서, 두 숫자의 뺄셈 결과를 반환.
    * @param x 실수(double).
    * @param y 실수(double).
    * @return x - y를 반환.
    */
	public static double subtract(double x, double y) {
		return x -y;
	}

	/**
	 * multiply. 숫자 2개를 전달받아서, 두 숫자의 곱셈 결과를 반환.
	 * 
	 * @param x 실수(double).
	 * @param y 실수(double).
	 * @return x * y를 반환.
	 */
	public static double multiply(double x, double y) {
		return x * y;
	}

	/**
	 * divide. 숫자 2개를 전달 받아서 첫번째 아규먼트를 두번째 아규먼트로 나눈 결과를 반환.
	 * 
	 * @param x 나뉨수.
	 * @param y 나누는 수. 0이 아니어야 함.
	 * @return x / y를 반환.
	 */
	public static double divide(double x, double y) {
		return x / y;
	}

}// end class
