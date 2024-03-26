package com.itwill.lab05_method03;

public class Method03 {

	public static void main(String[] args) {
		// 반환값이 없는 메소드를 작성, 호출하기.
		countdown(-1);

		
		
		
	}// 메인메소드 끝.	
	public static void countdown(int x) {
		if(x <= 0) {
			System.out.println("카운드다운 시작값은 양의 정수여야합니다.");
			return;    // void 메소드에서 return 만 남길수 있음-> 메서드를 끝낸다.
			           // return 값에 값이 있으면 메서드를 호출한 곳으로 값을 반환.
			           // void 메서드는 값이 없는 메서드이기 때문에 return 문만 작성하고 메서드를 끝낸다를 의미함.
		} 
			for(int i = x; i >= 0; i--) {
				System.out.println(i);	 //반환값이 아닌 출력만 하는거라  void로 작성해야함. 아규먼트로 반환하는것이 아니기때문에 void.		
		}
	}	
}
