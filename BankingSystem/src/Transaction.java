// This class stores information about each transaction
public class Transaction {
    // Transaction details
    public String type;        // "Deposit" or "Withdraw"
    public double amount;      // How much money
    public String date;        // When it happened
    public double newBalance;  // Balance after transaction
    
    // Constructor - runs when we create a new transaction
    public Transaction(String transactionType, double transactionAmount, double balance) {
        this.type = transactionType;
        this.amount = transactionAmount;
        this.newBalance = balance;
        this.date = java.time.LocalDateTime.now().toString(); // Current date and time
    }
    
    // Method to display transaction info
    public void showTransaction() {
        System.out.println(amount + " | Balance: Rs." + type + ": Rs." + newBalance + " | Date: " + date);
    }
}