package com.itwill.variable04;

public class VariableMain04 {

	public static void main(String[] args) {
		// 문자(character) 타입 변수  char
		// char 타입: 문자 1개의 유니코드값을 저장하는 타입.
		// 문자는 작은 따옴표를 사용('a'), 문자열은 큰따옴표를 사용("abc")
		
		char ch1 = 'B';
		System.out.println(ch1);
		System.out.println((int) ch1);  // A값의 유니코드를 실행한거임.  ->타입변환
		//char-> 결국 정수로 표현된것으로, 선언 변수에 따라 정수나 문자로 결과가 다르게 됨.
		//char는 문자의 유니코드를 저장하는 특별한 종류의 정수 타입으로 사칙연산, 크기비교도 가능함!
		
		//char ch2 = ch1 + 1;    오류: char->2byte, int->4byte
		char ch2 = (char) (ch1 + 1); //타입변환(casting), 큰메모리에서 작은메모리로 강제로 타입변환할때.
		System.out.println(ch2);
		
		char ch3 = (char) (ch1 - 1);
		System.out.println(ch3);
		
		
		
		/* 
		   자동으로  타입변환 해줌.
		 * 변수는 같은 타입의 값만 저장 가능. (int i = 1;  i = 1.0   ->불가능) 
		 * 큰 범위의 타입에는 작은 범위의 값을 저장 가능. (자동으로 casting(타입변환) 해줌)  
		    -> double x = 1;    int < double  , (double 생략가능)1            //float x = 1.0F;  1.0은 기본변수 double이기때문에.
		 
		  
		 * 작은범위의 타입에는 큰 범위 값을 저장 할때 에러 발생
		 *  -예외) 정수 리터럴(literal, 상수)은 범위를 넘지 않으면 byte, short, char의 int보다 작은 용량에 저장 가능.
		 *     예) short s = 1;  (short생략가능) 1;  
		 
		 
		 * 강제 타입변환(casting): 변수의 타입을 강제로 바꿈.( char ch2 = (char) (ch1 + 1);    큰값을 작은 값으로 변환할떄)
		 
		 * char 데이터타입, (char) 타입변환
		 
		*/

	}

}
