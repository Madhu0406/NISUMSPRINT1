import java.util.*;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " | Price: ₹" + price + " | Quantity: " + quantity;
    }
}

public class Sc21 {
    static ArrayList<Item> cart = new ArrayList<>();

    static void addItem(Scanner sc) {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // consume newline
        cart.add(new Item(name, price, quantity));
        System.out.println(name + " added to cart.\n");
    }

    static void removeItem(Scanner sc) {
        System.out.print("Enter item name to remove: ");
        String name = sc.nextLine();
        boolean removed = cart.removeIf(item -> item.name.equalsIgnoreCase(name));
        if (removed) {
            System.out.println(name + " removed from cart.\n");
        } else {
            System.out.println(name + " not found in cart.\n");
        }
    }

    static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.\n");
            return;
        }
        System.out.println("Your Cart:");
        for (Item item : cart) {
            System.out.println(item);
        }
        System.out.println();
    }

    static void calculateTotal() {
        double total = 0;
        for (Item item : cart) {
            total += item.price * item.quantity;
        }
        System.out.println("Total Price: ₹" + total + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add Item\n2. Remove Item\n3. View Cart\n4. Calculate Total\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addItem(sc); break;
                case 2: removeItem(sc); break;
                case 3: viewCart(); break;
                case 4: calculateTotal(); break;
                case 5: 
                    System.out.println("Thanks for shopping!");
                    sc.close();
                    return;
                default: 
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}
