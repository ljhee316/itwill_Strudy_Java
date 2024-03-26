package com.itwill.lab05_method07;

public class Method07 {

	public static void main(String[] args) {
		// 가변 길이 인수(variable-length argument):
		// 메서드의 아규먼트개수가 미리 정해져 있지않은 경우.
		// 메서드를 호출할때마다 아규먼트 개수가 달라질 수 있다. ex)printf...

		System.out.printf("안녕\n"); // 아규먼트 1개
		System.out.printf("안녕하세요, %s\n", "오쌤"); // 아규먼트 2개 가변길이인수1개.
		System.out.printf("%d x %d = %d\n", 2, 3, 2 * 3); // 아규먼트 4개 가변길이인수3개.

		int total = addAll();
		System.out.println(total);

		total = addAll(1, 100);
		System.out.println(total);

		total = addAll(1, 3, 5);
		System.out.println(total);

		// calculrate 출력
		System.out.println("====calculrate 출력====");
		System.out.println(calculrate("/"));
		System.out.println(calculrate("+", 2, 3));
		System.out.println(calculrate("-", 4, 5, 6, 3));
		System.out.println(calculrate("*", 3, 5));
		System.out.println(calculrate(""));
		System.out.println(calculrate("+", 3, 5, 1, 2, 3, 3));
		System.out.println(calculrate("*"));

	}// 메인끝

	// 가변길이 인수를 갖는 메서드를 선언하는 방법:
	// 가변길이 인수를 저장하는 파라미터는 "변수타입...변수이름"형식으로 선언.
	// 가변길이 인수는 메서드안에서 배열처럼 취급.
	// - 가변길이 인수는 length 속성을 가지고 있음.
	// - for문, 향상된 for문에서 사용할 수 있음.
	// 가변길이 인수를 저장하는 파라미터는 반드시 마지막 파라미터여야함!
	// 가변길이 인수를 저장하는 파라미터는 2개이상 있을 수 없음! 가장 마지막에 있어야하므로 1개만 있어야함!!!
	// 가변길이 인수를 갖는 메서드를 호출할때는 아규먼트 갯수 제한이 없음.
	// -아규먼트를 전달하지 않아도 됌.

	public static int addAll(int... args) { // int 여러개를 가질수 있다.
		System.out.println("length= " + args.length);// 가변길이 인수는 배열처럼 length속성이 있음.

		int result = 0;
		for (int x : args) {
			result += x;
		}

		return result;
	}

	/**
	 * calculrate. op값이 "+"인 경우에는 가변길이 인수 values의 합을 리턴. vlaues 가 없으면 0을 리턴. op값이
	 * "*"인 경우에는 가변길이 인수 values의 곱을 리턴. values 가 없으면 1을 리턴. op값이 "+" 나 "*"가 아니면 0을
	 * 리턴.
	 * 
	 * @param op     연산자. "+" 또는 "*".
	 * @param valuse 가변길이인수. 정수(int).
	 * @return valuse 들의 합 또는 곱.
	 */
	public static int calculrate(String op, int... values) {
		int result = 0;

//		switch(op){ 
//			case "+":
//				for(int x : values) {
//					result += x;
//				}
//				break;
//			case"*":
//				result = 1;              // 0* x는 0이니깐.
//				for(int x : values) {
//					result *= x;
//				}
//				break;
//		}
//		return result;		
//	}

		int sum = 0;
		if (op == "+") {
			for(int i : values) {
				sum += i;				
			}
			result = sum;
		} else if (op == "*") {
			int mult = 1;
			for(int i : values) {
				mult *= i;
			}
			result = mult;
		} else {
			result = 0;
		}
		return result;
	}
}
