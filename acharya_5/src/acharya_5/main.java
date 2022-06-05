package acharya_5;
class student{
	int rollno;
	String name;
	void insertrecord(int r,String n) {
		rollno=r;
		name=n;
	}
}
public class main {

	public static void main(String[] args) {
		student s1 =new student();
		s1.insertrecord(111, "mamatha");

		System.out.println(s1.rollno + " " + s1.name);
	}

}
