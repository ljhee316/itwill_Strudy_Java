package com.itwill.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		// 반복문 
		//
		
		// 지역변수:(local variable): 메서드 안에서 선언한 변수.
		// 지역변수 사용 범위: 선언된 순간부터 변수가 포함된 {블록}안에서만 사용가능!!!
		// for 문장의 초기식에서 선언된 변수는 for {블록}안에서만 사용 가능!!!
		
		// 증가/감소연산자: ++(1 증가), --(1 감소)
		// 변수 이름 앞 또는 뒤에서 사용가능: i++(다른연산보다 나중에.), ++i(증가연산을 먼저.)
		// y = x++ +1 + ++x; 
		//  y = x++ + 1  -->    y = x + 1;  x++;
		//  y = ++x + 1  -->    y = x++;  y = x + 1;
		
		
		
		for (int i = 1; i <= 5; i++) {     // for (초기값; 조건식; 조건 실행후 변화를 시켜줌.) , i++ : 1를 증가. i-- : 1를 감소
			System.out.println("Java " + i);  // for 문 안에 (int i = 1)은 for 문의 {} 안에서만 사용 가능.
		}

	}

}
