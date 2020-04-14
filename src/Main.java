import oop1.BankAccount;
import oop1.Car;

public class Main {

    public static void main(String[] args) {
        Car benz = new Car();
        benz.setModel("s500");
        System.out.println("The benz model is "+benz.getModel());

        BankAccount customer1 = new BankAccount();
        customer1.setAccountNumber(1232435454);
        customer1.setCustomerName("Mike jones");
        customer1.setEmail("mikejones@gmail.com");
        customer1.setPhoneNumber("123 456-7890");
        customer1.depositFunds(5000);
        customer1.withdrawFunds(340);

    }
}
