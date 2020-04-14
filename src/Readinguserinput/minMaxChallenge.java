package Readinguserinput;

import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;

        while (true) {
            System.out.println("Enter a number:");
            boolean hasNetInt = scanner.hasNextInt();
            int number = scanner.nextInt();// handle next line character
            scanner.nextLine();

            if (hasNetInt) {
                if (enteredNumber == 0) {
                    System.out.println("minimum number is: " + number);
                    System.out.println("maximum number is: " + number);
                    enteredNumber = number;
                    continue;
                } else {
                    if(enteredNumber == number){
                        System.out.println(number +" is the same as  "  + enteredNumber);
                        continue;
                    } else {
                        if (enteredNumber > number) {
                            System.out.println("minimum number is: " + number);
                            System.out.println("maximum number is: " + enteredNumber);

                        } else {
                            System.out.println("minimum number is: " + enteredNumber);
                            System.out.println("maximum number is: " + number);
                        }

                        continue;

                    }

                }


            } else {
                System.out.println("Unable to parse number entered");
                break;
            }




    }
        scanner.close();

}
}
