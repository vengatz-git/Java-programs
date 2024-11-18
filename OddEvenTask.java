package program_1;

import java.util.Scanner;

public class OddEvenTask {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("......................................");
		System.out.println("Printing the ODD and EVEN saperately");
		System.out.println("......................................");
		
		
		
		System.out.println("Enter the length of Elements : ");
		
		int n = sc.nextInt();		// We have to enter how many numbers you have to check
		
		
		int[] num = new int[n];			// using the array
		
		System.out.println("Enter the number :");
		
		for(int i=0; i < n; i++) {
			
			num[i] = sc.nextInt();	// Using for loop
			
		}
		
		System.out.println("......................................");
		System.out.println("Even Numbers");
		System.out.println("......................................");
		
		for(int number:num) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

		System.out.println("......................................");
		System.out.println("Odd Numbers");
		System.out.println("......................................");
		
		for(int numbers:num) {
			
			if (numbers % 2 != 0) {
				
				System.out.println(numbers);
				
			}
			
		}
		
		System.out.println("--------------------------------------");
		sc.close();
		
	}
	
}
