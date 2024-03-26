package com.itwill.lab05_method01;

import java.util.Random;

/*
 * 메서드(method): 클래스 안에서 작성하는 함수(function)기능.
 * 프로그램에서 반복적으로 사용되는 기능들을 코드 블록으로 작성하고,
 * 기능이 필요한곳에서 호출해서 사용하기 위한 코드.
 * 자바언어는 클래스 안에서만 함수를 작성 할 수 있다. =>자바는 메서드만 작성 할 수 있다.
 * argument(아규먼트,인수): 메서드 호출하는곳에서 메서드에게 전달하는 값.
 * parameter(파라미터,매개변수,인자): 아규먼트를 저장하기 위해서 선언하는 변수.
 * retrun value (반환값): 메서드가 기능을 모두 수행 후에 메서드를 호출한 곳으로 반환하는 값.
 * 메서드에 따라서 반환값이 있을 수도 있고, 없을수도 있다. 
 */

public class MethodMain01 {      //main 메서드(method): 프로그램의 시작과 끝.
	
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
	    //-> println 메서드를 호출.
		//-> println 을 호출할때 전달한 값"안녕하세요"이 argument.
		//-> println 메서드에서 argument를 저장하기 위해서 선언한 변수는 parameter.
		//-> println은 반환값이 없는 메서드.
		
		Random rand = new Random();
		
		
		int x = rand.nextInt(10);
		//-> nextInt() 메서드를 호출.
		//-> argument - 랜덤수를 전달.
		//-> parameter - 랜던수
		//-> nextInt는 반환값이 있는 메서드. 
		
		System.out.println("x= " + x);
	}

}
