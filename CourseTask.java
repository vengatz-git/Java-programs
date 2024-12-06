package PracticeCode;

class Courses {
	String Course;
	String Instructor;
	int Credits;
	
	Courses(String Course, String Instructor, int Credits){
		this.Course=Course;
		this.Instructor=Instructor;
		this.Credits=Credits;
	}
	void showDetails() {
		System.out.println("Course		: "+Course);
		System.out.println("Instructor	: "+Instructor);
		System.out.println("Credits		: "+Credits);
	}
}

class offlineCourse extends Courses {
	String Platform;
	int Duration;
	int Marks;
	
	offlineCourse(String Course, String Instructor, int Credits, String Platform, int Duration, int Marks) {
		super(Course,Instructor,Credits);
		this.Platform=Platform;
		this.Duration=Duration;
		this.Marks=Marks;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Platform	: "+Platform);
		System.out.println("Duration	: "+Duration+" Mins");
		System.out.println("Marks		: "+Marks);
	}
	boolean isEligibleForPlacement() {
		return Marks >=75;
	}
}
class onlineCourse extends Courses {
	String Platform;
	int Duration;
	int Marks;
	
	onlineCourse(String Course, String Instructor, int Credits, String Platform, int Duration, int Marks) {
		super(Course,Instructor,Credits);
		this.Platform=Platform;
		this.Duration=Duration;
		this.Marks=Marks;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Platform	: "+Platform);
		System.out.println("Duration	: "+Duration+" Mins");
		System.out.println("Marks		: "+Marks);
	}
	boolean isEligibleForPlacement() {
		return Marks >=75;
	}
}

public class CourseTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		offlineCourse oc = new offlineCourse("Java Full-Stack","MohanaPriya",75,"SLA",120,90);
		onlineCourse onc = new onlineCourse("JavaScript","Agnel John",85,"EMC",240,95);
		
		oc.showDetails();
		System.out.println("=========================================");
		System.out.println("Eligible for Placement : "+oc.isEligibleForPlacement());
		System.out.println("=========================================");
		onc.showDetails();
		System.out.println("=========================================");
		System.out.println("Eligible for Placement : "+onc.isEligibleForPlacement());
		System.out.println("=========================================");
	}

}
