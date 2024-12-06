package PracticeCode;

class Person {
    String Name;
    int Age;
    String Position;

    Person(String Name, int Age, String Position) {
        this.Name = Name;
        this.Age = Age;
        this.Position=Position;
    }

    void printDetails() {
        System.out.println("Name	: " +Name);
        System.out.println("Age	: " +Age);
        System.out.println("Position: " +Position);
    }
}

public class PersonTask {
    public static void main(String[] args) {
        Person person1 = new Person("Thors", 25,"Joms Vikings leader");
        Person person2 = new Person("Thorfinn", 12,"Leader of Vinland");
        Person person3 = new Person("Naruto", 30,"Hokage");
        
        System.out.println("=========================================");
        person1.printDetails();
        System.out.println("=========================================");
        person2.printDetails();
        System.out.println("=========================================");
        person3.printDetails();
        System.out.println("=========================================");
    }
}