package Oop2;

//composition is used due to the fact that you can only extend to one class in java
public class Main {

    public static void main(String[] args) {
        //composition eg 1

        //Dimensions instance
        Dimensions dimensions = new Dimensions(20, 20, 5);
        //Case instance
        Case theCase = new Case("2208", "Dell", "240", dimensions);
        //Monitor instance
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        //Motherboard instance
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        //use those instances as properties for PC
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        //composition eg 2
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        //Ceiling instance
        Ceiling ceiling = new Ceiling(30, 66);
        //bed instance
        Bed bed =  new Bed("Classic", 4, 3, 2, 1);
        //lamp instance
        Lamp lamp = new Lamp("Classic", false, 75);
        //Use those instances as peoprties of bedroom
        Bedroom bedRoom = new Bedroom("James", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();





    }
}
