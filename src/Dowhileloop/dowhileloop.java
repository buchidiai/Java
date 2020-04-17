package Dowhileloop;

public class dowhileloop {
    public static void main(String[] args) {
        int count = 1;
        while (count != 9) {

            System.out.println(count + " while");
            count++;


        }

        count = 1;
        do {
            System.out.println(count + " do while");
            count++;
        } while (count != 20);

        int number = 4;
        int finishNumber = 50;
        int numberOfEvens = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            numberOfEvens++;
            System.out.println("even number " + number);

            if (numberOfEvens == 20) break;

        }
        System.out.println("Number of even numbers " + numberOfEvens);


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
