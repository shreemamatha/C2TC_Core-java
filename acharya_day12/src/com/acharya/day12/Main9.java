package com.acharya.day12;

public class Main9 {

	public static void main(String[] args) {
		int arr[] = {1,0,1,1,1,0,0};
int sum = 0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==1)
		sum=sum+3;
	else
		sum=sum-1;
}
System.out.print("Total Marks Obtained :"+sum);
	}

}
