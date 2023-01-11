package com.array;
import java.util.Scanner;

public class Array {
	Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size for the Integer Array");
		int num = scan.nextInt();
		ArrayInt arrayInt = new ArrayInt();
		arrayInt.arrayInt(num);
		System.out.println("Enter the size for the String Array");
		num = scan.nextInt();
		ArrayString arrayString = new ArrayString();
		arrayString.arrayString(num);
		
		
		
		
		
		
		
		
		

	}
	
	/*public static void ArrayInt(int size) {
		System.out.println("Enter the size for the Integer Array");
		size = scan.nextInt();
		int[] arrayInt = new int[size];
		
		for(int i = 0; i < size; i++ ) {
			System.out.println("Enter the integer for " + i + " index" );
			arrayInt[i] = scan.nextInt();
		}
		System.out.println("Example for Integer array  is " );
		for(int i = 0; i < size; i++ ) {
			System.out.println(arrayInt[i]);
		}

		
		
		}
		
	
	
	public static void ArrayString() {
		
	}*/

}
