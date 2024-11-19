package program_1;

import java.util.Scanner;

public class MultiplyTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("..................................................");
		System.out.println(" Enter a Number ");
		System.out.println("..................................................");
		int num = sc.nextInt();
		
		if ( num % 2 == 0 ) {
			System.out.println(num+" is a multiple of 2 ");
		} else {
			System.out.println(num+" is not a multiple of 2 ");
		}
		
	}

}
