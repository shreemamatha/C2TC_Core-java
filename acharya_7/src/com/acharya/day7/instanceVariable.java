package com.acharya.day7;

class student1{
	int rollno;
	String name;
	float fees;
	
	public student1 (int rollno, String name, float fees) {
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	void display() {
	System.out.println(rollno+ " "+ name+ " " + fees);
	
}
public class instanceVariable {

	public static void main(String[] args) {
		student1 s1 = new student1(101,"Sanjay",5000f);
		student1 s2 = new student1(102,"Reddy",5000f);
		s1.display();
		s2.display();

	}

}
}