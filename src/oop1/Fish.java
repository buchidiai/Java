package oop1;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("fish.rest() called");

    }

    private void moveMuscle(){
        System.out.println("fish.moveMuscle() called");

    }
    private void moveBackFin(){
        System.out.println("fish.moveBackFin() called");

    }

    public void swim (int speed){
        System.out.println("fish.swim() called");
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }





}
