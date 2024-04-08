import java.util.Scanner;

public class App {

    public static void simulate(){
        BuyOption buy= new BuyOption();
        Scanner scan= new Scanner(System.in);

        System.out.println(" Choose an option:Buy,Sell,Cart,Logout : type Buy,Sell Cart or Logout");

        String answer=scan.next();

       System.out.println();

        switch (answer) {
            case "Buy":
                System.out.println(" Items for sale: ");
                System.out.println();
                buy.displayList();
                System.out.println("Do you what to see additional information of one of the items or buy an item : Type 'information' or 'buy' ");
                String decision=scan.next();
                if(decision.equals("information"))
                {
                    String itemChoice=scan.next();
                    buy.selectItem(itemChoice);
                }
                if(decision.equals("buy"))
                {
                    System.out.println(" What would you like to buy");
                    String choice=scan.next();
                    buy.buyItem(choice);
                    System.out.println("Would you like to go back to the main menu");
                    String answer2=scan.next();
                    if(answer2.equals("yes"))
                    {
                        simulate();
                    }
                   
                }
               
                
                break;

            case "Logout":

            

            default:
                break;
        }

    }
    public static void main(String[] args) throws Exception {

       simulate();

        
    }

 }
