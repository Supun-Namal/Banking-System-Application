import java.util.ArrayList;

// This class handles all bank account operations
public class BankAccount {
    // Account details
    public int accountNumber;
    public double balance;
    public Customer customer;
    public ArrayList<Transaction> transactions; // List to store all transactions
    
    // This number helps create unique account numbers
    public static int nextAccountNumber = 5001;
    
    // Constructor - runs when we create a new account
    public BankAccount(Customer accountCustomer, double startingBalance) {
        this.customer = accountCustomer;
        this.balance = startingBalance;
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++; // Increase for next account
        this.transactions = new ArrayList<>();
        
        // Add first transaction for opening balance
        if (startingBalance > 0) {
            Transaction firstTransaction = new Transaction("Opening Deposit", startingBalance, balance);
            transactions.add(firstTransaction);
        }
    }
    
    // Method to add money to account
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            Transaction newTransaction = new Transaction("Deposit", amount, balance);
            transactions.add(newTransaction);
            System.out.println("Deposit successful! New balance: Rs." + balance);
        } else {
            System.out.println("Please enter a positive amount.");
        }
    }
    
    // Method to take money from account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            Transaction newTransaction = new Transaction("Withdraw", amount, balance);
            transactions.add(newTransaction);
            System.out.println("Withdrawal successful! New balance: Rs." + balance);
        } else if (amount > balance) {
            System.out.println("Not enough money in account. Your balance is: Rs." + balance);
        } else {
            System.out.println("Please enter a positive amount.");
        }
    }
    
    // Method to show current balance
    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + customer.name);
        System.out.println("Current Balance: Rs." + balance);
    }
    
    // Method to show all transactions
    public void showAllTransactions() {
        System.out.println("\n--- Transaction History ---");
        System.out.println("Account: " + accountNumber + " | Customer: " + customer.name);
        System.out.println("Current Balance: Rs." + balance);
        System.out.println("---------------------------");
        
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.print((i + 1) + ". ");
                transactions.get(i).showTransaction();
            }
        }
        System.out.println("---------------------------");
    }
}