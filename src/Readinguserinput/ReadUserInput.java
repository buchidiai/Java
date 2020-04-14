package Readinguserinput;

import java.util.Scanner;

public class ReadUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:  ");
        String name = scanner.nextLine();// handle next line character

        System.out.println("Enter your current weight:  ");
        int weight = scanner.nextInt();// handle next line character


        System.out.println("Your name is " + name + " and you weigh " + weight+ "LB");

        scanner.close();
    }

}
