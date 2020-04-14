package oop1;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //setters

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //getters

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void depositFunds(int amount) {
        this.setBalance(amount);

        System.out.println("You desposited $" + amount + " into account ending in " + this.getAccountNumber() % 100000);
    }

    public void withdrawFunds(int amount) {

        if (amount <= 0) {
            System.out.println("cannot withdraw negative amount");
        } else {
            if (this.getBalance() - amount < 0) {
                System.out.println("Insuffient funds current balance is $" + this.getBalance());
            } else {
                this.setBalance(this.balance -= amount);
                System.out.println("Withdrew $" + amount + ", Current balance is $" + this.getBalance());
            }
        }


    }

}
