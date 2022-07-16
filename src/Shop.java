public class Shop {

    public static final int SIMPLE_BEAR = 0;
    public static final int CRANKY_BEAR = 1;
    public static final int DRUNK_BEAR = 2;
    private String name;
    private int accumulator = 0;

    private int typeOfBear;

    public Shop(String name, int typeOfBear) {
        this.name = name;
        this.typeOfBear = typeOfBear;
        this.accumulator = 0;
    }

    public void createBear() {
        accumulator++;

        if (typeOfBear == SIMPLE_BEAR) {
            SimpleBear bear = new SimpleBear();
            return;
        }

        if (typeOfBear == CRANKY_BEAR) {
            CrankyBear bear = new CrankyBear();
            return;
        }

        if (typeOfBear == DRUNK_BEAR) {
            DrunkBear bear = new DrunkBear();
        }
    }

    public int getAccumulator() {
        return accumulator;
    }

    public String getName() {
        return name;
    }
}