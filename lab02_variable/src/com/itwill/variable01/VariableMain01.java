package com.itwill.variable01;

public class VariableMain01 {

	public static void main(String[] args) {
		//변수(variable) : 프로그램에서 필요한 데이터를 저장하는 메모리 공간.(임시로 저장)
		//변수 사용  
		//1. 변수 선언: 저장하는 데이터의 종류(타입)과 변수 이름을 선언.
		//2. 변수 초기화: 변수에 값을 처음 저장하는 것.
		int age;  // ->변수 선언    int(integer): 정수를 저장하는 데이터타입.
		age = 16;  // -> 변수 초기화  (변수에 정수 16을 저장함)
		
		System.out.println("나이: " + age);
		
		
		int x = 100;  //변수를 선언과 초기화를 한 문장으로 작성한다.
		System.out.println("x = " + x);
		
		
		
		//자바의 기본 데이터 타입
		//정수 타입: byte, short, int, long, char
		//실수 타입: float, double  (소수점 이하 정밀도 차이)
		//논리 타입: boolean  (true, false)
		long number = 123_456_789_000L;  //끝에 L 쓰는 이유 :  먼저 데이터타입 long에 맞는 용량을 맞추기 위해.  기본int이기때문에.
		double pi = 3.141592;
		boolean isMarried = false;
		
		
		//변수이름 작성 규칙
		// 알파벳, 숫자, _, $ 만 사용가능.
		// 대,소문자를 구분함.( x ,X 는 서로 다른 변수임.)
		// 숫자로 시작할 수 없음.
		// 자바의 키워드(예약어)는 사용할 수 없음.
		
		// 변수이름 관습(권장)
		// 변수 이름은 변수 역할에 어울리는 "의미 있는" 단어를 사용해서 만들것.
		// 2개 이상의 단어를 붙여서 만들 경우에는 "소문자"로 시작하는 camel 표기법 사용. 예) userId, userPassword
		// ---snake 표기법 : user_id, user_password, is_married
		
	
		
	}

}
