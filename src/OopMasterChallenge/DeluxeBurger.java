package OopMasterChallenge;

public class DeluxeBurger extends Hamburger {
    private boolean drinks;
    private boolean chips;

    private double drinkPrice = 1.75;
    private double chipsPrice = 1.50;

    private int numAdditionItems = 2;
    private double priceOfAdditionalItems = drinkPrice + chipsPrice;

    public DeluxeBurger(String burgerName, String breadRollType, String meat, Double basePrice) {
        super(burgerName, breadRollType, meat, basePrice);
        this.drinks = true;
        this.chips = true;
    }

    @Override
    public void showTotalBalance() {
        String base = getBaseBurger() + "     " + df2.format(getBasePrice());
        String additional = getAdditionalItems();

        System.out.println(base);
        System.out.println(additional);

    }

    @Override
    public String getAdditionalItems() {
        String additionalitems = "**  " + "(" + numAdditionItems + ") " + (numAdditionItems > 1 ? "Additional items " : "Additional item ") + "\n"
                + (drinks ? "     drink " + df2.format(drinkPrice) : "") + "\n"
                + (chips ? "    chips " + df2.format(chipsPrice) : "") + "\n"

                + (priceOfAdditionalItems > 0 ? "                   total = " + df2.format(priceOfAdditionalItems + getBasePrice()) : "") + "\n";

        return additionalitems;
    }
}
