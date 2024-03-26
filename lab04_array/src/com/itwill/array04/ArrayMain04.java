package com.itwill.array04;

import java.util.Random;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 정수 10개를 저장할 수 있는 배열(codes)을 만들고 기본값으로 초기화.
		int[] codes = new int[10];

		// 배열 codes 1 이상 4 이하 범위 정수를 임의로 저장.
		Random rand = new Random();// Random 선언

		for (int i = 0; i < codes.length; i++) {
			codes[i] = rand.nextInt(1, 5); // 난수를 만들어낼때 (숫자입력.)1,2,3,4
		}
		// codes 내용을 출력.
		for (int x : codes) {
			System.out.printf("%5d", x);
		}
		System.out.println();

		// 문자열(String)을 10개를 저장할 수 있는 배열(genders)를 만들고 기본값으로 초기화.
		String[] genders = new String[10]; // 초기화 null값에 남성 여성 값을 집어넣기위해

		// codes 의 원소가 1또는3 이면 "남성"을, 2또는 4이면 "여성"을 genders에 저장.
		for (int i = 0; i < codes.length; i++) {
			if (codes[i] == 1 || codes[i] == 3) {
				genders[i] = "남성"; // genders[i]= genders i번째에 값을 저장하겠다.
			} else {
				genders[i] = "여성";
			}
		}
		// genders 내용을 출력.

		for (String i : genders) {
			System.out.printf("%3s", i);
		}

		System.out.println();
		
		
	

	}

}
