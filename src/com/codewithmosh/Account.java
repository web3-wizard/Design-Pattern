package com.codewithmosh;

public class Account {
	private int balance;
	
	public Account(){
		this.balance = 0;
	}
	
	public void deposite(int amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
	
	public void withdrow(int amount) {
		if(amount > 0 && this.balance > amount) {
			this.balance -= amount;
		}
	}
	
	public int getBalance() {
		return this.balance;
	}
}
