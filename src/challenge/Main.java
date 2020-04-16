package challenge;

import polymorphism.*;

class Acura extends Car {

    public Acura() {
        super("Acura Tl", 6);
    }

    @Override
    public String startEngine() {
        return "push to start activated";
    }

    @Override
    public String accelerate() {
        return "accelerated like never before";
    }

    @Override
    public String brake() {
        return "slowing down";
    }
}

class Lexus extends Car {

    public Lexus() {
        super("Lexus GS", 6);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return  super.accelerate();
    }

    @Override
    public String brake() {
        return   super.brake();
    }
}


class BMW extends Car {

    public BMW() {
        super("BMW 750i", 4);
    }

    @Override
    public String startEngine() {
       return "verom verom started up";
    }



    @Override
    public String brake() {
       return super.brake();
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + "" + car.getName());
            System.out.println(car.getName() + " has " + car.startEngine());
            System.out.println(car.getName() + " is " + car.accelerate());
            System.out.println(car.getName() + " is rapidly " + car.brake());
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Acura();
            case 2:
                return new BMW();
            case 3:
                return new Lexus();

        }

        return null;
    }

}
