package com.itwill.calss03;

public class Person {
	//field.
	String name;
	int age;
	
	
	//constructor.
	public Person() {}        //기본 생성자가 필요해서 만들어줌.	

	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}	
	
	//method.
	public void introduce() {  //필드로 출력할거라 파라미터 필요없음.
		System.out.println("안녕하세요, 저는 " + name + "입니다.");
		System.out.println("제 나이는 " + age + "입니다.");
	}

}
