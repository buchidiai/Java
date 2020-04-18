package Arrays.ArrayChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        sortIntegers(myIntegers);

//        printIntegers(sortedIntegers);
    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] printIntegers(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Printed arrays are " +number[i]);
        }
        return number;
    }

    public static void sortIntegers(int[] numbers) {
        int[] sortedArray = new int[numbers.length];
        int temp;
        boolean flag = true;

        while (flag){
            flag = false;
            for (int i = 0; i < numbers.length -1; i++) {
                if (numbers[i] < numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    flag = true;
                }
            };

        }

        printIntegers(numbers);


    }
}
