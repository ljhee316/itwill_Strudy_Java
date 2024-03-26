package com.itwill.array05;

import java.util.Random;

public class ArrayMain05 {

	public static void main(String[] args) {
		// 과제:
		// 정수(int) 5개를 저장할 수 있는 배열을 선언하고, 기본값으로 초기화.
		int[] number = new int[5];

		// 배열에 0 이상 10 이하의 난수 5개를 저장.
		Random rand = new Random();

		for (int i = 0; i < 5; i++) {
			number[i] = rand.nextInt(11);
		}

		// 난수 출력확인
		System.out.print("난수 출력확인: ");
		for (int i : number) {
			System.out.print(i + " ");
		}

		System.out.println();

		// 배열 원소들 중 최댓값을 찾아서 출력.

		// 배열 원소들 중 최솟값을 찾아서 출력.
		System.out.println("======1번째방법=====");

		// 최댓값을 구할때 처음값을 범위내 제일 작은 수부터 범위설정해야함.
		// 최솟값을 구할때 처음값을 범위내 제일 큰 수부터 범위설정해야함.
		// 범위가 달라질수 있기때문에 인덱스0번 숫자를 처음부터 비교해나가는 방법이 편함.

		int big = number[0]; /// 최댓값을 저장할 변수. 첫번째인덱스에 있는 수를 최댓값으로 우선 저장 ->비교해야할 변수가 있으면 초기화해서 어떤수로 할지 정하기.
		int small = number[0]; /// 첫번째 원소가 최솟값이다 설정후 비교해나감.

		// 배열 원소들 중 최솟값을 찾아서 출력.

		for (int x : number) {

			if (x > big) // 배열에서 꺼낸 값이 (현재까지의) 최댓값보다 크면
				big = x; // 최댓값을 배열에서 꺼내값으로 변경한다.
		}
		System.out.println("최댓값: " + big);

		for (int x : number) {
			if (x < small)
				small = x; // 더 작은수를 x에 저장하겠다.
		}
		System.out.println("최솟값: " + small);

		System.out.println("======2번째방법=====");
		for (int x : number) {
			if (x > big)
				big = x;

			if (x < small)
				small = x;
		}

		System.out.println("최댓값: " + big);
		System.out.println("최솟값: " + small);

		/*
		 * if (x > big) big = x;
		 * 
		 * if (x < small) { small = x; } }
		 */
		System.out.println("최댓값: " + big);
		System.out.println("최솟값: " + small);

	}

}