package program_1;

public class ArmstrongTask {

	public static void main(String[] args) {
		
		int num = 153;
		int temp = num;
		int sum = 0;
		while(num > 0) {
			int mod = num % 10;
			sum = sum + (mod*mod*mod);
			num = num /10;
		}
		
		if(sum == temp) {
			System.out.println("Armstrong ");
		} else 
			System.out.println("Not Armstrong ");

	}

}
