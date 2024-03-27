package com.itwill.modifier01;

/*
 *클래스멤버: 필드(field), 생성자, 메서드.
 *클래스멤버들의 접근(가시성)을 담당하는 수식어 (접근제한자):
 *-클래스의 멤버들을 접근할 수 있는(보여지는) 제한하는 수식어(access modifier)
 *-종류와 범위: private < (package) < protected < public 
 *(1) private: 선언된 클래스 안에서만 접근할수 있는(보이는) 멤버.  
 *(2) (package): 수식어를 사용하지 않은 경우, 같은 패키지에 있는 클래스에서 접근 할 수 있는 멤버.
 *(3) protected: 같은 패키지에 있거나 상속하는 클래스에서 접근할 수 있는 멤버.
 *(4) public: 어디서든 접근할 수 있는 멤버. 현재 프로젝트안에서가능.
 */


public class ModifierMain01 {



	public static void main(String[] args) {

		//AccessExample 타입객체 생성
		AccessExample ex = new AccessExample(1,2,3,4);
		//System.out.println("a = " + ex.a);  ->컴파일 에러: not visible(보이지않음)
		System.out.println("b = " + ex.b);
		ex.b = 200;
		System.out.println("b = " + ex.b);
		
		
		ex.info();  // 메서드로 a값 출력가능해짐.
	}

}
