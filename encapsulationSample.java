package PracticeCode;

class Santhosh {
	private String name;
	private int age;
	private int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRole(int roll) {
		this.roll= roll;
	}
}

public class encapsulationSample {
public static void main(String[] args) {
	
	Santhosh bro = new Santhosh();
	bro.setName("Bruce wayne");
	bro.setAge(22);
	bro.setRole(99);
	
	System.out.println("Name 	: "+bro.getName());
	System.out.println("Age 	: "+bro.getAge());
	System.out.println("Roll 	: "+bro.getRoll());
	
}
}
