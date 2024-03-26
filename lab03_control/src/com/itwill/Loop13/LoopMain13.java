package com.itwill.Loop13;

public class LoopMain13 {

	public static void main(String[] args) {
		 /* 교재 연습문제 5
        출력 결과
        *
        **
        ***
        ****
      */
     System.out.println("교재 Ex 5.");
     for (int x = 1; x <= 4; x++) {
         for (int y = 1; y <= x; y++) {
             System.out.print("*");
         }
         System.out.println();
     }
     
     System.out.println("====연습5====");
     for (int x = 1; x < 5 ; x++) {
    	 for (int y = 1; y <= x; y++) {
    		 System.out.print("*");
    	 }
    	 System.out.println();  //* 줄바꿈 표시 중요!!!!
     }
     
    
     
     /* 교재 연습문제 6
        출력 결과
            *
           **
          ***
         ****
      */
     System.out.println("교재 Ex 6-1");
     for (int x = 1; x <= 4; x++) {       // 총 4줄 반복하겠다.
         for (int y = 1; y <= 4; y++) {   // 줄마다 입력된 값 칸을 반복하겠다. 최대 **** 4개이니깐 4번 반복하겠다.
             if (y <= 4 - x) {            // 공백(=y)은 출력할건데 1줄-공백은 3, 2줄-공백은 2, 3줄-공백은 1, 4줄-공백은 0  =>  맞는조건식구하기( y= 4-x )
                 System.out.print(" ");   // 옆으로 공백을 출력
             } else {                	  // 그렇지않으면
                 System.out.print("*");   // 옆으로 * 출력
             }
         }								  
         System.out.println();            // x의 for문으로 돌아감.
     }
     
     System.out.println("======연습6=======");
     
     

     
     
     
     System.out.println("교재 Ex 6-2");
     for (int x = 1; x <= 4; x++) {
         for (int y = 4; y >= 1; y--) {
             if (y > x) {
                 System.out.print(" ");
             } else {
                 System.out.print("*");
             }
         }
         System.out.println();
     }
     
     System.out.println("교재 Ex 6-3");
     for (int x = 1; x <= 4; x++) {
         for (int y = 1; y <= 4 - x; y++) {
             System.out.print(" ");
         }
         for (int y = 1; y <= x; y++) {
             System.out.print("*");
         }
         System.out.println();
     }
	}

}
