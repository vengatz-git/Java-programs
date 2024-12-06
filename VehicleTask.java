package PracticeCode;

class vehicles {
	String Make;
	String Model;
	int Year;
	
	vehicles(String Make, String Model, int Year) {
		this.Make = Make;
		this.Model = Model;
		this.Year = Year;
	}
	void showDetails() {
		System.out.println("Company : "+Make);
		System.out.println("Model : "+Model);
		System.out.println("Year : "+Year);
	}
}
class Car extends vehicles {
	int TrunkSize;
	Car(String Make, String Model, int Year, int TrunkSize) {
		super(Make,Model,Year);
		this.TrunkSize = TrunkSize;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Trunk Size : "+TrunkSize);
	}
}

class Truck extends vehicles{
	int payLoadCapacity;
	Truck(String Make, String Model, int Year, int payLoadCapacity) {
		super(Make,Model,Year);
		this.payLoadCapacity=payLoadCapacity;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("PayLoad Capacity : "+payLoadCapacity);
	}
}

class Bike extends vehicles {
	int Mileage;
	Bike(String Make, String Model, int Year, int Mileage) {
		super(Make,Model,Year);
		this.Mileage=Mileage;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Mileage : "+Mileage);
	}
}
public class VehicleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Ford","GT40",1960,15);
		Truck t=new Truck("Tesla","CyberTruck",2023,1500);
		Bike s=new Bike("BMW","1000 RR",2014,17);
		System.out.println("=========================================");
		System.out.println("Car");
		c.showDetails();
		System.out.println("=========================================");
		System.out.println("Truck");
		t.showDetails();
		System.out.println("=========================================");
		System.out.println("Bike");
		s.showDetails();
		System.out.println("=========================================");
	}

}
