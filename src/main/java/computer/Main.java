package computer;

public class Main {
    public static void main(String[] args) {
        Dimensions caseDimensions = new Dimensions(20, 15, 7);
        Case theCase = new Case("AlienWare", "Dell", "500W", caseDimensions);
        Resolution monitorResolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor(monitorResolution, "ModelX", "Dell");
        Motherboard motherboard = new Motherboard("Alien11", "Dell", 4, 2, "Version 1.0");
        PC myPC = new PC(theCase, motherboard, monitor);
        myPC.description();
        myPC.powerUp();
    }
}