package program_1;

import java.util.*;

public class ActorEx {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the actor name Vijay | Ramal | Rajini:");
	        String actor = sc.nextLine();

	        switch (actor) {
	            case "vijay":
	                System.out.println("Select the movie for review : Thuppaki | Kaavalan | Bigil | Kaththi | ATM (Azhagiya Tamil Magan)");
	                String VijayMovies = sc.nextLine();

	                switch (VijayMovies) {
	                    case "kaththi":
	                        System.out.println("Block buster");
	                        break;
	                    case "kaavalan":
	                        System.out.println("Flop");
	                        break;
	                    case "bigil":
	                        System.out.println("Block buster");
	                        break;
	                    case "thuppaki":
	                    	System.out.println("Block buster");
	                    	break;
	                    case "ATM":
	                    	System.out.println("Flop");
	                    	break;
	                    default:
	                        System.out.println("[Enter the Movie name Mentioned above]");
	                        break;
	                }
	                break;
	                
	            case "kamal":
	            	
	            	System.out.println("Select the movie for review : Indian | Nayakan | Dasavathaaram | Vishwaroopam 2 | Mumbai xpress");
	            	String KamalMovies = sc.nextLine();
	            	
	            	switch (KamalMovies) {
	            		case "Indian" :
	            			System.out.println("Block buster");
	            			break;
	            		case "nayakan":
	            			System.out.println("Block buster");
	            			break;
	            		case "dasavathaaram":
	            			System.out.println("Block buster");
	            			break;
	            		case "vishwaroopam 2":
	            			System.out.println("Flop");
	            			break;
	            		case "mumbai express":
	            			System.out.println("Flop");
	            			break;
	            		default:
		                    System.out.println("[Enter the Movie name Mentioned above]");
		                    break;
	            		}
	            	break;
	            	
	           	case "rajini" :
	            	System.out.println("Select the movie for review : Baasha | Enthiran | Sivaji | Baba | Kochadaiiyaan");
	            	String RajiniMovies = sc.nextLine();
	        	   
	            	switch (RajiniMovies) {
	            		case "baasha" :
	            			System.out.println("Block buster");
	            			break;
	            		case "enthiran":
	            			System.out.println("Block buster");
	            			break;
	            		case "sivaji":
	            			System.out.println("Block buster");
	            			break;
	            		case "baba":
	            			System.out.println("Flop");
	            			break;
	            		case "kochadaiiyaan":
	            			System.out.println("Flop");
	            			break;
	            		default:
	            			System.out.println("[Enter the Movie name Mentioned above]");
	            			break;
	            	}
	            	break;
	            	default:
	            		System.out.println("Invalid actor, plz Select the actor above");
	            		break;
	           }
	   }
}
