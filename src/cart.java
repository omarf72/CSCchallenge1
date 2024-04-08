public class Cart {
    private Item[] items; // Array to hold items in the cart
    private int itemCount; // Number of items in the cart

    // initialize the cart
    public Cart(int capacity) {
        items = new Item[capacity]; // Initialize the array with the specified capacity
        itemCount = 0; // Initially, there are no items in the cart
    }

    // add an item to the cart
    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item; // Add the item to the next available slot in the array
            itemCount++; // Increment the item count
            System.out.println(item.getName() + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // display items in the cart
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i].getName() + " - $" + items[i].getPrice());
            }
        }
    }

    // calculate the total price of items in the cart
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }

    // clear the whole cart
    public void clearCart() {
        items = new Item[items.length]; // Create a new empty array
        itemCount = 0; // Reset the item count
        System.out.println("Cart cleared.");
    }
}
