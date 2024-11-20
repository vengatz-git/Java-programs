package program_1;

import java.util.*;

public class ActressTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Actress : Samantha | Kajal | Nayanthara");
		String actress=sc.nextLine();
		
		switch (actress) {
		case "Samantha":
			System.out.println("Enter the pair for Samantha : Vijay | Surya | VJS");
			String Samanthapair = sc.nextLine();
			
			switch (Samanthapair) {
			case "Vijay" :
				System.out.println("Movie Name : Kaththi");
				break;
			case "Surya" :
				System.out.println("Movie Name : Anjaan");
				break;
			case "VJS" 	:
				System.out.println("Movie Name : Kaathuvaakula Rendu Kaadhal");
				break;
			default:
				System.out.println("[Unexpected Error: Choose the option mentioned above]");
				break;
			}
			break;
			
		case "Kajal":
			System.out.println("Enter the pair for Samantha : Vijay | Karthi | Dhanush");
			String Kajalpair = sc.nextLine();
			
			switch (Kajalpair) {
			case "Vijay" :
				System.out.println("Movie Name : Thuppaki");
				break;
			case "Karthi" :
				System.out.println("Movie Name : Naan Mahan Alla");
				break;
			case "Dhanush" :
				System.out.println("Movie Name : Maari");
				break;
			default:
				System.out.println("[Unexpected Error: Choose the option mentioned above]");
				break;
			}
			break;
			
		case "Nayanthara" :
			System.out.println("Enter the pair for Nayathara : Vijay | Dhanush | VJS");
			String Nayantharapair = sc.nextLine();
			
			switch(Nayantharapair) {
			case "Vijay" :
				System.out.println("Movie Name : Bigil");
				break;
			case "Dhanush" :
				System.out.println("Movie Name : Yaaradi Nee Mohini");
				break;
			case "VJS" :
				System.out.println("Movie Name : Kaathuvaakula Rendu Kaadhal");
				break;
			default:
				System.out.println("[Unexpected Error: Choose the option mentioned above]");
				break;
			}
			break;
			default:
				System.out.println("Actress Not Found; Select the Actress given above.");
				break;
		}
		
	}

}
