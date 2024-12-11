package taskCode;

public class revNumTask {

	public static void main(String[] args) {
		
		int[] num = new int[20];
		for(int i=0;i<20;i++) {
			num[i] = 20 - i;
		}
		
		System.out.print("Print Reverse int 20 to 1 : ");
		for(int number : num) {
			System.out.print(number+" ");
		}
	}

}
