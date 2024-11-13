package program_1;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		// new method is used to create n number of objects
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Name");
		//String Input
		String name=obj.nextLine();
		//Numerical Input
		System.out.println("Enter the Age");
		int age=obj.nextInt();
		System.out.println("Enter the Salary");
		double salary=obj.nextDouble();
		System.out.println("Enter the Gender");
		char gender=obj.next().charAt(0);
		System.out.println("Enter the Status");
		boolean isMarried=obj.nextBoolean();
		System.out.println("Mobile Number");
		long number=obj.nextLong();
		//Output	
		System.out.println("Name	:"+name);
		System.out.println("Age 	:"+age);
		System.out.println("Salary	:"+salary);
		System.out.println("Gender	:"+gender);
		System.out.println("isMarried	:"+isMarried);
		System.out.println("Number	:"+number);
		
		
	}
}
