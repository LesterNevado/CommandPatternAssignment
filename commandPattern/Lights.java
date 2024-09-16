public class Lights implements Device{
    @Override
    public void turnOn() {
        System.out.println("The Lights are Switched On!");
    }

    @Override
    public void turnOff() {
        System.out.println("The Lights are Switched Off!");
    }

    public void adjustBrightness() {
        System.out.println("Brightness Adjusted!");
    }
}