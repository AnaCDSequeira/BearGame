public class Bear {
    private int battery;

    public Bear() {
        this.battery = 100;
    }

    public void talk() {
        System.out.println("I love you!");
        looseBattery();
    }

    public void looseBattery() {
        battery--;
    }

    public int getBattery() {
        return battery;
    }
}
