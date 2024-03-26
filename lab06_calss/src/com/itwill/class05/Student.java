package com.itwill.class05;

public class Student {
	// field
	int id; // 학생 번호
	String name; // 학생 이름
	Subject subject; // 수강 과목

	// TODO 생성자: (1)기본 생성자. (2)아규먼트를 갖는 생성자.
	public Student() {
	}

	public Student(int id, String name, Subject subject) {
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	// TODO 메서드: 학생의 정보(번호, 이름, 각 과목의 점수, 총점, 평균)를 출력.
	public void idNumber() {
		System.out.println("id: " + id);
	}

	public void name() {
		System.out.println("name: " + name);
	}

	public void score() {
		if (subject != null) {
			System.out.println("korean: " + subject.korean);
			System.out.println("english: " + subject.english);
			System.out.println("math: " + subject.math);
			System.out.println("science: " + subject.science);
		} else {
			System.out.println("null");
		}

	}

	public void getTotal() {
		if (subject != null) {
			System.out.println("총점: " + subject.total());
		} else {
			System.out.println("null");
		}
	}

	public void getAverage() {
		if (subject != null) {
			System.out.println("평균: " + subject.average());
		} else {
			System.out.println("null");
		}
	}

}
