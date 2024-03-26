package com.itwill.calss04;

public class Rectangle {
	//field
	double width; //직사각형의 가로 길이
	double height; //직사각형의 세로 길이
	
	
	//constructor
	//1.기본생성자 만들기
	public Rectangle() {}
	//2. 가로/세로를 아규먼트로 전달받아서 초기화하는 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	
	
	//method
	//1.넓이를 리턴.
	public double area() {
		 return this.width * height;
	}
	//2.둘레길이를 리턴.
	public double round() {
		return 2 * (width + height);
	}
	
	
	
	

}
