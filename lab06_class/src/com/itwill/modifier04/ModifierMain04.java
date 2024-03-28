package com.itwill.modifier04;

import com.itwill.modifier05.PublicClassEx;

/*
 * 클래스멤버의 접근 제한자: private < (package) < protected < public.
 * 클래스의 접근제한자: 
 *  (1)public: 같은프로젝트안에 있는 공개된 모든 클래스. import 문장을 사용할 수 있음. 
 *  (2)package : 수식어가 없는경우. 같은 패키지안에서만 공개된 클래스.
 * (주의!) public 클래스의 이름은 java파일의 이름과 같아야함. 
 * 하나의 java파일 안에서 여러개의 클래스를 선언하는 것은 가능.(컴파일후에는 각각의 class파일(바이트코드)이 생성됨.) 
 * 하나의 java파일 안에서 2개이상의 public 클래스 선언할 수 없음. =>public class 클래스파일이름. 클래스 이름이 같아야하기때문에 1개만 선언할수 있음.
 * 
 */




public class ModifierMain04 {

	public static void main(String[] args) {
		// TODO PublicClassEx 타입 객체 생성
		PublicClassEx ex = new PublicClassEx();
		System.out.println(ex);
		
//		com.itwill.modifier05.PackageClassEx ex2;  ->컴파일 에러(not visible)
	}

}
