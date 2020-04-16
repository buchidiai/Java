package encapsulation;

public class Main {

    public static void main(String[] args) {
//        //eg of bad encapsulation
//	    Player player = new Player();
////        player.name = "Jose";
//        player.health = 20;
//        player.weapon = "Knife";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        //e.g proper way to use encapsulation to hide direct access to fields
//        EnhancedPlayer player1 = new EnhancedPlayer("Tim", 200, "Sword");
//        System.out.println("Initial health is " + player1.getHealth());


        //encapsulation challenge
        Printer printer = new Printer(40,true);
        System.out.println("intial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(10);
        System.out.println("pages printed was "+ pagesPrinted + " new total print count for printer = "+ printer.getPagesPrinted());

        pagesPrinted = printer.printPages(5);
        System.out.println("pages printed was "+ pagesPrinted + " new total print count for printer = "+ printer.getPagesPrinted());

    }
}
