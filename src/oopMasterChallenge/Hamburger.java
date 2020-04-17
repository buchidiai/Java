package oopMasterChallenge;

import java.text.DecimalFormat;

public class Hamburger {
    public static DecimalFormat df2 = new DecimalFormat("$#,##0.00");
    private String burgerName;
    private String breadRollType;
    private String meat;

    private boolean cheese = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean mushroom = false;

    private double cheesePrice = 0.70;
    private double lettucePrice = 0.40;
    private double tomatoPrice = 0.50;
    private double mushroomPrice = 0.55;


    private double basePrice;
    private int numAdditionItems;
    private double priceOfAdditionalItems;

    public Hamburger(String burgerName, String breadRollType, String meat, double basePrice) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;

    }


    public void showTotalBalance() {
        //an addition item was added
        if (numAdditionItems > 0) {
            String base = this.getBaseBurger() + "     " + df2.format(this.basePrice);
            String additional = this.getAdditionalItems();

            System.out.println(base);
            System.out.println(additional);
        } else {
            String base = this.getBaseBurger() + "     " + df2.format(this.basePrice);
            System.out.println(base);
            String baseTotal = "                   total = " + df2.format(basePrice);
            System.out.println(baseTotal);

        }


    }

    public void addAdditionalItems(String item) {
        switch (item) {
            case "cheese":
                this.setCheese(true);

                break;
            case "lettuce":
                this.setLettuce(true);
                break;
            case "tomato":
                this.setTomato(true);
                break;
            case "mushroom":
                this.setMushroom(true);
                break;
            default:
                System.out.println("item not available for adding");

        }


    }

    public String getAdditionalItems() {
        String additionalitems = "**  " + "(" + numAdditionItems + ") " + (numAdditionItems > 1 ? "Additional items " : "Additional item ") + "\n"
                + (cheese ? "     cheese " + df2.format(cheesePrice) : "") + "\n"
                + (lettuce ? "    lettuce " + df2.format(lettucePrice) : "") + "\n"
                + (tomato ? "     tomato " + df2.format(tomatoPrice) : "") + "\n"
                + (mushroom ? "     mushroom " + df2.format(mushroomPrice) : "") + "\n"
                + (priceOfAdditionalItems > 0 ? "                   total = " + df2.format(priceOfAdditionalItems + basePrice) : "") + "\n";

        return additionalitems;
    }


    public String getBaseBurger() {
        return "- " + this.burgerName + " " + getClass().getSimpleName() + " on " + this.breadRollType + " bread" + " with " + this.meat;
    }


    public void setCheese(Boolean cheese) {
        this.cheese = cheese;
        this.numAdditionItems++;
        this.priceOfAdditionalItems += cheesePrice;



    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        this.numAdditionItems++;
        this.priceOfAdditionalItems += lettucePrice;

    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        this.numAdditionItems++;
        this.priceOfAdditionalItems += tomatoPrice;

    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
        this.numAdditionItems++;
        this.priceOfAdditionalItems += mushroomPrice;

    }

    public double getBasePrice() {
        return basePrice;
    }
}
