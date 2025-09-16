
import java.io.IOException;

// Main class - this is where the program starts
public class SimpleBankingSystem {
    
    public static void main(String[] args) {
        // Create menu object
        BankMenu menu = new BankMenu();
        
        // Show welcome message
        menu.showWelcome();
        
        // Create account first
        menu.createNewAccount();
        
        // Main program loop
        boolean keepRunning = true;
        
        while (keepRunning) {
            // Show menu options
            menu.showMenu();
            
            // Get user choice
            int userChoice = menu.getUserChoice();
            
            // Do different things based on user choice
            switch (userChoice) {
                case 1:
                    // Show balance
                    menu.userAccount.showBalance();
                    break;
                case 2:
                    // Deposit money
                    menu.handleDeposit();
                    break;
                case 3:
                    // Withdraw money
                    menu.handleWithdraw();
                    break;
                case 4:
                    // Show all transactions
                    menu.userAccount.showAllTransactions();
                    break;
                case 5:
                    // Exit program
                    keepRunning = false;
                    menu.showGoodbye();
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please choose 1-5.");
                    break;
            }
            
            // Pause before showing menu again
            if (keepRunning) {
                System.out.println("\nPress Enter to continue...");
                try {
                    System.in.read();
                } catch (IOException e) {
                    // Do nothing
                }
            }
        }
        
        // Close the input scanner
        menu.closeInput();
    }
}