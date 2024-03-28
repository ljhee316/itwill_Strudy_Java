package com.itwill.ver01;

import java.util.Scanner;

public class ContactMain {
	// 필드
	private static final int MAX_LENGTH = 3;// 연락처 배열의 최대길이(원소개수)

	private Scanner scanner = new Scanner(System.in);
	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장하기위한 배열.
	private int count = 0; // 현재까지 연락처배열에 저장된 개수. 연락처 저장 할 인덱스위치를 정하기위해.
							// 배열에 새로운 연락처 저장 할때마다 count++;

	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 v0.1");

		ContactMain app = new ContactMain(); // 메인이 static이기때문에 static이 아닌 Contact클래스는 생성자 호출해줘야함.

		// 메인메뉴보여주기
		boolean run = true; // 프로그램 계속 실행(run=true) 또는 종료(run=false) 여부를 저장하기위한 변수.
		while (run) {
			int meun = app.showMainMeun();
			switch (meun) {
			case 0:
				run = false;
				break;
			case 1:
				app.saveNewContact();
				break;
			case 2:
				app.readAllContacts();
				break;
			case 3:
				app.readContactByIndex();
				break;
			case 4:
				app.updateContactByIndex();
				break;
			default:
				System.out.println("메뉴 번호(0 ~ 4)를 확인하세요.");
			}
		}

		System.out.println("*** 프로그램 종료 ***");

	}

	// 메서드
	private int showMainMeun() {
		System.out.println("\n------------아래 숫자에서 선택하세요----------------");
		System.out.println("[0]종료 [1]저장 [2]전체목록 [3]인덱스검색 [4]수정");
		System.out.println("-----------------------------------------------------");
		System.out.print("선택>>> ");
		int meun = Integer.parseInt(scanner.nextLine());// 스캐너객체생성만 하고 인스턴스 값은 없는데 int로 값을 저장해야되는데 parseInt는
														// static수식어임->parseint 가 static인 이유.
		// 숫자만 입력가능하게 하기위해 int사용함.
		return meun;
	}

	private void saveNewContact() {
		try {
			if (count < contacts.length) {
				System.out.println("\n----새 연락처 저장----");
				System.out.print("이름 입력>>> ");
				String name = scanner.nextLine();
				System.out.print("전화번호 입력>>> ");
				String phone = scanner.nextLine();
				System.out.print("이메일 입력>>> ");
				String email = scanner.nextLine();
				Contact contact = new Contact(name, phone, email);
				// Contact 타입 객체를 연락처 배열 인덱스 count에 저장.
				contacts[count] = contact;
				// 저장 후에는 연락처 저장 개수 증가해서 저장.
				count++;
			} else if (count == contacts.length) {
				System.out.println("메모리가 꽉 찼습니다.");
			}

		} catch (java.lang.ArrayIndexOutOfBoundsException e1) {
		}
	}

	private void readAllContacts() {
		System.out.println("\n----연락처 목록----");
		for (int i = 0; i < count; i++) {
			System.out.println(contacts[i].toString());
		}
	}

	private void readContactByIndex() {
		System.out.println("\n----인덱스 검색----");
		System.out.print("인덱스 입력>>> ");
		int index = Integer.parseInt(scanner.nextLine());
		try {
			if (contacts[index] != null)
				System.out.println(contacts[index].toString());
		} catch (java.lang.ArrayIndexOutOfBoundsException e2) {
			System.out.println("연락처가 없습니다");
		}
	}

//		
//		if (contacts[index] != null) {
//			if (count < MAX_LENGTH) {
//				System.out.println(contacts[index].toString());
//			} else {
//				System.out.println("다시 입력해주세요");
//			}
//		} else if (contacts[index] == null) {
//			System.out.println("다시 입력해주세요");
//			if (count <= contacts.length) {
//				System.out.println("다시 입력해주세요");
//			}
//		}
//	}    

	private void updateContactByIndex() {
		try {
		if (count <= contacts.length) {
		System.out.println("\n----연락처 수정----");
		System.out.print("인덱스 입력>>> ");
		int index = Integer.parseInt(scanner.nextLine());
		System.out.println("수정 전: " + contacts[index].toString());
		System.out.print("이름 수정>>> ");
		String name = scanner.nextLine();
		System.out.print("전화번호 수정>>> ");
		String phone = scanner.nextLine();
		System.out.print("이메일 수정>>> ");
		String email = scanner.nextLine();
		contacts[index].setName(name);
		contacts[index].setEmail(email);
		contacts[index].setPhone(phone);
		}
		}catch(java.lang.ArrayIndexOutOfBoundsException e3) {
			System.out.println("변경 할 연락처가 없습니다.");
		}
	}
}
