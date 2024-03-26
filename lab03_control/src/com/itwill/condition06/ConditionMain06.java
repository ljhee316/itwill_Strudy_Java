package com.itwill.condition06;

public class ConditionMain06 {

	public static void main(String[] args) {
		// 삼항연산자 연습
		// 1. number 변수가 짝수인지, 홀수인지 저장하는 변수 evenOrOdd
		int number = 1342;
		String evenOrOdd = (number % 2 == 0 ) ? "짝수" : "홀수";
		System.out.println(evenOrOdd);
		
		// 2. genderCode 변수의 값이 1 또는 3이면 "남성", 그렇지 않으면 "여성"
		
		int genderCode = 1;
		String gender = (genderCode == 1 || genderCode == 3) ? "남성" : "여성";   // && , ||  왼쪽, 오른쪽 둘다 완전한 조건식이 있어야함.
		System.out.println(gender);
		

	}

}
