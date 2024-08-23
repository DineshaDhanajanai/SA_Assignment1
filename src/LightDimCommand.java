public class LightDimCommand implements Command{

    private Light light;
    private int newLevel;
    private int oldLevel;
    public LightDimCommand(Light light, int newBrightness) {

        this.light = light;
        this.newLevel = newBrightness;
    }

    @Override
    public void execute() {

        oldLevel = light.getBrightness();
        light.dim(newLevel);

    }

    @Override
    public void undo() {

        light.dim(oldLevel);

    }
}
