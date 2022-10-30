public class Smartphone implements Device{
    private final String name;

    public Smartphone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        System.out.println("Device turned off");
    }

    @Override
    public void turnOff() {
        System.out.println("Device turned off");
    }
}
