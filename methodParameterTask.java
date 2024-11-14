package program_1;

public class methodParameterTask {
	
	static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		add(num1 , num2);
	}
	
	public static void add(int a, int b) {
		
		int sum = a + b;
		
		System.out.println("The sum of two number is : "+sum);
		
	}
}
