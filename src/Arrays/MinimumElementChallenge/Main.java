package Arrays.MinimumElementChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrays = readIntegers(5);
        int min = findMin(arrays);
        System.out.println(" Minimum number is " + min);


    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values.\r");
        int[] enteredNumbers = new int[count];
        for (int i = 0; i < enteredNumbers.length; i++) {
            enteredNumbers[i] = scanner.nextInt();
        }
        return enteredNumbers;
    }

    public static int findMin(int[] array) {
        //get first index in array passed in
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            //check if first item in array < static min value
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
