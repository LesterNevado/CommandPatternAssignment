public class AdjustBrightness implements Command {
    private Lights lights;

    public AdjustBrightness(Lights lights) {
        this.lights = lights;
    }
    
    @Override
    public void execute() {
        lights.adjustBrightness();
    }
}