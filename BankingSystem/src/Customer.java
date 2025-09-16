// This class stores customer information
public class Customer {
    // Customer details
    public String name;
    public String phone;
    public int customerId;
    
    // This number helps create unique customer IDs
    public static int nextId = 1001;
    
    // Constructor - runs when we create a new customer
    public Customer(String customerName, String customerPhone) {
        this.name = customerName;
        this.phone = customerPhone;
        this.customerId = nextId;
        nextId++; // Increase for next customer
    }
    
    // Method to display customer info
    public void showCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}