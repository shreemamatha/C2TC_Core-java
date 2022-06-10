package com.acharya.statickeyword;

public class main {
	int rollno;
	String name;
	static String college="Acharya";
	
	public main(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;	
	}
	static void change() {
		college="AIT";
	}
	
	void display() {
		System.out.println(rollno+" "+ name+" "+college);
		}
	public static void main(String[] args) {
		main m1= new main(101,"Viday");
		main m2= new main(102,"Reddy");
		change();
		m1.display();
		m2.display();
	}

}
