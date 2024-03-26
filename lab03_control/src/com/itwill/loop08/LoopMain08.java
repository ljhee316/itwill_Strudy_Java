package com.itwill.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// while 반복문	
		System.out.println("----- [1] -----");
		int n = 1;   //메인 메소드안에서 변수 n은 선언되어있음.
		while (n <= 5) {
			System.out.print(n + " ");
			n++;  //n += 1 , n = n + 1
		}
		System.out.println();    // n출력 : 6
		
		System.out.println("----- [2] -----");
		// 5 4 3 2 1  출력
		int x = 5;
		while (x > 0) {
			System.out.print(x + " ");  // (--n + " " ) 랑 같음. : n과 문자열 더하고, --감소연산자를 나중에 해줌.
			x--;
		}
		System.out.println();
		
		System.out.println("----- [3] -----"); 
		// 1 3 5 7 9 출력
		int y = 1;
		while ( y < 10 ) {  //{while 블록시작
			if(y % 2 == 1) {  //if 블록시작
				System.out.print(y + " ");
			}   //if 블록 끝
			y++;   //if 블록 밖에서 증가연산자를 입력해야함.
		}   //while 블록 끝
		
		System.out.println();
		
		System.out.println("----- [3-1] -----");
		
		// 1 3 5 7 9 출력
		y = 1;
		while (y <10) {
			System.out.print( y + " ");
			y += 2;
		}
		System.out.println();
		
		System.out.println("----- [4] -----");
		
		
		//while문을 이용해서 구구단 9단을 출력
		
		y = 1;
		while ( y <= 9) {
			System.out.printf("9 x %d = %d\n", 9, y, ( 9 * y ));
			y++;
		}
		
	}		

}
