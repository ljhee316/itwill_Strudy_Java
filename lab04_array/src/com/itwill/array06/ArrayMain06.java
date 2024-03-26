package com.itwill.array06;

public class ArrayMain06 {

	public static void main(String[] args) {
		//다차원 배열: 배열들을 원소로 갖는 배열.
		//2차원 배열: 1차원 배열들을 원소로 갖는 배열.
		//-2차원 배열은 인덱스를 2개이상 가짐.
		
		//1. 2차원 선언과 초기화.
		//2차원 배열이 갖는 모든 원소들을 나열하면서 배열은 선언하고 초기화.
		//타입[][] 변수이름 = new 타입[][]{{...}, {...}, ...};    ->new 타입[][] 생략가능.
		//타입[][] 변수이름 = {{...}, {...}, ...};
		int[][] array = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{8, 9, 10, 11, 12}
		};
		
		//2차원 배열 원소 속성, 배열원소갯수 출력방법.
		System.out.println(array);  			//   -> [[I
		System.out.println(array.length);  		//2차원 배열의 원소갯수는 1차원배열들을 가진 배열들의 갯수.  =3임.
		System.out.println(array[0]); 		 	//[0]번 배열 ->  [I
		System.out.println(array[0].length);  	//[0]번 배열의 원소갯수.  =4임
					
	
		//1.인덱스 이용한 2차원 배열원소 출력방법.  
		for(int i = 0 ; i < array.length; i++) {       		// 2차원 배열가진 총 3개인 원소들  0,1,2
			for (int j = 0; j < array[i].length; j++) {  	// 1차원배열이 가지는 인덱스 갯수  array[0].length :4   array[1].length:4  array[2].length:4
				System.out.print(array[i][j] + "\t");  		// [i]번째의 [j]의 원소들을 나열.    [0]:1,2,3,4        [1]:5,6,7          [2]:8,9,10,11,12
			}
			System.out.println();
		}
		System.out.println();
				
		//2. 향상된 for문으로 2차원 배열원소 출력방법.
		for( int[] a : array ) { // 2차원 배열의 데이터타입은 int[] (정수배열타입)이다.	    ***2차원 인덱스 			
			for(int x : a ) {     // a는 1차원배열                                    ***1차원 인덱스 
				System.out.print(x +"\t");
			}
			System.out.println();			
		}
	}
}


