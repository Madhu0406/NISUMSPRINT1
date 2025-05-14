import java.util.*;

class MenuItem {
    String name, description;
    double price;

    MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return name + " - " + description + " (₹" + price + ")";
    }
}

public class Sm28 {
    static LinkedHashMap<String, HashMap<String, MenuItem>> menu = new LinkedHashMap<>();

    static void addItem(String category, String name, String desc, double price) {
        menu.putIfAbsent(category, new HashMap<>());
        menu.get(category).put(name, new MenuItem(name, desc, price));
        System.out.println(name + " added to " + category);
    }


    static void removeItem(String category, String name) {
        if (menu.containsKey(category)) {
            menu.get(category).remove(name);
            System.out.println(name + " removed from " + category);
        }
    }


    static void updateItem(String category, String name, String newDesc, double newPrice) {
        if (menu.containsKey(category) && menu.get(category).containsKey(name)) {
            menu.get(category).put(name, new MenuItem(name, newDesc, newPrice));
            System.out.println(name + " updated in " + category);
        }
    }


    static void displayMenu() {
        for (String category : menu.keySet()) {
            System.out.println("\n== " + category + " ==");
            for (MenuItem item : menu.get(category).values()) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        addItem("Appetizer", "Spring Rolls", "Crispy rolls with veggies", 120);
        addItem("Main Course", "Paneer Butter Masala", "Spicy paneer curry", 250);
        addItem("Dessert", "Gulab Jamun", "Sweet syrupy balls", 90);

        updateItem("Main Course", "Paneer Butter Masala", "Creamy paneer curry", 270);
        removeItem("Dessert", "Gulab Jamun");

        displayMenu();
    }
}
