package com.itwill.class05;

public class ClassMain05_Oh_T {

    public static void main(String[] args) {
        // Homework: Subject, Student 클래스 객체 생성과 메서드 호출 결과 테스트.
        
        // 기본생성자를 사용해서 Subject 타입의 객체 생성
    	Subject1_Oh_T subject1 = new Subject1_Oh_T();    
//        System.out.println("국어: " + subject1.korean);
//        System.out.println("영어: " + subject1.english);
//        System.out.println("수학: " + subject1.math);
//        System.out.println("과학: " + subject1.science);
//        System.out.println("총점: " + subject1.getTotal());
//        System.out.println("평균: " + subject1.getMean());
        subject1.info();
        
        // 아규먼트를 갖는 생성자를 사용해서 Subject 타입의 객체를 생성
        Subject1_Oh_T subject2 = new Subject1_Oh_T(100, 90, 50, 70);
        subject2.info();
        
        // 아규먼트를 갖는 생성자를 사용해서 Student 타입의 객체를 생성
        Student1_Oh_T student1 = new Student1_Oh_T (1, "홍길동", null);
        student1.info();
        
    }
    
}
