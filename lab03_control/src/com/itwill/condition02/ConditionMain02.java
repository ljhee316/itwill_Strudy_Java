package com.itwill.condition02;  //패키지선언문

import java.util.Scanner;    //import 문장 : 기본타입외의 다른변수(클래스,참조타입)을 사용할때 사용함. (위치중요함)

public class ConditionMain02 {    //클래스 선언문

	public static void main(String[] args) {
		// 1. 콘솔 창에서 정수 1개를 입력받고, 2. int 타입 변수에 저장

		// 만약 입력 받은 정수가 0보다 크면, "positive" 라고 출력.
		// 0이면, "zero"라고 출력.
		// 그렇지 않으면, "negative"라고 출력.
		
		
		
		/* 3/18
		system.in -  유니코드값을 출력함.
		
		스캐너도구사용법(콘솔창에 키보드 입력을 저장하는 방법)
		1. Scanner 타입의 변수를 선언하고, Scanner 객체를 저장.  (Scanner x = new Scanner(System.in);   -입력도구를 만들어서 변수에 저장.
		2. 데이터타입에 변수 저장  int number = x.nextint();  - 콘솔창에 입력받은 정수를 변수에 저장.
		*/

		Scanner inputData = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int n = inputData.nextInt();
			if (n > 0) {
				System.out.println("positive\n");
			} else if (n == 0) {
				System.out.println("zero\n");
			} else {
				System.out.println("negative\n");
			}

		}

	}

}
