package taskCode;

@SuppressWarnings("serial")
class setException extends Exception {
	public setException(String message) {
		super(message);
	}
}

public class oddEvenExceptionTask {
	
	static void checkNum(int num) throws setException{
		if(num % 2 == 0) {
			System.out.println("The given "+num+" is Even.");
		} else {
			throw new setException("The given "+num+" is Odd.");
		}
	}
	public static void main(String[] args) {
		try {
			checkNum(15);
		}catch(setException e) {
			System.out.println(e.getMessage());
		}
		try {
			checkNum(12);
		}catch(setException e) {
			System.out.println(e.getMessage());
		}
	}

}
