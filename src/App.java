import java.util.Scanner;

public class App {
    // Create a cart option
    private static Cart cart = new Cart(10);
    private static BuyOption buy = new BuyOption(); // Define BuyOption instance outside the method
    private static LoginSystem login=new LoginSystem();

    public static void simulate() {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nChoose an option: \n Buy \n Sell \n Cart \n Logout");
        String answerMenu = scan.next();

        switch (answerMenu.toLowerCase()) {
            case "buy":
                handleBuyOption(); // Call the method to handle the buy option
                break;
            case "cart":
                System.out.println("Here are the items in your cart: ");
                cart.displayCart();
                if (cart.getItemCount() == 0) {
                    System.out.println("Returning to Main Menu\n");
                    simulate();
                    break;
                } else {
                    System.out.println("\nChoose an option: \n To go to checkout, enter: Checkout \n To return to main menu, enter: Menu");
                    String goBackfromCart = scan.next();
                    try {
                        switch (goBackfromCart.toLowerCase()) {
                            case "menu":
                                simulate();
                                scan.close();    
                                return;
                            case "checkout":
                                cart.clearCart();
                                simulate();
                            default:
                                scan.close();    
                                return;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            scan.close();
                            return;
                        }
                }
                
            case "logout":
                scan.close();    
                return;
            case "sell":
                scan.close();    
                return;
            default:
                scan.close();    
                return;
        }
        scan.close();
    }
    public static void handleBuyOption() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSelect one of the following options: \n Buy \n Information");
        String answerDecision = scan.next();
        switch (answerDecision.toLowerCase()) {
            case "buy":
                System.out.println("\nWhat would you like to buy?");
                buy.displayList();
                String itemChoiceBuy = scan.next();
                if (cart.containsItem(buy.getItem(itemChoiceBuy))) {
                    System.out.println("\nItem is already in cart");
                } else {
                    try {
                        cart.addItem(buy.getItem(itemChoiceBuy));
                        buy.removeItem(itemChoiceBuy);
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        scan.close();
                        return;
                    }
                }
                System.out.println("\nSelect one of the following options: \n To Add Additional Items, enter: Add \n To go to Main Menu, enter: Menu");
                String goBackfromBuy = scan.next();
                switch (goBackfromBuy.toLowerCase()) {
                    case "add":
                        handleBuyOption();
                    case "menu":
                        simulate();
                        scan.close();    
                        return;
                    default:
                        scan.close();    
                        return;
                }
            case "information":
                System.out.println("\nWhat would you like more information about?");
                buy.displayList();
                String itemChoiceInfo = scan.next();
                if (buy.itemExists(itemChoiceInfo)) {
                    try {
                        buy.selectItem(itemChoiceInfo);
                        System.out.println("\nWould you like to go back to the main menu?");
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
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        scan.close();
                        return;   
                    }
                }
                
            default:
                scan.close();    
                return;
        }
    }

    public static void handleCheckoutOption() {

    }

    public static void main(String[] args) throws Exception {
        String art = "   __ __    ___  _      _       ___           __    __    ___  _        __   ___   ___ ___    ___      ______   ___       ______  __ __    ___       ___   __ __      ___ ___   ____  ____   __  _    ___ ______ \n" +
        "  |  |  |  /  _]| |    | |     /   \\         |  |__|  |  /  _]| |      /  ] /   \\ |   |   |  /  _]    |      | /   \\     |      ||  |  |  /  _]     /   \\ |  |  |    |   |   | /    ||    \\ |  |/ ]  /  _]      |\n" +
        "  |  |  | /  [_ | |    | |    |     |        |  |  |  | /  [_ | |     /  / |     || _   _ | /  [_     |      ||     |    |      ||  |  | /  [_     |     ||  |  |    | _   _ ||  o  ||  D  )|  ' /  /  [_|      |\n" +
        "  |  _  ||    _]| |___ | |___ |  O  |        |  |  |  ||    _]| |___ /  /  |  O  ||  \\_/  ||    _]    |_|  |_||  O  |    |_|  |_||  _  ||    _]    |  Q  ||  |  |    |  \\_/  ||     ||    / |    \\ |    _]_|  |_|\n" +
        "  |  |  ||   [_ |     ||     ||     | __     |  `  '  ||   [_ |     /   \\_ |     ||   |   ||   [_       |  |  |     |      |  |  |  |  ||   [_     |     ||  :  |    |   |   ||  _  ||    \\ |     \\|   [_  |  |  \n" +
        "  |  |  ||     ||     ||     ||     ||  |     \\      / |     ||     \\     ||     ||   |   ||     |      |  |  |     |      |  |  |  |  ||     |    |     ||     |    |   |   ||  |  ||  .  \\|  .  ||     | |  |  \n" +
        "  |__|__||_____||_____||_____| \\___/ |_ |      \\_/\\_/  |_____||_____|\\____| \\___/ |___|___||_____|      |__|   \\___/       |__|  |__|__||_____|     \\__,_| \\__,_|    |___|___||__|__||__|\\_||__|\\_||_____| |__|  \n" +
        "                                        \\|                                                                                                                                                                          \n" +
        "                                                                                                                                                                                                                       \n" +
        "                                                                                                                                                                                                                       \n" +
        "                                                                                                                                                                                                                       \n" +
        "                                                                                                                                                                                                                       \n" +
        "                                                                                                                                                                                                                       \n" +
        "                                                                                                                                                                                                                       \n" +
        "                                                                                                                                                                                                                       \n";

        System.out.println(art);
        login.Login();
        simulate();
    }
}