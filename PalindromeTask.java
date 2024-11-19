package program_1;

import java.util.*;

public class PalindromeTask {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("..................................................");
		System.out.println("Enter the Number");
		System.out.println("..................................................");
		int num = sc.nextInt();
		
		int real = num;
		int reverse = 0;
	
		//Reverse the num
		while ( num != 0 ) {
			int mod = num % 10;
			reverse = reverse * 10 + mod;
			num = num / 10;
		}
		
		if ( reverse == real ) {
			System.out.println(real+" is a Palindrome ");
		} else {
			System.out.println(real+" is not a Palindrome");
		}
		
	}
	
}
