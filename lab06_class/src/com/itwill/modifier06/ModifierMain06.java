package com.itwill.modifier06;

import java.time.LocalDate;

/*
 * 접근수식어 : 지역변수에는 사용할 수 없다.
 * 
 * final 수식어
 *-클래스, 클래스멤버들(필드,메서드), 지역변수에서 사용 가능.
 *-final의미: 바꿀 수 없다.
 *-final 필드/지역변수: 한번 초기화가 되면 더 이상 값을 변경할 수 없는 변수.(=상수 constant)
 *-final 필드는 (1)반드시 선언과 동시에 초기화 하거나, (2)아규먼트를 갖는 생성자를 선언해서 명시적으로 초기화 해야한다.
 *
 *
 *
 * 인스턴스 멤버(필드, 메서드) vs 정적(static)멤버.
 * 1. 인스턴스 멤버(필드, 메서드)
 * (1)static 수식어가 없는 멤버.
 * (2)객체를 생성한 후에 참조 변수를 이용해서(.) 사용하는 멤버(필드나 메서드)
 * (3)인스턴스 필드는 JRE(Java Runtime Environment)가 사용하는 메모리 영역 중에 힙에 생성.
 * 
 *2. 정적 멤버(필드, 메서드)
 * (1) static 수식어가 사용된 멤버.
 * (2) 객체를 생성하지 않아도 사용할 수 있는 멤버.
 * (3) 클래스이름을 이용해서 사용하는 멤버.예) Math.PI, Math.random(), System.in, System.out,...
 * (4) 정적 필드는 JRE가 사용하는 메모리 영역 중에 메서드 영역에 생성.
 * (5) 정적 멤버들은 자바 프로그램의 main() 메서드가 호출되기 전에, 프로그램 로딩하는중에 메모리에 생성된다.
 * (6) static메서드는 static으로 선언된 필드와 메서드만 사용이 가능하다!!!!!
 **/

public class ModifierMain06 {

	// final field (1)동시에 선언,초기화.
	private static final int version = 1;

	// final 필드 (2)명시적으로 초기화.
	private final String message; // 혼자 쓰이면 초기화가 안되어서 에러.

	public ModifierMain06(String message) { // 명시적으로 생성자를 만들어서 초기해주어야함.
		this.message = message;
	}

	public static void main(String[] args) {
		// 지역변수
		int n1 = 10;
		n1 = 100; // 언제나 값을 변경가능.
		
//		message = "a"'  ->static 생성자가 아니기때문에 에러.

		final int n2 = 10; // 상수
		// n2 = 100; ->값을 재 할당 할 수 없다.
		// version =2; -> final 필드값을 변경 할 수 없다.

		// ModifierMain06 타입의 객체 생성.
		ModifierMain06 app = new ModifierMain06("버스파업");  //생성자 불러옴.(heap영역에 만들어주기위해)
		System.out.println(app.message);
		//app.message = "버스";  상수이기때문에 재할당 안됨.
		
		
		//Test 클래스의 static 멤버사용:
		System.out.println("Test : " + Test.y); //static 필드는 객체생성과 상관없이 불러오고 
		Test.y = 100;  //static 필드는 객체생성과 상관없이  값 변경 가능.
		System.out.println("Test : " + Test.y); //static 필드는 객체생성과 상관없이  출력가능.
		Test.printField2();  //메소드 불러옴.
		
		//Test 클래스의 인스턴스 멤버사용: 먼저 객체생성해야함.
		Test test = new Test();
		System.out.println("test.x = " + test.x);
		test.x = 100;
		test.printField();
		
		
		
		
		
	}

	
	
	
	
}
