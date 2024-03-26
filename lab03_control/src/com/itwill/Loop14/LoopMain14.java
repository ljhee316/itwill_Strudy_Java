package com.itwill.Loop14;

import java.util.Scanner;

public class LoopMain14 {

	public static void main(String[] args) {
		boolean run = true;   //프로그램을 계속 실행할지 종료할지를 결정하기 위한 변수.
		int balance = 0;  //은행계좌의 잔고를 저장하기 위한 변수.
		Scanner scanner = new Scanner(System.in); //콘솔입력을 위해서 scanner를 선언하고 초기화해줌.
		
		
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			
			int number = scanner.nextInt(); //  선택> 옆에서 입력 기다리는중.
		
			if(number == 1) {		
			    System.out.print("예금액>");
				int data = scanner.nextInt();
			    balance += data;
			    System.out.printf("입금:%d, 잔고:%d \n", data, data );
			    System.out.println();
			}else if(number == 2) {      
				System.out.print("출금액>");
				int data = scanner.nextInt();	//switch 문  1,2 입력 변수 다르게 하거나, 선언 1번만!
				balance -= data;
			    System.out.printf("입금:%d, 잔고:%d \n", data, data );
			} else if(number == 3) {				
				System.out.print("잔고>" + balance);
				System.out.println();				
			}else if(number == 4) {
				break;  //while 문안에서 break하겠다.        // switch문 break 주의. *조건식 run=false; 사용.
		    }
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}
}
