import oop1.Gwagon;

public class Main {

    public static void main(String[] args) {

//        Car benz = new Car();
//        benz.setModel("s500");
//
//        BankAccount customer1 = new BankAccount();
//        customer1.depositFunds(59303);
//        customer1.withdrawFunds(34043);
//
//        VipCustomer vip1 = new VipCustomer();
//        System.out.println(vip1.getName());
//
//        VipCustomer vip2 = new VipCustomer("chris", 30000);
//        System.out.println(vip2.getName());
//
//        VipCustomer vip3 = new VipCustomer("Jones", 30000, "Jones@gmail.com");
//        System.out.println(vip3.getName());
//
//
//
//        Animal animal = new Animal("Lion", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
//        dog.walk();
//        dog.run();
//        dog.eat();
//
//
//        Fish koi = new Fish("donald", 3,2,6,2,4);
//
//        koi.swim(50);


        Gwagon gwagon = new Gwagon(90);
        gwagon.steer(65);
        gwagon.accelerate(30);
        gwagon.accelerate(100);



    }
}
