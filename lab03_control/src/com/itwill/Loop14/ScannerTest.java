package com.itwill.Loop14;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Scanner 사용한 콘솔 입력.
		/* nextInt(): 입력버퍼(임시메모리)에서 공백문자(스페이스바, 탭, 엔터)로 구분된 입력값을
		읽어서 int 타입 정수를 반환(읽어옴 불러옴). 읽었던 값까지만 입력 버퍼를 지움.
		*/
		// nextDouble(): 입력 버퍼에서 공백문자로 구분된 입력값을 읽어서 double타입 실수를 반환.
		// next(): 입력 버퍼에서 공백문자로 구분된 입력값을 읽어서 문자열(String)을 반환.
		
		//*** 입력버퍼( 처음 값 ~ 공백전까지) 에 남아있으면 계속 불러오고, 입력버퍼에 비워있으면 입력칸 기다림.
		
		
		//nextLine(); : 입력버퍼에서 엔터를 만날때까지 모든 값을 읽어서 문자열을 반환.
		// nextLine(); 을 호출하면 입력 버퍼의 모든 내용이 지워짐! >>모두 읽어오기 때문에 값이 없음.
		// 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력>>> ");    //인터페이스, 콘솔창에 보여주기위함.
		int x = scanner.nextInt();
		System.out.println("x = " + x);
		
		System.out.print("정수 입력>>> ");   //입력버퍼(임시저장메모리)
		x = scanner.nextInt();
		System.out.println("x = " + x);
		
		
		
		System.out.print("이름을 입력>>> ");
		String name = scanner.next();
		System.out.println("name: " + name);
		
		System.out.print("이메일 입력>>>");
		String email = scanner.next();
		System.out.println("email: " + email);
		
		                       // 위에 입력버퍼에 엔터가 남아있기때문에 nextLine(); 호출해서 깨끗하게 비워주어야함.
		scanner.nextLine();    //>>>>입력버퍼에 남아있는 값을 읽고 버퍼를 지움. => 입력버퍼에 깨끗한 상태임.  계속 비워주기위해 호출해줘야함.
		
		System.out.print("문자열 입력>>> ");
		String msg = scanner.nextLine();
		System.out.println("msg: " + msg);

		
		
		//nextLine()으로 읽은 값을 정수로 변환하는방법 -> Integer.parseInt(...)
		//nextLine()으로 읽은 값을 실수로 변환하는방법 -> Double.parseDouble(...)
		
		System.out.print("정수입력>>> ");
		x = Integer.parseInt(scanner.nextLine());  // scanner.nextLine() 값을  정수로 불러오겠다. 12 22 가 오류이유: 정수로 불러와야하는데공백이 있어서. 
		System.out.println("x = " + x);
		
		System.out.print("실수입력>>> ");
		double y = Double.parseDouble(scanner.nextLine());  // 실수 선언하고 scanner.nextLine() 값을 실수로 불러오겠다.
		System.out.println("y = " + y);
	}

}
