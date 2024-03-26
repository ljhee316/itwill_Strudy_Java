package com.itwill.lab05_method04;

import java.util.Random;

public class Method04 {

	public static void main(String[] args) {
		// 다양한 return type.

		Random random = new Random();

		int number = random.nextInt(100);
		System.out.println("number: " + number);

		// Ex.1 isEven(정수): 정수가 짝수이면 true, 그렇지 않으면 false를 리턴. =>boolean 타입으로 리턴값을 출력함.
		boolean result = isEven(number);
		System.out.println("isEven = " + result);
		
		
        // Ex2.
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        System.out.println("x=" + x + ", y=" + y);
        
        int big = whoIsBig(x, y); // x, y 중 크거나 같은 수를 리턴.
        System.out.println("big=" + big);
        
        
        // Ex3.
        int code = random.nextInt(1, 5);
        String gender = parseGenderCode(code); // 1 또는 3이면 "male", 2 또는 4이면 "female", 그 이외에는 "unknown"
        System.out.println("code=" + code + ", gender=" + gender);

        
        
        

	}// 메인메소드 끝.
	
	/**
	 * 성별코드 정수를 문자열로 변환하는 메서드
	 * @param x int (1,2,3,4)
	 * @return 정수 1,3이면 male, 정수2,4이면 female, 그외는 unknown.
	 */
	public static String parseGenderCode(int x) {
		String result = "";
		if(x == 1 || x == 3 ) {
			result = "male";
		} else if(x == 2 || x == 4 ) {
			result = "female";
		} else {
			result = "unknown";
		}				
		return result; 
	}
	/**
	 * x, y 중 큰 수를 출력하는 메서드
	 * @param x int
	 * @param y int
	 * @return x, y 중 큰 수를 리턴.
	 */
	public static int whoIsBig(int x, int y) {
		int big = 0;
		if(x >= y) {
			big = x;
		} else {
			big = y;
		}
		return big;
	}	
	/**
	 * 아규먼트로 전달된 정수가 짝수인지 홀수인지 리턴하는 메서드.
	 * 
	 * @param x 정수(int). 짝수/홀수 검사할 정수.
	 * @return x가 짝수이면 true, 그렇지 않으면 false를 출력함.
	 */
	public static boolean isEven(int x) {
//      1번
//		if ( x % 2 == 0) {
//			return true;   			
//		} else {
//			return false;
//		}

//		2번
//		 boolean result = false; // 리턴값을 1번만 작성하기 위해서 새로운변수를 선언하고, 기본값으로 초기화해주고 작성해주는게 깔끔함.
//		if( x % 2 == 0) {
//			result= true;			
//		} else {
//			result= false;
//		} 		
//		return result ;   //return 은 1번만 가능하도록 코드를 작성해야함.
//		} 

//		3번
		return (x % 2 == 0) ? true : false;
	}
}
