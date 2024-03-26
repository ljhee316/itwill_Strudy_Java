package com.itwill.array08;

public class ArrayMain08 {

	public static void main(String[] args) {
		// 2. 2차원 배열을 선언하고 초기화		
		// 2차원 배열을 그 타입의 기본값으로 초기화 하는방법
		// 타입[][] 변수이름 = new 타입[행의개수][열의개수];
		// -행의개수: 2차원 배열이 가지고있는 1차원 배열들의 갯수.   생략x  !1차원배열에서도 생략 x!
		// -열의개수: 1차원 배열이 가지고 있는 원소들의 개수.        생략가능. 
		
		// (1) 행과 열의 갯수가 모두 결정된 경우. ->직사각형 모양의 배열이다.
		int[][] array = new int[2][3];
		
		for(int[] arr : array) {
			for(int x : arr) {
				System.out.print(x + " ");							
			}
		}
		
		System.out.println("==============");
		
		// (2) 2차원 배열의 행의 개수는 결정되어져 있고, 열의 개수가 결정되지 않은 경우.
		// 2차원배열이 가지고 있는 1차원 배열의 개수는 알고있지만,
		// 각각의 1차원 배열들의 원소 개수는 아직결정되지 않은 경우.
		
		int[][] array2 = new int[3][];
		//열의개수가 미정인 2차원배열은 사용하기 전에 반드시 1차열 배열들을 각각 생성해야만한다.
		array2[0] = new int[2];  //2차원배열 [0]의 1차원배열의 원소는2개
		array2[1] = new int[4];  //2차원배열 [1]의 1차원배열의 원소는4개
		array2[2] = new int[3];  //2차원배열 [1]의 1차원배열의 원소는3개
		
		for(int[] arr : array2) {
			for(int x : arr) {
				System.out.println(x + " ");
			}
			System.out.println();
		}
		
	}

}
