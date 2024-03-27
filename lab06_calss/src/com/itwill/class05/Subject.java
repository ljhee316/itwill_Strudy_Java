package com.itwill.class05;

public class Subject {
	// field
	int korean;
	int english;
	int math;
	int science;

	// TODO 생성자: (1)기본 생성자. (2)아규먼트를 갖는 생성자.
	public Subject() {}

	public void Subject(int korean, int english, int math, int science) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	// TODO 메서드: (1)총점 리턴. (2) 평균 리턴.
	public int total() {
		return korean + english + math + science;   //this. 생략가능 같은클래스안에 필드를 불러왔기때문에
		
	}

	public double average() {
		return (double) total() / 4;          //this. 생략가능 같은클래스안에 필드를 불러왔기때문에
	}
	
	public void info() {
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("과학: " + science);
		System.out.println("총첨: " + total());
		System.out.println("평균: " + average());
	}

}
