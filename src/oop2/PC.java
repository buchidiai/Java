package oop2;

public class PC {
    private Case theCase; //used Case class for composition purpose
    private Monitor monitor; //used Monitor class for composition purpose
    private Motherboard motherboard; //used Motherboard class for composition purpose

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "pink");
    }


}