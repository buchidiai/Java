package Readinguserinput;

import java.util.Scanner;

public class ReadUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current age:  ");

        boolean hasNetInt = scanner.hasNextInt();

        if(hasNetInt){
            int age = scanner.nextInt();// handle next line character
            scanner.nextLine();


            System.out.println("Enter your name:  ");
            String name = scanner.nextLine();// handle next line character
            if(age < 0){
                System.out.println("You can not have a negative age");
            } else {
                System.out.println("Your name is " + name + " and you are " + age+ " years old");
            }


        } else{
            System.out.println("Unable to parse year of birth.");
        }


        scanner.close();
    }

}
