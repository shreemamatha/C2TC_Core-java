package acharya_day4;
class student {
	int roll;
	String name;
}

public class example1 {
	
	public static void main(String[] args) {
		student s = new student();
		s.name = "Akshay";
		s.roll = 143;
		System.out.println(s.roll+" "+s.name);

	}

}