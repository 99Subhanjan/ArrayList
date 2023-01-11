package com.arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {
	
	public static void arrayList() {
		
		ArrayList <String> arrayString = new ArrayList <String>();
		Scanner scan = new Scanner(System.in);
		
		char yes;
		
		do {
			System.out.println("Enter the String  to add in the arraylist ");
			String string = scan.nextLine();
			arrayString.add(string);
			System.out.println("Do you wish to continue Y/N ? ");
			yes = scan.next().charAt(0);
		}while(yes=='y');
		
		
		System.out.println(arrayString);
		
		
		
	}

}
