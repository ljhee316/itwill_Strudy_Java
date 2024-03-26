package com.itwill.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// TODO: Subject, Student 클래스 객체 생성과 메서드 호출 결과 테스트.

		Student s1 = new Student();
		Subject s2 = new Subject();

		s1.idNumber();
		s1.name();
		s1.score();
		s1.getTotal();
		s1.getAverage();

		System.out.println("================");

		Student s3 = new Student(1, "이정희", s2);
		s2.Subject(80, 75, 65, 90);

		s3.idNumber();
		s3.name();
		s3.score();
		s3.getTotal();
		s3.getAverage();

	}

}
