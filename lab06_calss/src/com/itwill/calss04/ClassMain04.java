package com.itwill.calss04;

public class ClassMain04 {

	public static void main(String[] args) {
		// Rectangle 객체 생성, 메서드 호출.
		Rectangle r1 = new Rectangle();
		
		r1.height = 4.5;
		r1.width = 5.5;
		System.out.println("r1 사각형의 넓이: " +r1.area());
		System.out.println("r1 사각형의 둘레: " + r1.round());
		
		
		Rectangle r2 = new Rectangle(3, 5.0);
		System.out.println("r2 사각형의 넓이: " + r2.area());		
		System.out.println("r2 사각형의 둘레: " + r2.round());

	}

}
