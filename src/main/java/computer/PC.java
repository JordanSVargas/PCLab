package computer;

class PC {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;
    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo() {
        monitor.drawPixel(5, 5, "Green"); // Assuming x, y, and color parameters for drawPixel method
    }
    public void description() {
        System.out.println("Welcome to worst buy! Below is the description of the PC on sale today:");
        System.out.println(theCase);
        System.out.println(monitor);
        System.out.println(motherboard);
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        theCase.pressPowerButton();
        motherboard.loadProgram("Photoshop");
    }
    @Override
    public String toString() {
        return "PC - Case: " + theCase + ", Monitor: " + monitor + ", Motherboard: " + motherboard;
    }
}