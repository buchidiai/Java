package Polymorphism;

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
