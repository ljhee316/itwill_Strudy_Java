package com.itwill.loop09;

public class LoopMain09 {

	public static void main(String[] args) {
		// 중첩 while 문장을 사용해서 구구단 1단~ 12단까지 출력.
		int x = 1;
		// int y = 1;  while문안에서 다시 한번 더 초기화 시켜줘야함.
		while (x < 13) {
			System.out.println("-----" + x + "단-----");		
			
			int y = 1;   //while문 안에서 입력해야 1~13까지 제대로 결과나옴.  
			             //while 밖에 입력하면 첫번째에 y값은 13이 되기때문에 종료가 됌. /해결방법 다시 초기화하기.
			while (y < 13) {
			System.out.printf("%d x %d = %d\n", x, y, (x * y));
			y++;			
			}
			
		x++;    //    블록 확인!!!
		}
		System.out.println();
	}
}




