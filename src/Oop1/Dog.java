package Oop1;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super comes from inheritance of Animal as it extends to dog aka it gets all the properties of Animal
        //we set brain and body static so it wont have to eveytime
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public Dog(String yorkie) {
        super();
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //override method from animal class and make unique for dog class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();

    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        super.move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.movelegs() called");

    }

    //overrides animal class method of move
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
