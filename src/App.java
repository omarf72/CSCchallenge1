import java.util.Scanner;

public class App {
    // Create a cart option
    private static Cart cart = new Cart(10);
    private static BuyOption buy = new BuyOption(); // Define BuyOption instance outside the method
    private static LoginSystem login= new LoginSystem();

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
                handleSellOption(); // Call the method to handle the sell option
                break;
            default:
                break;
        }
        scan.close();
    }

     public static void handleSellOption() {
        Scanner scan = new Scanner(System.in);
        Sell sell=new Sell();

        System.out.println("\nSell Menu:");
        System.out.println("1. See current items for sale");
        System.out.println("2. Add a new item for sale");
        System.out.print("Enter your choice: ");

        int choice = scan.nextInt();
        scan.nextLine(); 

        switch (choice) {
            case 1:
                sell.displayCurrentItems();
                System.out.println("Would you like to go back to the main menu : type 'yes' if you do");
                String answer=scan.next();
                if (answer.equals("yes")) {
                    simulate();
                }
                break;
            case 2:
                sell.addItem();
                System.out.println("Would you like to go back to the main menu : type 'yes' if you do");
                String answer2=scan.next();
                if (answer2.equals("yes")) {
                    simulate();
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                handleSellOption();
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