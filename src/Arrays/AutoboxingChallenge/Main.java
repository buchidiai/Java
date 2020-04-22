package Arrays.AutoboxingChallenge;

public class Main {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    public static void main(String[] args) {

        Bank bank = new Bank("boss national Bank");

        bank.addBranch("Dallas");
        bank.addCustomer("Dallas", "Mike", 50.23);
        bank.addCustomer("Dallas", "Tim", 300.56);
        bank.addCustomer("Dallas", "John", 100.43);
        bank.addCustomer("Dallas", "Chris", 10000.56);
        bank.addCustomer("Dallas", "Tommy", 32.32);

        bank.addBranch("Mesquite");
        bank.addCustomer("Mesquite", "Johnny", 200.56);
        bank.addCustomer("Mesquite", "Jim", 3000.23);
        bank.addCustomer("Mesquite", "Kenny", 25.56);
        bank.addCustomer("Mesquite", "Don", 75000.34);
        bank.addCustomer("Mesquite", "Mike", 50.23);
        bank.addCustomer("Mesquite", "Angel", 1000);
        bank.addCustomer("Mesquite", "Lisa", 200.32);

        bank.addCustomertransaction("Dallas", "Mike", 40.34);
        bank.addCustomertransaction("Dallas", "Mike", 9000);
        bank.addCustomertransaction("Dallas", "Mike", 659.98);
        bank.addCustomertransaction("Dallas", "Tim", 5000.34);
        bank.addCustomertransaction("Dallas", "John", 40.34);


        bank.listCustomers("Dallas", true);
        bank.listCustomers("Mesquite", true);
    }
}
