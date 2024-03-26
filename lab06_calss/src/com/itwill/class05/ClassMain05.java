package com.itwill.class05;


public class ClassMain05 {

    public static void main(String[] args) {
        // TODO: Subject, Student 클래스 객체 생성과 메서드 호출 결과 테스트.
    	
    	Student s1 = new Student();
    	Subject s2 = new Subject();
    	
    	
    	
    	s1.id();
    	s1.name();
    	s1.score();
    	s1.getTotal();
    	s1.getAverage();
    	
    	System.out.println(s1);
    	
    	s1.id = 1;
    	s1.name = "이정희";
    	s2.english = 50;
    	s2.korean = 80;
    	s2.math = 75;
    	s2.science = 80;
    	
    	s1.id();
    	s1.name();
    	s1.score();
    	s1.getTotal();
    	s1.getAverage();
    	
    	
    	
    	
    	
    	
   
        
    }
    
}
