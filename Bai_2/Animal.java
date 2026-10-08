package Homework.Homework_week3.Bai_2;

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
        Animal zoo[] = new Animal[4];
        zoo[0] = new Dog();
        zoo[1] = new Cat();
        zoo[2] = new Duck();
        zoo[3] = new Dog();
        for(int i=0; i<4; i++) {
            zoo[i].makeSound();
        }
    }
}
