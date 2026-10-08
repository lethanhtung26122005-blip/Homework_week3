package Homework.Homework_week3.Bai_4;
public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override 
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
class Cat extends Animal {
    @Override 
    public void makeSound() {
        System.out.println("Meows Meows");
    }
}
class Duck extends Animal {

}
class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.makeSound();
        } else {
            System.out.println("Đây không phải là Mèo!");
        }
    }
} 