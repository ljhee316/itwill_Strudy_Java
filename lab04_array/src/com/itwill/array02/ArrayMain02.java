package com.itwill.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		//배열 선언 & 초기화 방법
		
		//2. 배열이 가지고 있는 원소들을 나열하면서 배열을 초기화.
		// 타입[] 변수이름 = {...};
		// 타입[] 변수이름 = new 타입[] {...}      -> new 타입[숫자x] : 배열 원소 개수를 표기하면 안됌! 
		
		int[] numbers = {1, 3, 5, 7};      //int[] numbers = new int[] {1, 3, 5, 7};
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("[%d] %d\n", i, numbers[i]);      //numbers[i] 원소 값을 변경도 가능함> numbers[0] =100;
		}
		
		
		//향상된 for 문 (enhanced for statement  , for-each)     -> 배열의 원소값들만 출력하고싶을때.
		// for ( 배열원소의 타입으로 변수선언 : 배열 변수이름) {...}
		for( int x : numbers) {       // number 배열에서 원소값들을 순서대로 반복해서 출력할때만 사용함. 
			                          //인덱스 이용,확인 안되고, 원소값 읽을수는 있지만 변경할수 없다.
			System.out.println(x);	
			// x =200; 원소의 값이 바뀌는것이아님.
		}
		
		//boolean 타입 5개를 저장하는 배열을 선언하고, 기본값(false)로 초기화.
		boolean[] bools = new boolean[5];    //5개의 인덱스 값을 가진 배열을 선언함.   인덱스위치는 0~4번까지.원소개수는 5개.
		for(int i = 0; i < bools.length; i++) {
			System.out.print(bools[i] + " ");
		}
		System.out.println();
		
		bools[0] = true;  //bools의 인덱스 0번 위치에 원소를 true 로 변경한다.
		bools[4] = true;   // 4번위치의 인덱스의 값을 변경하겠다.  인덱스위치 0~4 까지임. 인덱스(원소개수)는 5개.
		for(boolean x : bools) {   // boolean 배열이기때문에  변수이름 새로 선언.
			System.out.print(x+ " ");
		}
		System.out.println();
		
		//문자열 3개를 저장할 수 있는 배열을 선언하고, 기본값(null)으로 초기화.
		String[] names = new String[3];  
		names[0] = "홍길동";
		names[2] = "오쌤";
		for(String s : names) {           //배열의 타입으로 새로운변수선언 : 배열 변수이름
			System.out.print(s + " ");			
		}
		System.out.println();
	}

}
