package com.array;
import java.util.Scanner;

public class ArrayInt {
	int size;
	
	public static void arrayInt(int size) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the size for the Integer Array");
		//size = scan.nextInt();
		int[] arrayInt = new int[size];
		
		
		for(int i = 0; i < size; i++ ) {
			System.out.println("Enter the integer for " + i + " index" );
			arrayInt[i] = scan.nextInt();
		}
		System.out.println("Example for Integer array  is " );
		for(int i = 0; i < size; i++ ) {
			System.out.print(arrayInt[i] + ", ");
		}
		
		
		
		
	}
}
	/*public static int num (int size) {
		return size;
		
	}
	
	

}*/
