package Arrays.AutoboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, ArrayList<Double> transactions) {
        this.customerName = customerName;
        this.transactions = transactions;
    }

    public String getName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
