package com.itwill.Loop10;

public class LoopMain10 {

	public static void main(String[] args) {
		// do-while 문
		// do {...}  while (조건식); 
		// 블록을 먼저 한번 실행하고, 반복을 계속 할지를 결정하기 위해 조건식 검사함.
		// 주의!!! do-while 문장은 반드시 ; 세미콜론으로 끝내야함.
		
		int x =1;
		do {
			System.out.println(x);
			x--;
		} while (x < 0);
		 System.out.println("-> end do-while 2");
		
		

	}

}
