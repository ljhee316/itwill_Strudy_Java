package com.itwill.class07;

public class ThisTest {
	
	//feild
	int x;
	int y;
	int z;
	
	
	//constructor
	public ThisTest() {}
	
	public ThisTest(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		//->this. : ThisTest 타입으로 생성된 객체(인스턴스) . 인스턴스에 값을 저장
	}
	
	public ThisTest (int x) {
		//this.x = x;
		//y,z 는 기본값으로 초기화.
		
		this(x,0,0); //-> this(...) :ThisTest 클래스의 다른 생성자 호출.
		//주의 this(...)생성자를 호출하는 코드는 다른 실행문보다 먼저 실행되어야됨. 호출하는코드는 먼저!!!
	}
	
	public ThisTest(int x, int y) {
		this();  //x,y 초기화, 다른생성자를 호출해줌
		this.x = x; //인스턴스 값을 바꿔준다.
		this.y = y; //인스턴스 값을 바꿔준다.
	}
	
	public void info() {
		System.out.printf("x=%d, y=%d, z=%d\n", x, y, z);
	

}
	
	

}
