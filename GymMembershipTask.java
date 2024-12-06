package PracticeCode;

class GymMembership {
    String mName;
    String MembershipType;
    int Duration;

    GymMembership(String mName, String MembershipType, int Duration) {
        this.mName = mName;
        this.MembershipType = MembershipType;
        this.Duration = Duration;
    }

    double calculateFees() {
        // Implement fee calculation logic based on membershipType and duration
    	double basePrice;
    	switch(MembershipType) {
    	
    	case "BasicPlan":
    		basePrice = 1500;
    		break;
    	
    	case "StandardPlan":
    		basePrice = 2000;
    		break;
    	
    	default:
    		basePrice =1000;
    		break;
    	
    	}
    	if (Duration >= 6) {
    		return Duration * basePrice * 0.9;
    	}
    	return Duration  * basePrice;
    }

    boolean hasSpecialOffers() {
        // Implement logic to check for special offers based on membershipType
    	return MembershipType.equalsIgnoreCase("StandardPlan") && Duration >=6;
    }
}

class PremiumMembership extends GymMembership {
    boolean personalTrainer;
    boolean spaAccess;

    PremiumMembership(String mName, String MembershipType, int Duration, boolean personalTrainer, boolean spaAccess) {
        super(mName, MembershipType, Duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    double calculateFees() {
        // Implement fee calculation logic for premium membership
    	double basePrice = 2000;
    	
    	if(personalTrainer) {
    		basePrice = basePrice + 500;
    	}
    	if(spaAccess) {
    		basePrice = basePrice + 200;
    	}
    	if(Duration >=12) {
    		return Duration * basePrice * 0.85;
    	}
    	return Duration * basePrice;
    }

    boolean hasSpecialOffers() {
        // Implement logic to check for special offers for premium membership
    	return personalTrainer && spaAccess && Duration >=12;
    }
}

public class GymMembershipTask {

	public static void main(String[] args) {
		
			System.out.println("=========================================");
			GymMembership basicMember = new GymMembership("Alice", "basic", 5);
			System.out.println("Member Name : "+basicMember);
	        System.out.println("Basic Plan Fees: " + basicMember.calculateFees());
	        System.out.println("Has Special Offers: " + basicMember.hasSpecialOffers());
	        System.out.println("=========================================");

	        PremiumMembership premiumMember = new PremiumMembership("Bob", "premium", 11, false, false);
	        System.out.println("Member Name : "+premiumMember);
	        System.out.println("Premium Plan Fees: " + premiumMember.calculateFees());
	        System.out.println("Has Special Offers: " + premiumMember.hasSpecialOffers());
	        System.out.println("=========================================");
	}

}
