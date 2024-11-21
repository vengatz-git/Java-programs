package program_1;

import java.util.Scanner;

public class PerfectTriangleTask {
	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int rows = sc.nextInt();
		
		for (i=1;i<=rows;i++) {							// Loop iterates for the given number rows
			
			for (j=rows;j>=i;j--) {						// Printing space between the Rows
				System.out.print(" ");
			}
			
			for (j=1;j<=i;j++) {							// loop to print the number of stars in each row 
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
