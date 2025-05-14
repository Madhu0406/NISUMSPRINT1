import java.util.HashMap;

public class ProductInventory {
    
    static HashMap<String, Integer> inventory = new HashMap<>();

   
    static void addProduct(String name, int quantity) {
        int current = inventory.getOrDefault(name, 0);
        inventory.put(name, current + quantity);
        System.out.println("Added " + quantity + " of " + name);
    }


    static void updateProduct(String name, int quantity) {
        if (inventory.containsKey(name)) {
            inventory.put(name, inventory.get(name) + quantity);
            System.out.println("Updated " + name + " by " + quantity);
        } else {
            System.out.println(name + " not found in inventory.");
        }
    }

   
    static void removeProduct(String name) {
        if (inventory.containsKey(name)) {
            inventory.remove(name);
            System.out.println(name + " removed from inventory.");
        } else {
            System.out.println(name + " doesn't exist.");
        }
    }


    static void checkStock(String name) {
        if (inventory.containsKey(name)) {
            System.out.println(name + " is in stock: " + inventory.get(name));
        } else {
            System.out.println(name + " is out of stock.");
        }
    }


    public static void main(String[] args) {
        addProduct("Pen", 10);
        addProduct("Notebook", 5);
        checkStock("Pen");

        updateProduct("Pen", 5);
        checkStock("Pen");

        removeProduct("Notebook");
        checkStock("Notebook");
    }
}
