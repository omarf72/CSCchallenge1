import java.util.ArrayList;
import java.util.Scanner;

public class Sell {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Item> itemsForSale = new ArrayList<>();

    public static void main(String[] args) {
        Sell sell = new Sell();
        sell.run();
    }

    public void run() {
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    displayCurrentItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("\nSell Menu:");
        System.out.println("1. See current items for sale");
        System.out.println("2. Add a new item for sale");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
    }

    private void displayCurrentItems() {
        if (itemsForSale.isEmpty()) {
            System.out.println("No items currently for sale.");
        } else {
            System.out.println("\nCurrent Items for Sale:");
            System.out.println("Name\t\tCategory\tPrice");
            for (Item item : itemsForSale) {
                System.out.println(item.getName() + "\t\t" + item.getCategory() + "\t\t$" + item.getPrice());
            }
        }
        // Option to go back to main menu
        System.out.println("\nPress Enter to go back to the main menu...");
        scanner.nextLine(); 
    }

    private void addItem() {
        System.out.println("\nAdd a New Item for Sale:");
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item category: ");
        String category = scanner.nextLine();
        System.out.print("Enter item price: $");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        itemsForSale.add(new Item(name, category, price));
        System.out.println("Item added successfully!");

       
        System.out.println("\nPress Enter to go back to the main menu...");
        scanner.nextLine(); 
    }
}

class Item {
    private String name;
    private String category;
    private double price;

    public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

