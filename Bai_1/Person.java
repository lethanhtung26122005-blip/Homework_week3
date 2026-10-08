package Homework.Homework_week3.Bai_1;
public class Person {
    String name;
    String dob;

    public Person(String name) {
        this.name = name;
        System.out.println("1. Person is created");
    }
}

class Employee extends Person {
    double salary;
    public Employee() {
        super("LTT");
        System.out.println("2. Employee is created");
    }
}

class Manager extends Employee {
    String department;
    public Manager() {
        System.out.println("3. Manager is created");
    }
}
class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
    }
}
