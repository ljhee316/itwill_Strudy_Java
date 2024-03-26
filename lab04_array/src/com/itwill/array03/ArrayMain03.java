package com.itwill.array03;

import java.util.Random;

public class ArrayMain03 {

	public static void main(String[] args) {
		// 성적처리 프로그램
		// 점수는 난수로 만들고 배열에 저장. 배열에 저장된 점수들의 합계만 평균을 계산해서 출력.
		
		
		
		// Random타입 선언과 초기화
		Random rand = new Random();
		
		// 점수들을 저장하는 int타입 5개를 저장할 수 있는 배열(scores)을 선언&초기화(0).
		int[] scores = new int[5];
		
		// for문을 사용해서 5개의 정수 난수(0~10)를 배열에 저장.
		System.out.print("5개의 점수: ");
		
		/*scores[0]= rand.nextInt(11);
		scores[1]= rand.nextInt(11);
		scores[2]= rand.nextInt(11);
		scores[3]= rand.nextInt(11);
		scores[4]= rand.nextInt(11);*/
		
		
		for(int i = 0; i < scores.length; i++) {  // ;배열 변수이름.length(배열에 저장할 인덱스 개수);
			scores[i] = rand.nextInt(11);
			System.out.print( scores[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		// 향상된 for문을 사용해서 배열에 저장된 모든 점수들을 출력해서 확인.
		System.out.print("배열에 저장된 5개 점수: ");
		for(int i : scores ) {
			System.out.print( i + " ");			
		}
		System.out.println();
		
		// 배열의 모든 원소들의 합계 출력.   배열의 원소값을 꺼내서 더하기.  //[0] 값 + [1]값 + [2]값  + [3]값 +[4]값

		int sum = 0;
		for(int x : scores) {
			sum += x;
		}
		System.out.println("총 합계: " + sum);
		
		System.out.println();
				
		
		/*for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총 합계: " + sum); */
		
		
		
		// 배열의 원소들의 평균 출력.
		
		double mean = (double)sum / scores.length;   // scores.length -> 원소갯수  자주이용함. =>  double=(double)
		System.out.println(mean);

	}

}
