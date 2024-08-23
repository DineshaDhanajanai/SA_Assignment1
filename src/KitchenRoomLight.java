public class KitchenRoomLight implements Light {

    private int brightness;

    private String location = "Kitchen Room Light";

    @Override
    public void on() {
        brightness = 100;
        System.out.println(location + " is ON at full brightnes.");
    }

    @Override
    public void off() {
        brightness = 100;
        System.out.println(location + " is OFF." );

    }

    @Override
    public void dim(int level) {
        System.out.println(location+ " dimmed to "+level+"%.");
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

}
