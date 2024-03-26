package com.itwill.Loop11;

public class Loopmain11 {

	public static void main(String[] args) {
		// 1. 1~10까지 자연수들의 합을 계산하고 출력.
		//1 + 2 + 3 + 4 + ...
		int sum = 0;   // 1 ~ 10자연수들의 합을 저장할 변수.
		for (int a = 1; a < 11; a++) {
			sum += a; // sum = sum + a;
			} 
		System.out.println("sum = " + sum);
		
		
		// 2. 1~100까지 자연수들 중에서 짝수들의 합을 계산하고 출력.
		
		sum = 0;   //sum 초기화
		for (int x = 0; x <= 100; x += 2) {
			 sum += x;    // 2+4+6+8+...
		}System.out.println("sum = " + sum);
		
		
		sum = 0;
		for (int x = 1; x <= 100; x++) {
			if ( x % 2 == 0) {
			sum += x;    // 2+4+6+8+...
			}
		} System.out.println("sum = " + sum);
		
		
		
		// 3. 1~100까지 자연수들 중에서 홀수들의 합을 계산하고 출력. 
		sum = 0;
		int x = 1;
		while ( x <= 100) {
			sum += x;
			x += 2;
		} System.out.println("sum = " + sum);
		
		
		sum = 0;
		x = 1;
		while ( x < 100) {
			if (x % 2 == 1) { 
				sum += x;
			}
			x++;
		} System.out.println("sum = " + sum);
		
	} 
	  
}


