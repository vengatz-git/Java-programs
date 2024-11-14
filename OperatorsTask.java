package program_1;

public class OperatorsTask {
	
	public static void main(String[] args) {
		
		int a = 17;
		int b = 18;
		
		
		
		System.out.println("Relational Operators");
		
		System.out.println("(a == b) :"+(a == b));					// Equal to
		
		System.out.println("(a < b) :"+(a < b));					// Lesser than
		
		System.out.println("(a > b) :"+(a > b));					// Greater than
		
		System.out.println("(a <= b) :"+(a <= b));					// Less than or Equal to
		
		System.out.println("(a >= b) :"+(a >= b));					// Greater than or equal to
		
		System.out.println("(a != b) :"+(a != b));					// Not equal to
		
		
		System.out.println("Logical Operators");
		
		System.out.println("(a < b) && (a == b) :"+((a < b) && (a == b)));			// && -- AND Operator
		
		System.out.println("(a > b) || (a != b) :"+((a > b) || (a != b)));			// || -- OR Operator
		
		System.out.println("!(a == b) :"+(a == b));									// !  -- NOT Operator
		
	}

}
