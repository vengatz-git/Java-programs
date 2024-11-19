package program_1;

public class SquareRootTask {
	
	public static void main(String[] args) {
		
		System.out.println("..................................................");
		System.out.println("Printing the square root of Numbers");
		System.out.println("..................................................");
		
		int num = 26;
		for (int i=1;i<=num/2;i++) {
			if ((i*i) == num )
			{
				System.out.println(num+" is a Perfect Square ");
				
				return;
			}
		}
		System.out.println(num+" is not a Perfect Square ");
	}

}
