package com.codewithmosh;

public class User {
	public String name;
	
	public User(String _name) {
		this.name = _name;
	}
	
	public void sayHello() {
		System.out.println("Hi, my name is " + name);
	}
}
