import java.util.Scanner;

public class App {
    // Create a cart option
    private static Cart cart = new Cart(10);
    private static BuyOption buy = new BuyOption(); // Define BuyOption instance outside the method

    public static void simulate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option: \n Buy \n Sell \n Cart \n Logout");
        String answerMenu = scan.next();
        System.out.println();

        switch (answerMenu.toLowerCase()) {
            case "buy":
                handleBuyOption(); // Call the method to handle the buy option
                break;
            case "cart":
                System.out.println("Here are the items in your cart: ");
                cart.displayCart();
                System.out.println("Would you like to go back to the main menu?");
                String goBackfromCart = scan.next();
                switch (goBackfromCart.toLowerCase()) {
                    case "yes":
                        simulate();
                        break;
                    case "no":
                        scan.close();    
                        return;
                    default:
                        scan.close();    
                        return;
                }
                break;
            case "logout":
                break;
            case "sell":
                break;
            default:
                break;
        }
        scan.close();
    }

    public static void handleBuyOption() {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Items for sale: ");
        //buy.displayList();
        System.out.println("Select one of the following options: \n Buy \n Information");
        String answerDecision = scan.next();
        switch (answerDecision.toLowerCase()) {
            case "buy":
                System.out.println("What would you like to buy?");
                buy.displayList();
                String itemChoiceBuy = scan.next();
                cart.addItem(buy.getItem(itemChoiceBuy));
                System.out.println("Select one of the following options: \n To Add More Items, enter: Add \n To go to Main Menu, enter: Menu");
                String goBackfromBuy = scan.next();
                switch (goBackfromBuy.toLowerCase()) {
                    case "add":
                        handleBuyOption();
                    case "menu":
                        simulate();
                        break;
                    default:
                        break;
                }
                break; 
            case "information":
                System.out.println("What would you like more information about?");
                buy.displayList();
                String itemChoiceInfo = scan.next();
                buy.selectItem(itemChoiceInfo);
                System.out.println("Would you like to go back to the main menu?");
                String goBackfromInfo = scan.next();
                switch (goBackfromInfo.toLowerCase()) {
                    case "yes":
                        simulate();
                    case "no":
                        scan.close();    
                        return;
                    default:
                        scan.close();    
                        return;
                }
                
            default:
                break;
        }
        scan.close();
    }

    public static void main(String[] args) throws Exception {
        simulate();
    }
}
