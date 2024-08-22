// Enumeration for account types
enum AccountType {
    CREDIT, SAVINGS, DEPOSIT
}

// BankAccount class to hold account details
class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private AccountType accountType;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance, AccountType accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Getter and setter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
        System.out.println("Account Type: " + accountType);
    }
}

// Main class to test the implementation
public class Bank {
    public static void main(String[] args) {
        // Create instances of BankAccount
        BankAccount creditAccount = new BankAccount("John Doe", "1234567890", 5000.00, AccountType.CREDIT);
        BankAccount savingsAccount = new BankAccount("Jane Smith", "0987654321", 15000.00, AccountType.SAVINGS);
        BankAccount depositAccount = new BankAccount("Alice Brown", "1122334455", 3000.00, AccountType.DEPOSIT);

        // Display account information
        System.out.println("Credit Account Information:");
        creditAccount.displayAccountInfo();
        System.out.println("\nSavings Account Information:");
        savingsAccount.displayAccountInfo();
        System.out.println("\nDeposit Account Information:");
        depositAccount.displayAccountInfo();
    }
}