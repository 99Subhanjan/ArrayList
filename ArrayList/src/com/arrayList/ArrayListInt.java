package com.arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class ArrayListInt {
	
	public static void arrayList() {
		
		ArrayList<Integer> arrayInt = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		char yes;
		
		do {
			System.out.println("Enter the integer in to add in the arraylist ");
			int num = scan.nextInt();
			arrayInt.add(num);
			System.out.println("Do you wish to continue Y/N ? ");
			yes = scan.next().charAt(0);
		}while(yes=='y');
		
		System.out.println(arrayInt);
		
		boolean check = arrayInt.contains(6);
		System.out.println(check);
		
		Object[] arr = arrayInt.toArray();
		System.out.println("Elemetnts of arraylist as an array" + Arrays.toString(arr));
		
	}

}
