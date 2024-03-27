package com.itwill.modifier02;

import com.itwill.modifier01.AccessExample;  
//1. 다른패키지에 있는 생성자호출이여서 import 해줘야함.

//또는 2. import 문장 업이 패키지 이름 포함한 전체 클래스 이름으로 변수를선언함.

//java.lang 패키지에 포함된 클래스들은 import 문장없이 클래스 이름만으로 변수 선언할수 있음.
//ex) java.lang.String, java.lang.System,java.lang.Math,...

public class ModefierMain02 {

	public static void main(String[] args) {
		// com.itwill. modefier01.AccessExample 타입의 객체를 생성.
		AccessExample ex = new AccessExample(1,2,3,4);
//		2. com.itwill.modifier01.AccessExample ex = 
//				new com.itwill.modifier01.AccessExample(1,2,3,4);
//		System.out.println(ex.b); ->컴파일 에러 (보이지않음)
		ex.info(); //메서드를 이용해서 모든값 출력가능.
		

	}

}
