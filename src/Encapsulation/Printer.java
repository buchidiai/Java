package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillUpToner(int amount) {

        if (amount > 0 && amount <= 100) {
            if (this.tonerLevel + amount > 100) {
                return -1;
            } else {
                return this.tonerLevel += amount;
            }
        } else {
            return -1;
        }


    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplexPrinter) {
            pagesToPrint =(pages/2)+ (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
