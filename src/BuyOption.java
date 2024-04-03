



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
    Item item1=new Item("Couch", " Furniture", 
     "omar.fofana@quinnipiac.edu", 100.00);
 
    Item item2=new Item("Macbook","Technology",
     "billy.hill@quinnipiac.edu" , 750.00);
 
 
    Item item3=new Item("Playstation5","Technology",
     "jared.allen@quinnipiac.edu",500.00);
 
 
    Item item4=new Item("Notebooks","School supplies ",
      "jacob.quake@quinnipiac.edu ", 20.00);
 
    Item item5=new Item("Microwave","Appliances","chris.redfield",70.00);

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
            if (choice.equals(itemList[index].getName())) {
                System.out.println(itemList[index].toString());
                break; 
            }
        }
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
            System.out.println(itemList[index].getName());
            System.out.println();
        }
    }

}
