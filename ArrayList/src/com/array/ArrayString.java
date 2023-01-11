package com.array;

import java.util.Scanner;

public class ArrayString {
	
	public static void arrayString(int size) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the size for the Integer Array");
		//size = scan.nextInt();
		String[] arrayInt = new String[size];
		
		
		for(int i = 0; i < size; i++ ) {
			System.out.println("\nEnter the String for " + i + " index" );
			arrayInt[i] = scan.nextLine();
			}
		System.out.println("Example for String array  is " );
		for(int i = 0; i < size; i++ ) {
			System.out.print(arrayInt[i] + ", ");
			}
		}
	}
