package com.itwill.array09;

import java.util.Random;

public class ArrayMain09 {

	public static void main(String[] args) {
		Random random = new Random();

		// 1차원 정수(int) 배열 3개 갖는 2차원 배열(array)을 선언&초기화.
		// 2차원 배열 array의 첫번째 배열에는 난수(0이상 10미만)를 2개 저장, 두번째 배열에는 3개, 세번째 배열에는 난수 4개를 저장.
		// ->초기화 먼저하고 난수만들어 저장하기.
		// 2차원 배열 array의 내용을 출력.
		// 2차원 배열의 모든 원소들(9개정수) 합계를 계산하고 출력.
		// 2차워 배열의 모든 원소들 평균을 계산하고 출력.
		int[][] array = new int[3][];
		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();
		int sum = 0;   // 배열의 원소들의 합을 저장 할 변수.
		int count = 0;  // 배열의 원소 개수를 저장할 변수.    각 인덱스의 갯수를 셀 수 있음 [0][1의] 원소 갯수 확인할수 있음.
 		for (int[] a : array) {
			for (int b : a) {
				sum += b;  //배열에서 읽은 값을 sum에 더함.
				count++;   //배열에서 읽은 원소 개수를 증가.
			}
			//stem.out.println(sum);  1차원배열마다 합계가 출력됌.
		}
			System.out.println("합계는 " + sum);
			System.out.println("원소의 개수는 " + count);
			
		System.out.println();
		
		double mean = (double) sum / count;
		System.out.println("평균은 " + mean);

	}
}
