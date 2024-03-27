package com.itwill.modifier01;

public class AccessExample {
	//feild
	private int a;
	int b;
	protected int c;
	public int d;
	
	
	public AccessExample(int a, int b, int c,int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	//method
	public void info() {
		System.out.printf("a=%d, b=%d,c=%d, d=%d\n", a, b, c, d);  //a값은 메인메서드에서 출력하기위해
	}//-> 간접적으로 필드값을 읽어옴.

}
