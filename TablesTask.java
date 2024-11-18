package program_1;

import java.util.Scanner;

public class TablesTask {

	public static void main(String[] args) {
		
		System.out.println("Enter the table number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<= 10; i++) {
			System.out.println(i + " x "+ num +" = "+ (i*num));
		}

	}

}
