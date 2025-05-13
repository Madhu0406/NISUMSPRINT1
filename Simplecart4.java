import java.util.Scanner;

class Cart {
    String itemName;
    double itemValue;
    int itemId;

    Cart(String name, double value, int id) {
        itemName = name;
        itemValue = value;
        itemId = id;
    }

    void display() {
        System.out.println("ID: " + itemId + ", Name: " + itemName + ", Price: ₹" + itemValue);
    }
}

public class Simplecart4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Cart[] cart = new Cart[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            // Simple validation
            if (name.isEmpty() || price <= 0 || id <= 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }

            cart[i] = new Cart(name, price, id);
            total += price;
        }

        System.out.println("\n Order Summary");
        for (int i = 0; i < n; i++) {
            cart[i].display();
        }

        System.out.println("Total Items: " + n);
        System.out.println("Order Total: ₹" + total);
    }
}
