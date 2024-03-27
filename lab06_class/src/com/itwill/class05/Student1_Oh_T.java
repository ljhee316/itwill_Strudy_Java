package com.itwill.class05;

public class Student1_Oh_T {
    // field
    int id; // 학생 번호
    String name; // 학생 이름
    Subject1_Oh_T subject; // 수강 과목    //new Subject();
    
    // 생성자:
    // (1)기본 생성자.
    // 타입 기본값: boolean-false, 정수-0, 실수-0.0, 참조타입-null
    public Student1_Oh_T() {}
    
    // (2)아규먼트를 갖는 생성자.
    public Student1_Oh_T(int id, String name, Subject1_Oh_T subject) {
        this.id = id;  //아규먼트값을 필드값에 넣는다.
        this.name = name;
        this.subject = subject;   // 기본생성자에 필드값을 초기화해줘도 생성자에 아규먼트 값을 주면 값이 아규먼트 값으로 변경됨.
    }
 // 생성자 (3)
    public Student1_Oh_T(int id, String name, int korean, int english, int math, int science) {
        this.id = id;
        this.name = name;
        this.subject = new Subject1_Oh_T (korean, english, math, science);
    }
    
    
    // 메서드: 학생의 정보(번호, 이름, 각 과목의 점수, 총점, 평균)를 출력.
    public void info() {
        System.out.println("----- 학생 정보 -----");
        System.out.println("번호: " + id);
        System.out.println("이름: " + name);
        System.out.println("국어: " + subject.korean);
        System.out.println("영어: " + subject.english);
        System.out.println("수학: " + subject.math);
        System.out.println("과학: " + subject.science);
        System.out.println("총점: " + subject.getTotal());
        System.out.println("평균: " + subject.getMean());
        System.out.println("---------------------");
    }
    
}
