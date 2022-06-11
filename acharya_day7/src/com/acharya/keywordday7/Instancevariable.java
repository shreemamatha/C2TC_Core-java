package com.acharya.keywordday7;

class student{
		int rollno;
		String name;
		float fees;
		public student(int rollno, String name, float fees) {
			this.rollno = rollno;
			this.name = name;
			this.fees = fees;
		}
		void display() {
			System.out.println(rollno+ " "+ name+" " +fees);
		}	
}
public class Instancevariable {

	public static void main(String[] args) {
		student s1 = new student(100,"Madhu",5000f);
		student s2 = new student(104,"Kenith",5000f);
		s1.display();
		s2.display();
	}

}
