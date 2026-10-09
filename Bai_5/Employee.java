package Homework.Homework_week3.Bai_5;
import java.util.Scanner;

public class Employee {
    String name;
    int day,month,year;
    int id;
    public Employee(String name, int day,int month,int year,int id) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.id = id;
    }
    public double calculateSalary() {
        return 0;
    }
    public String getType() {
        return "";
    }
}
class FullTimeEmployee extends Employee {
    double baseSalary;
    double bonus;
    double penalty;
    public FullTimeEmployee(String name, int day,int month,int year,int id,double baseSalary, double bonus,double penalty) {
        super(name,day,month,year,id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }
    public double calculateSalary() {
        return baseSalary + bonus - penalty;
    }
    public String getType() {
        return "Full-Time";
    }
}
class PartTimeEmployee extends Employee {
    double workingHours;
    double hourlyRate;
    public PartTimeEmployee(String name, int day,int month,int year,int id,double workingHours,double hourlyRate) {
        super(name,day,month,year,id);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
    public String getType() {
        return "Part-time";
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        sc.nextLine();
        Employee[] arr = new Employee[x];
        for(int i=0; i<x; i++) {
        char type = sc.next().charAt(0);
        String name = sc.findInLine("\"[^\"]*\"");
        name = name.substring(1,name.length()-1);
        if(type == 'F' ) {
            double base = sc.nextDouble();
            double bonus = sc.nextDouble();
            double penalty = sc.nextDouble();
            arr[i] = new FullTimeEmployee(name,0,0,0,i+1,base, bonus,penalty);
        } else {
            double hours = sc.nextDouble();
            double rate = sc.nextDouble();
            arr[i] = new PartTimeEmployee(name,0,0,0,i+1,hours,rate);
        }
        }
        for(Employee e : arr) {
            System.out.println(e.name + " - "+ e.getType() + " - " + e.calculateSalary());
        }
    }
}
