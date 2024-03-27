package com.itwill.class02;


// 클래스(class): 객체 설계도. 데이터(필드) + 생성자 + 기능(메서드) => 변수 타입.
public class Score {
    // 필드(field). 멤버 변수.
    int java;
    int sql;
    int javascript;
    
    //생성자(Constructor)
    //객체를 생성하고, 객체의 필드들을 초기화하는 역할.
    //생성자의 이름은 반드시 클래스의 이름과 같아야함!
      
    //기본 생성자(default Constructor): 아규먼트를 갖지 않는 생성자.     ex)new Random();
    public Score() {
    	//아무런 코드를 작성하지 않아도 됨.
    	//코드가 없어도 모든 필드들을 그 필드 타입의 기본값으로 초기화를 해줌.
    	//생성자를 작성하는 방법은 메서드 작성방법과 비슷하지만, 리턴타입이 없다.
    	//클래스를 선언할때 생성자를 하나도 정의하지 않으면, 자바컴파일러가 기본 생성자를 자동으로 만들어줌.
    	//클래스를 선언할때 생성자를 직접 정의한 경우에는, 자바컴파일러가 기본 생성자를 자동으로 만들어주지않음!
    	//생성자 오버로딩: 파라미터가 다른 생성자를 여러개 만들 수 있음.
    }
    
    //아규먼트를 갖는 생성자.       ex)new Scanner(System.in);
    public Score(int java, int sql, int js) {
    	this.java = java;
    	this.sql = sql;
    	javascript = js;  // 필드랑 지역변수가 다를경우 this안써도 됨.
    }
    
    
    // 메서드(method).
    public int getTotal() {
        return java + sql + javascript;
    }
    
    public double getMean() {
        return (double) getTotal() / 3;
    }
    
    
    
    
    
}
