package Polymorphism;

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
