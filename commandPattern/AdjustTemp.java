public class AdjustTemp implements Command {
    private Thermostat thermostat;

    public AdjustTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.adjustTemperature();
    }
}
