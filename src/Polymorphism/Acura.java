package Polymorphism;

public class Acura extends Car {

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
