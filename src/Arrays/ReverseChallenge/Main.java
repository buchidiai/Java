package Arrays.ReverseChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {34, 1, 24, 53, 6, 3, 7};

        reverse(myArray);

    }

    public static void reverse(int[] array) {
        // key - reverse up until half way through the array because by then it would have been swaped out/ reversed all numbers
        System.out.println("array before reverse: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            //array[array.length - i - 1] -> element from the other side of array

            int temp = array[i]; // store element index

            array[i] = array[array.length - i - 1]; //1st element = last element


            array[array.length - i - 1] = temp; //last element = 1st element

        }

        System.out.println("array after reverse: " + Arrays.toString(array));


    }

}
