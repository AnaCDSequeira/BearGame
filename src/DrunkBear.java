public class DrunkBear extends Bear {

    private boolean canTalk = true;

    public DrunkBear() {
        super();
    }

    @Override
    public void talk() {
        if (canTalk) {
            super.talk();
        } else {
            snor();
        }
    }

    @Override
    public void looseBattery() {
        super.looseBattery();
        fallingAsleep();
    }

    private void snor() {
        System.out.println("snooooooooor");
    }

    public void fallingAsleep() {
        int probability = (int) (Math.random() * 5);
        if (probability == 2) {
            canTalk = false;
        }
    }
}
