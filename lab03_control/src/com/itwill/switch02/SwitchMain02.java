package com.itwill.switch02;

import java.util.Random;

public class SwitchMain02 {

	public static void main(String[] args) {
		// random 타입의 변수 선언, 초기화.
		Random rand = new Random();
						
		//정수 타입 변수에 1~4 까지의 정수 난수 1개를 저장.
		int code = rand.nextInt(1, 5);
		System.out.println("code = " + code);
		
		//switch-case
	
		switch(code) {     // if(code ==1 || code == 3) {}  else (code==2 || code==4){}
		case 1 :
		case 3 :
			System.out.println("남성");
			break;
		case 2 :
		case 4 :
			System.out.println("여성");
		}

	}

}
