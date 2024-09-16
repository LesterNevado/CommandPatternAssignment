public class Thermostat implements Device{
    @Override
    public void turnOn() {
        System.out.println("The Thermostat is Turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("The Thermostat is Turned Off!");
    }
    
    public void adjustTemperature() {
        System.out.println("Adjusting Temperature...");
    }
}
