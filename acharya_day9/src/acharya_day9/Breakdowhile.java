package acharya_day9;

public class Breakdowhile {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i==5) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println(i);

	}
}