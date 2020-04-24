package Generics;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        //<> is called diamond and is the acceptable way to declare
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.add(7);
        items.add(8);


        printArray(items);
    }

    private static void printArray(ArrayList<Integer> list) {
        // java does auto boxing for you
        for (int i : list) {
            System.out.println(i * 3);
        }

    }


}
