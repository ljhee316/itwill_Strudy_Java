package com.itwill.modifier06;

public class Test {
	int x; //인스턴스 필드
	static int y; //static 필드

	
	//인스턴스 메서드
	public void printField() {
		System.out.println("----인스턴스 메서드----");
		System.out.println("x = " + x);
		System.out.println("y = " + y); //이미메서드영역에 만들어져있기때문에 y 사용가능.
		System.out.println("------------------------");  //인스턴스 메서드는 stactic 필드 사용도 가능.
	}
		
	
	//static 메서드
	public static void printField2() {  //static 생성자부르지않아도 메서드사용가능함.
		System.out.println("----static 메서드----");
//		System.out.println("x = " + x); 생성자부르기전엔 힙영역에 없기때문에 사용안됨. x는  package 수식어임.
		System.out.println("y = " + y);
		System.out.println("----------------------");
	}
 }
