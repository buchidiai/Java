package forloop;

public class forloop {
    private static final double amount1 = 50000;
    private static final double amount2 = 5490000;


    public static void main(String[] args) {
        System.out.println(calculateInterest(50000, 3.5));

        //used forloop to call calculateInterest with an ammount and incremented interest rate

        for (int i = 1; i < 5; i++) {

            System.out.println(amount1 + " at " + i + "% interest =" + String.format("%.2f", calculateInterest(amount1, i)));
        }


        //used forloop to call calculateInterest with an ammount and decremented interest rate
        for (int i = 5; i > 0; i--) {

            System.out.println(amount2 + " at " + i + "% interest =" + String.format("%.2f", calculateInterest(amount2, i)));
        }

        //found prime number and exited after count reached 3
        int count = 0;
        for (int i = 1; 1 < 100; i++) {


            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime member");
                if (count == 100) {
                    System.out.println("Loop has exited");
                    break;

                }

            }

        }


    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static double calculateInterest(double amount, double interestRate) {

        return amount * (interestRate / 2);

    }
}
