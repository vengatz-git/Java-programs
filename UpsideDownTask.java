package program_1;

import java.util.Scanner;

public class UpsideDownTask {
	
	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int n = sc.nextInt();
		
		for (i=1;i<=n;i++) {
			
			for (j=n;j>=i;j--) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		sc.close();
	}
	
}
