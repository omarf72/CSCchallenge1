public class BuyOption {

    //cart array
    Item[] cart;
    //items that are for sale array
    Item[] itemList;
    //the number of item for sale
    int size;
    //the number of items in the cart
    int cartSize;

    public BuyOption(){
    // Intializing the 5 items for sale
    Item item1=new Item
    (
        "Couch", 
        " Furniture", 
        "Omar",
        "Fofana",
        "omar.fofana@quinnipiac.edu", 
        100.00
    );
 
    Item item2=new Item
    (
        "Macbook",
        "Technology",
        "Billy",
        "Hill",
        "billy.hill@quinnipiac.edu" , 
        750.00
    );
 
 
    Item item3=new Item
    (
        "Playstation5",
        "Technology",
        "Jared",
        "Allen",
        "jared.allen@quinnipiac.edu",
        500.00
    );
 
 
    Item item4=new Item
    (
        "Notebooks",
        "School supplies ",
        "Jacob",
        "Quake",
        "jacob.quake@quinnipiac.edu ", 
        20.00
    );
 
    Item item5=new Item
    (
        "Microwave",
        "Appliances",
        "Chris",
        "Redfield",
        "chris.redfield",
        70.00
    );

    //putting the item in the array
    itemList= new Item[]{item1,item2,item3,item4,item5};
    //setting the number of items in the array
    size=5;

    cartSize=0;

    cart = new Item[5];
        
    }


    public int getSize(){
        return size;
    }


    //adds items the to cart
    public void buyItem(String choice) {
        boolean found=false;
        for(int index=0;index<size;index++)
        {
            if(choice.equals(itemList[index].getName()))
            {
                found=true;
                if (cartSize<cart.length) {
                    cart[cartSize]=itemList[index];
                    cartSize++;
                    System.out.println(itemList[index].getName()+ " was added to the cart");
                    
                }
                else{
                    System.out.println(" Cart is full. Cannot add more items");
                }
                break;
            }
        }
        if(!found)
        {
            System.out.println(" Item was not found");
        }
    }


    public void selectItem(String choice) {
        for (int index = 0; index < size; index++) {
            if (choice.equals(itemList[index].getName().toLowerCase())) {
                System.out.println(itemList[index].toString());
                break; 
            } else {
                System.out.println("Please choose a valid item");
                break;
            }
        }
    }

    public Item getItem(String itemName) {
        for (Item item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null; // Item not found
    }


   /*  public void buyItem(String choice)
    {

        for(int index=0;index<size;index++)
        {
            if (choice.equals(itemList[index].getName())) {
                
            }
        }
    }*/

    public  void displayList(){

        for(int index=0;index<size;index++)
        {
            System.out.println(" " + itemList[index].getName());
        }
    }


    public void removeItem(String itemName) {
        // Iterate over the items and remove the one with the matching name
        for (int i = 0; i < size; i++) {
            if (itemList[i].getName().equalsIgnoreCase(itemName)) {
                // Shift the remaining items to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    itemList[j] = itemList[j + 1];
                }
                // Decrement the size
                size--;
                break; // Exit the loop after removing the item
            }
        }
    }

    public boolean itemExists(String itemName) {
        for (Item item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true; // Item found
            }
        }
        return false; // Item not found
    }
}
