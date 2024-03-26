package com.itwill.switch01;

public class SwitchMain01 {

	public static void main(String[] args) {
		// switch-case 구문   --범위비교문은 불가능. 특정값만 출력가능.
		// 해당 case 위치로 이동해서 break; 문장을 만날때까지 실행.
		// 해당 case가 없으면 default 블록을 실행.
		// default 블록은 switch 구문에서 항상 가장 마지막에 작성.
		// default 블록은 없어도 됨.
		
		/* switch(변수 또는 식)에서 사용할 수 있는 타입
		   1. 정수 : byte, short, int, long, char(유니코드)
		   2. 문자열 : String
		   3. eum 타입 
		   4. 주의! switch-case 구문에서는 실수(float, double), boolean 사용불가!!!
		  */
		 

		String season = "여름";
		switch (season) {   //switch () 변수만 입력,  비교는 case 에서함.
		case "봄":   //    : 의미  코드의 위치 표시해주는 역할.(포스트잇 역할) 
			System.out.println("Spring");
			break;   // break;   해당조건에서 break 만나면 프로그램종료.
		case "여름":
			System.out.println("Sunmmer");
			break;
		case "가을":
			System.out.println("Fall");
			break;
		case "겨울":
			System.out.println("Winter");
			break;
		default:     //해당하는 조건이 없을경우 default 사용, break 생략가능.
			System.out.println("몰라요");
		}
		
		
		int number = 123;
		switch(number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:    // default:  로도 가능.
			System.out.println("홀수");
			//break;  생략가능
		}

	}

}
