public class CrankyBear extends Bear {

    private boolean canTalk = true;
    private boolean hasAlreadySung = false;

    public CrankyBear() {
        super();
    }

    @Override
    public void talk() {
        if (canTalk) {
            super.talk();
        }
    }

    @Override
    public void looseBattery() {
        super.looseBattery();
        if (getBattery() < 50) {
            canTalk = false;
            sing();
        }
    }

    private void sing() {
        if (hasAlreadySung) {
            return;
        }
        System.out.println("somebody to loveeee");
        hasAlreadySung = true;
    }
}
