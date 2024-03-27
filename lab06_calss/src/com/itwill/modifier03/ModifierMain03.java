package com.itwill.modifier03;

/*
 * 데이터 캡슐화(encapsulation)
 * 필드들을 private으로 선언해서 클래스 외부에서는 보이지않도록(직접 접근할 수 없도록) 감추고,
 * 대신에 필요한 경우에 한해서 public으로 공개한 메서드를 제공해서
 * 간접적으로 필드들의 값을 읽거나 수정하는것을 허용하는 객체지향프로그래밍 기법.
 * 데이터의 보안과 무결성을 유지하기위해서 캡슐화를 사용한다.
 * getter메서드: private 필드의 값을 리턴하는 메서드.
 * setter메서드: private 필드의 값을 변경하는 메서드.
 */

public class ModifierMain03 {

	public static void main(String[] args) {
		// Member 타입 객체 생성
		Member member = new Member("guest", "1234");
		System.out.println("ID: " + member.getMemberId()); // getter메서드
		System.out.println("변경전 PW: " + member.getPassword()); // setter메서드
		member.setPassword("5678"); // setter메서드
		System.out.println("변경후 PW: " + member.getPassword());

		
		Person person = new Person("가나다",25);
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
		person.setAge(26);
		System.out.println("수정된 나이: " + person.getAge());
		
		
		
	}
}
