package OopMasterChallenge;

public class HealthyBurger extends Hamburger {
    private boolean spinach = false;
    private boolean kale = false;

    private double spinachPrice = 0.90;
    private double kalePrice = 0.40;

    private int numAdditionItems;
    private double priceOfAdditionalItems;

    public HealthyBurger( String meat, Double basePrice) {
        super("King Tasty", "Ciabatta", meat, basePrice);
    }

    @Override
    public void showTotalBalance() {
        //an addition item was added
        if (numAdditionItems > 0) {
            String base = getBaseBurger() + "     " + df2.format(getBasePrice());
            String additional = getAdditionalItems();

            System.out.println(base);
            System.out.println(additional);
        } else {
            String base = getBaseBurger() + "     " + df2.format(getBasePrice());
            System.out.println(base);
            String baseTotal = "                   total = " + df2.format(getBasePrice());
            System.out.println(baseTotal);

        }
    }

    @Override
    public String getAdditionalItems() {
        String additionalitems = "**  " + "(" + numAdditionItems + ") " + (numAdditionItems > 1 ? "Additional items " : "Additional item ") + "\n"
                + (spinach ? "     spinach " + df2.format(spinachPrice) : "") + "\n"
                + (kale ? "    kale " + df2.format(kalePrice) : "") + "\n"
                + (priceOfAdditionalItems > 0 ? "                   total = " + df2.format(priceOfAdditionalItems + getBasePrice()) : "") + "\n";

        return additionalitems;
    }

    @Override
    public void addAdditionalItems(String item) {
        switch (item) {
            case "spinach":
                this.setSpinach(true);
                break;
            case "kale":
                this.setKale(true);
                break;
            default:
                System.out.println("item not available for adding");

        }
    }


    private void setSpinach(boolean spinach) {
        this.spinach = spinach;
        this.numAdditionItems++;
        this.priceOfAdditionalItems += spinachPrice;

    }

    private void setKale(boolean kale) {
        this.kale = kale;
        this.numAdditionItems++;
        this.priceOfAdditionalItems += kalePrice;
    }
}
