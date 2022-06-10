package com.acharya.statickeyword;

class student1{
	int rollno;
	String name;
	static String college="Acharya";
	
	public student1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;	
	}
	static void change() {
		college="AIT";
	}
	
	void display() {
		System.out.println(rollno+" "+ name+" "+college);
		}
}
public class variable {

	public static void main(String[] args) {
	 student1 s1 = new student1(111,"Mamatha");
	 student1 s2 = new student1(222,"Akki");
	student1.change();
	 s1.display();
	 s2.display();

	}

}
