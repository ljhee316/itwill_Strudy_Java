package com.itwill.lab05_method06;

public class Method06 {

	public static void main(String[] args) {
		// 메서드 오버로딩(method overloading)
		// 메서드의 파라미터가 다르면 같은 이름으로 메서드를 여러개 선언(정의)할 수 있음.  ex)println...
		// (주의!!) 메서드의 파라미터는 동일하고 리턴타입만 다르게는 오버로딩 할 수 없음.
		
		System.out.println("안녕"); 
		
		System.out.println("==========");
		newLine();
		System.out.println("==========");
		newLine(5);
		System.out.println("==========");
		
	}// 메인끝

	/**
	 * 콘솔에 빈 줄 하나를 출력하는 메서드 
	 */
	public static void newLine() {
		System.out.println();
	}
	/**
	 * 콘솔에 n개의 빈 줄을 출력하는 메서드
	 * @param n 콘솔에 출력할 빈 줄의 개수. 양의 정수. 만약 0 또는 음수이면 아무것도 출력하지않음.
	 */
	public static void newLine(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println();
		}		
	}
}
