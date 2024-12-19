package taskCode;

class Odd extends Thread{
	int n = 20;
	@Override
	public void run() {
		
	for(int i = 0; i <= n; i++) {
		if(i % 2 != 0) {
			System.out.println("Odd Thread : "+i);
			}
		}
	System.out.println("<================================>");
	}
}

class Even extends Thread {
	int n1 = 20;
	@Override
	public void run() {
		for(int i =0; i <= n1; i++) {
			if(i % 2 == 0) {
				System.out.println("Even Thread : "+i);
			}
		}
		System.out.println("<================================>");
	}
}
public class oddEvenThreadTask {

	public static void main(String[] args) {
		
		Odd num = new Odd();
		Even num1 = new Even();
		
		System.out.println("<================================>");
		num.start();
		num1.start();
		
	}

}
