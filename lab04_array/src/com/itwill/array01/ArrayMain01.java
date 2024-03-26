package com.itwill.array01;

public class ArrayMain01 {

	public static void main(String[] args) {  //Srting args 변수를 저장하는 배열
		// 배열의 필요성
		
		//점수 
		int score1 = 100;
		int score2 = 90;
		int score3 = 95;
		
		
		//총점
		int total =score1 + score2 +score3;
		System.out.println("총점 : " + total);
		
		
		
		//배열(array): 같은 타입의 데이터 여러개를 하나의 변수 이름으로 저장하기 위한 타입.
		//인덱스(index): 배열에 값을 저장하거나, 저장된 값을 읽어올때 사용하는 정수.
		// - 배열에서 데이터가 저장된 위치를 나타내는 정수.
		// - 0부터 시작하는 연속된 정수.
		// - 배열의 마지막 인덱스는 (배열의 원소 갯수 - 1).
		
		

		
		//배열 선언 & 초기화 방법
		
		//1.  타입[] 변수이름 = new 타입[배열의 원소개수];
		//    -> 배열의 모든 원소를 그 타입의 기본값으로 초기화 해줌.
		//       정수타입 -> 0,  실수타입 -> 0.0 ,   boolean 타입 -> false.  그 이외의 타입들의 기본값->null
		int[] scores = new int[3];  //int타입 3개를 저장할 수 있는 배열.  int int int 모든 초기화값은 0으로 채워있음.
		//System.out.println(scores); // scores 배열이다.
		System.out.println(scores[0]); //배열 scores의 인덱스 0 위치의 원소(값)를 출력.
		
		scores[0] =100;
		System.out.println(scores[0]);
		
		//모든 배열타입의 변수는 length 라는 이름의 속성을 가지고 있음.
		//lenght: 배열의 길이 = 배열의 원소개수.(int 정수타입),  배열타입에서만 lenght 속성 있음.
		
		System.out.println("lenght= " + scores.length);
		
		//반복문(for)을 사용해서 배열의 모든 원소를 순서대로 출력.
		for(int i =0; i < scores.length; i++) // 배열의 0 인덱스부터; 인덱스 < 원소개수; 1씩증가시키면서
			System.out.println(i + ":" +scores[i]);  // 0-100 , 1-0, 2-0
		
		
	}

}
