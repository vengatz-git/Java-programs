package program_1;

public class ReturnTypeTask {
	
	static int add (int num1 , int num2) {
		
		return num1 + num2;
		
	}
	
	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 25;
		
		int result = add(num1 , num2);
		
		System.out.println("The value of "+num1+" and "+num2+ " is : "+result);
		
	}
	
}
