public class Shop {

    private final String[] shops = new String[8];
    private String name;
    private int accumulator;
    private int max = 0;
    private int min = 0;
    private final int SIMPLE_BEAR = 0;
    private final int CRANCKY_BEAR = 1;
    private final int DRUNK_BEAR = 2;

    public Shop() {
        for (int i = 0; i < shops.length; i++) {
            if (shops[i] != null) {
                break;
            }
            shops[i] = "Shop " + i;
            this.name = name;
            this.accumulator = 0;
            max += 10;
            return;
        }
        System.out.println("The maximum number of shops was reached.");
    }

    public void bearGenerator() {
        pickShop();
        typeOfBear();
        //URSO
    }

    public int typeOfBear() {
        if (randomNumber() % 2 == 0) {
            return SIMPLE_BEAR;
        }
        if (randomNumber() % 5 == 0) {
            return CRANCKY_BEAR;
        }
        return DRUNK_BEAR;
    }

    private int randomNumber() {
        return ((int) (Math.random() * (max - min + 1) - min));
    }


    private int pickShop() {
        if (shops[0] == null) {
            System.out.println("There is no shop here. Go find one!");
            return -1;
        }
        int temp = 10;
        for (int i = 0; i < shops.length; i++) {
            if ((randomNumber()) < temp) {
                return i;
            }
            temp += 10;
        }
       return -1;
    }
}
