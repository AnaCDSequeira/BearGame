public class SimpleBear extends Bear {

    public SimpleBear() {
        super();
    }

    @Override
    public void talk() {
        if (getBattery() != 0) {
            super.talk();
        }
    }
}
