package Readinguserinput;

import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersEntered = 1;
        int numberSum = 0;
        do {
            System.out.println("Enter number " + "#" + numbersEntered + ":");
            boolean hasNetInt = scanner.hasNextInt();

            if (hasNetInt) {
                int number = scanner.nextInt();// handle next line character
                scanner.nextLine();
                numberSum += number;
                numbersEntered++;


            } else {
                System.out.println("Unable to parse number entered");
            }

        } while (numbersEntered < 11);

        System.out.println("the sum of numbers entered is " + numberSum);


        scanner.close();


    }
}
