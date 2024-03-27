package com.itwill.modifier03;

public class Member {
	private String memberId; // 읽기전용필드.
	private String memberPassword; // 읽기,쓰기 가능한 필드.

	// constructor ->다른클래스,패키지에서도 불러야하니깐 public 사용함.
	public Member(String memberId, String memberPassword) {
		if (memberId != null && memberPassword != null) {
			this.memberId = memberId;
			this.memberPassword = memberPassword;
		} else {
			throw new IllegalArgumentException(); // 에러를발생시키겠다.
		}
	}

	// 메서드
	public String getMemberId() {
		return this.memberId;
	}

	public String getPassword() {
		return this.memberPassword;
	}

	public void setPassword(String password) {
		if (password != null) {
			this.memberPassword = password;
		}
	}

}
