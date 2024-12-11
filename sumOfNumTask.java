package taskCode;

public class sumOfNumTask {

	public static void main(String[] args) {
		int[] number = {10,10,20,20,40};
		
		int sum = calculateSum(number);
		System.out.println("The sum of Numbers in Array is : "+sum);
	}
	
	public static int calculateSum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum = sum +num;
		}
		return sum;
	}

}
