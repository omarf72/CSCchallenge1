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
            System.out.println("\n" + item.getName() + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // display items in the cart
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i].getName() + " - $" + items[i].getPrice());
            }
            System.out.println("\nTotal - $" + getTotalPrice());
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

    // return the total number of items in cart
    public int getItemCount() {
        return itemCount;
    }

    // checks to see if an item is already in the cart
    public boolean containsItem(Item itemToCheck) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(itemToCheck)) {
                return true; // Item found in the cart
            }
        }
        return false; // Item not found in the cart
    }

    // return all the items in the cart
    public Item[] getItems() {
        Item[] cartItems = new Item[itemCount];
        System.arraycopy(items, 0, cartItems, 0, itemCount);
        return cartItems;
    }
    
}