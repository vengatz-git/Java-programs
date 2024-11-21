package program_1;

import java.util.Scanner;

public class UpsideDownReversedTask {
	public static void main(String[] args) {
		
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int n=sc.nextInt();
		
		for(i=n;i>=1;i--) {
			
			for (j=n;j>=n-i+1;j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
