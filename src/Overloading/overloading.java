package Overloading;

public class overloading {

    public static void main(String[] args) {

        double result = calcFeetAndInchesToCentimeters(10, 12);
        System.out.println(result);
        if(result < 0.0){
            System.out.println("error occured");

        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (!(feet >= 0)) {
            System.out.println("Invliad feet");
            return -1;
        }
        if (!(inches >= 0) || (inches >= 13)) {
            System.out.println("Invliad inches");
            return -1;
        }

        double feetConversion = feet * 30.48D;
        double inchConversion = inches * 2.54D;
        double result = feetConversion + inchConversion;

        return result;
    }

    public static double calcFeetAndInchesToCentimeters( double inches) {
        if (!(inches >= 0)) {
            return -1;
        }

        double feetInInches = inches * 0.0833333D;

        double result =  calcFeetAndInchesToCentimeters(feetInInches, inches);
        return result;
    }
}
