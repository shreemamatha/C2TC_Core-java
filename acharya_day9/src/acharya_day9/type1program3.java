package acharya_day9;

import java.util.Scanner;

public class type1program3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("50 ");
	int n=sc.nextInt();
	for(int i=2;i<=n;i++)
	{
      char ch = 'A';
      
      for(int j=1;j<=i;j++)
    	  System.out.print(ch++);
      System.out.println();
	}

}
}