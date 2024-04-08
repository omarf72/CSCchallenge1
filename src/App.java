import java.util.Scanner;

public class App {
    // Create a cart option
    private static Cart cart = new Cart(10);

    public static void simulate(){
        BuyOption buy = new BuyOption();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option: \n Buy \n Sell \n Cart \n Logout");
        String answerMenu = scan.next();
        System.out.println();

        switch (answerMenu.toLowerCase()) {
            case "buy":
                System.out.println("Items for sale: ");
                buy.displayList();
                System.out.println("Select one of the following options: \n Buy \n Information");
                String answerDecision=scan.next();
                switch (answerDecision.toLowerCase()) {
                    case "information":
                        System.out.println("What would you like to more information about?");
                        buy.displayList();
                        String itemChoiceInfo=scan.next();
                        buy.selectItem(itemChoiceInfo); 
                        break;
                    case "buy":
                        System.out.println("What would you like to buy");
                        buy.displayList();
                        String itemChoiceBuy=scan.next();
                        buy.buyItem(itemChoiceBuy);
                        System.out.println("Would you like to go back to the main menu");
                        String goBackfromBuy=scan.next();
                        switch (goBackfromBuy.toLowerCase()) {
                            case "yes":
                                simulate();
                                break;
                        
                            default:
                                break;
                        }
                    default:
                        break;
                }
            case "logout":
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) throws Exception {
       simulate();   
    }
 }