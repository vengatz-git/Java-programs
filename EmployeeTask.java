package PracticeCode;

public class EmployeeTask {
	
	int id;
	String name;
	int age;
	String design;
	String dept;
	double salary;
	String address;
	long number;
	
	EmployeeTask(int id, String name, int age, String design, String dept, double salary, String address, long number) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.design=design;
		this.dept=dept;
		this.salary=salary;
		this.address=address;
		this.number=number;	
	}
	void display() {
		System.out.println(id+" "+name+" "+age+" "+design+" "+dept+" "+salary+" "+address+" "+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details ");
		EmployeeTask emp1 = new EmployeeTask(1,"He",22,"Junior Dev","Back-End",40000.90,"Vadapalani", 9876543210l);
		EmployeeTask emp2 = new EmployeeTask(2,"She",21,"Senior Dev","Back-End",35000.78,"KK Nagar", 9167574832l);
		EmployeeTask emp3 = new EmployeeTask(3,"Me",25,"Manager","Back-End",55000.01,"Dindigul", 7094138576l);
		
		System.out.println("<==========================================================================>");
		emp1.display();
		System.out.println("<-------------------------------------------------------------------------->");
		emp2.display();
		System.out.println("<-------------------------------------------------------------------------->");
		emp3.display();
		System.out.println("<==========================================================================>");
	}

}
