import java.util.Scanner;

public class LoginSystem {
    
    public void Login(){
        // Prompt the user to enter their Quinnipiac email and password
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quinnipiac University login system.");
        System.out.print("Enter your Quinnipiac email: ");
        String email = scanner.nextLine().trim(); // Trim to remove leading and trailing spaces
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Construct the email based on the provided information
        String constructedEmail = email;

        // Display login status
        System.out.println("Your email is: " + constructedEmail);
        System.out.println("Your password is: " + password);
        System.out.println("You are now logged in.");
    }
}
