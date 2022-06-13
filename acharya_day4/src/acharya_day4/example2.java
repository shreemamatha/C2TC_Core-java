package acharya_day4;
class emp{
	int id;
	String name;
}
public class example2 {

	public static void main(String[] args) {
		emp s1= new emp();
		emp s2= new emp();
		s1.name = "Kevin";
		s1.id = 112;
		s2.name = "Yakshith";
		s2.id = 124;
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}

}
