package com.acharya.day7;

class student{
	void display() {
		System.out.println(this);
		System.out.println("ln display method");
	}
}
public class justify {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		System.out.println("the object reference of s1:" + s1);
		System.out.println("the object reference of s2:" + s2);
		s1.display();
		s2.display();

	}

}
