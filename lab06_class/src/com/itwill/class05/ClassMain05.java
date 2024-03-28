package com.itwill.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// TODO: Subject, Student 클래스 객체 생성과 메서드 호출 결과 테스트.

		Student s1 = new Student();
		Subject s2 = new Subject();
//		System.out.println("국어: " + s2.korean);
//		System.out.println("영어: " + s2.english);
//		System.out.println("수`학: " + s2.math);
//		System.out.println("과학: " + s2.science);
//		System.out.println("총첨: " + s2.total());
//		System.out.println("평균: " + s2.average());
//		System.out.println("====================");
		s2.info();
		System.out.println("================");
		
		//Subject subjuct2 = s2.Subject(0, 0, 0, 0);
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
