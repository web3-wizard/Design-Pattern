package com.codewithmosh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		User user = new User("Rahul");
//		System.out.println(user.name);
//		user.sayHello();
		
		Account account = new Account();
		account.deposite(1000);
		account.withdrow(500);
		
		System.out.println(account.getBalance());
	}

}
