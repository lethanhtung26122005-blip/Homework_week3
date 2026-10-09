package Homework.Homework_week3.Bai_7;
import java.util.Scanner;

public class Room {
    int nights;
    public Room(int nights) {
        this.nights = nights;
    }
    public double getTotal() {
        return 0;
    }
}
class StandardRoom extends Room {
    public StandardRoom(int nights) {
        super(nights);
    }
    public double getTotal() {
        double total = 500000 * nights;
        if (nights > 3) {
            total = total * 0.95;
        }
        return total;
    }
}
class VIPRoom extends Room {
    public VIPRoom(int nights) {
        super(nights);
    }
    public double getTotal() {
        return 2000000 * nights;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char type = sc.next().charAt(0);
        int nights = sc.nextInt();
        Room room;
        if (type == 'S') {
            room = new StandardRoom(nights);
        } else {
            room = new VIPRoom(nights);
        }
        System.out.println(room.getTotal());
    }
}