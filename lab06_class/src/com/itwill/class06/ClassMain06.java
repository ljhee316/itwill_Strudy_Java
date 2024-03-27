package com.itwill.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		
		Account account1 = new Account(123456789, 1000);
		account1.info();
		
		Account account2 = new Account(12345,10_000);
		account2.info();
		
		//account1 만원입금. 5000출금, 출력
		System.out.print("입금후 잔액: ");
		account1.deposit(10_000);  //account1 deposit메소드 불러옴.
		account1.withdraw(5_000);
		account1.info();
		
		
		//account1 으로 account2으로 2_000원 이체.
		account1.transfer(account2, 2000);  //  account to == to.balnce ==account2.balance  
		account1.info();
		account2.info();
//		this.withdraw(amount);
//		to.deposit(amount);
		
		//account2에서 account1으로 10_000원 이체.
		account2.transfer(account1, 10_000);
		
		
		
		
		
		
		

	}

}
