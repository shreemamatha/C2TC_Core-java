package com.acharya.day12;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          int arr_size = sc.nextInt();
          int arr[] = new int[arr_size];
          int i;
          for(i = 0; i< arr_size; i++)
          {
        	  arr[i] = sc.nextInt();
          }
          int search_elem = sc.nextInt();
          int is_matched = 0;
          for(i = 0; i < arr_size; i++)
          {
        	  if(arr[i] == search_elem)
        	  {
        		  is_matched = 1;
        		  break;
        	  }
          }
          if(is_matched == 1)
          {
        	  System.out.println("Found");
          }
          else
          {
        	  System.out.println("Not Found");
          }
	}

}
