import java.util.Scanner;

// This class handles the menu and user input
public class BankMenu {
    public Scanner input;
    public BankAccount userAccount;
    
    // Constructor
    public BankMenu() {
        input = new Scanner(System.in);
    }
    
    // Method to create a new account
    public void createNewAccount() {
        System.out.println("\n=== Create New Account ===");
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your phone number: ");
        String phone = input.nextLine();
        
        System.out.print("Enter starting balance: Rs.");
        double startBalance = input.nextDouble();
        input.nextLine(); // Clear the input buffer
        
        // Create customer and account
        Customer newCustomer = new Customer(name, phone);
        userAccount = new BankAccount(newCustomer, startBalance);
        
        System.out.println("\nAccount created successfully!");
        System.out.println("Your account number is: " + userAccount.accountNumber);
    }
    
    // Method to show the main menu
    public void showMenu() {
        System.out.println("\n=== Banking System Menu ===");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Transactions");
        System.out.println("5. Exit");
        System.out.print("Choose an option (1-5): ");
    }
    
    // Method to get user's menu choice
    public int getUserChoice() {
        int choice = input.nextInt();
        input.nextLine(); // Clear the input buffer
        return choice;
    }
    
    // Method to handle deposit
    public void handleDeposit() {
        System.out.print("Enter amount to deposit: Rs.");
        double amount = input.nextDouble();
        input.nextLine(); // Clear the input buffer
        userAccount.deposit(amount);
    }
    
    // Method to handle withdrawal
    public void handleWithdraw() {
        System.out.print("Enter amount to withdraw: Rs.");
        double amount = input.nextDouble();
        input.nextLine(); // Clear the input buffer
        userAccount.withdraw(amount);
    }
    
    // Method to show welcome message
    public void showWelcome() {
        System.out.println("********************************");
        System.out.println("*    Welcome to ABCD Bank      *");
        System.out.println("*      E- Banking System       *");
        System.out.println("********************************");
    }
    
    // Method to show goodbye message
    public void showGoodbye() {
        System.out.println("\n********************************");
        System.out.println("*   Thank you for banking      *");
        System.out.println("*        with ABCD Bank!              *");
        System.out.println("*      Have a great day!       *");
        System.out.println("********************************");
    }
    
    // Method to close scanner
    public void closeInput() {
        input.close();
    }
}