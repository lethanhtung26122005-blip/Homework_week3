package Homework.Homework_week3.Bai_6;
import java.util.Scanner;
import java.time.LocalDate;

public class Product {
    String id;
    String name;
    double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public double getFinalPrice() {
        return price;
    }
    public String getType() {
        return "";
    }
}
class Electronics extends Product {
    double warrantyCost;

    public Electronics(String id, String name, double price, double warrantyCost) {
        super(id, name, price);
        this.warrantyCost = warrantyCost;
    }
    public double getFinalPrice() {
        return price * 1.1 + warrantyCost;
    }
    public String getType() {
        return "Electronics";
    }
}
class Food extends Product {
    LocalDate expiryDate;
    LocalDate today;
    public Food(String id, String name, double price, LocalDate expiryDate, LocalDate today) {
        super(id, name, price);
        this.expiryDate = expiryDate;
        this.today = today;
    }
    public double getFinalPrice() {
        if (expiryDate.isBefore(today.plusDays(7))) {
            return price * 0.8;
        }
        return price;
    }
    public String getType() {
        return "Food";
    }
}
class Order {
    Product[] list;
    public Order(Product[] list) {
        this.list = list;
    }
    public double getTotal() {
        double sum = 0;
        for (Product p : list) {
            sum = sum + p.getFinalPrice();
        }
        return sum;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.of(2025, 3, 1);
        int n = sc.nextInt();
        sc.nextLine();
        Product[] arr = new Product[n];
        for (int i = 0; i < n; i++) {
            char type = sc.next().charAt(0);
            String name = sc.findInLine("\"[^\"]*\"");
            name = name.substring(1, name.length() - 1);
            double price = sc.nextDouble();

            if (type == 'E') {
                double warranty = sc.nextDouble();
                arr[i] = new Electronics(String.valueOf(i + 1), name, price, warranty);
            } else {
                LocalDate expiry = LocalDate.parse(sc.next());
                arr[i] = new Food(String.valueOf(i + 1), name, price, expiry, today);
            }
            sc.nextLine();
        }

        Order order = new Order(arr);
        for (Product p : arr) {
            System.out.println(p.name + " - " + p.getType() + " - " + p.getFinalPrice());
        }
        System.out.println("Total = " + order.getTotal());
    }
}