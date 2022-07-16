public class Main {

    private static final int NUMBER_OF_BEARS_TO_WIN = 10;
    public static void main(String[] args) {

        Shop shop1 = new Shop("Shop 1", Shop.SIMPLE_BEAR);
        Shop shop2 = new Shop("Shop 2", Shop.CRANKY_BEAR);
        Shop shop3 = new Shop("Shop 3", Shop.DRUNK_BEAR);

        Shop[] shops = { shop1, shop2, shop3 };

        while (shop1.getAccumulator() < NUMBER_OF_BEARS_TO_WIN &&
                shop2.getAccumulator() < NUMBER_OF_BEARS_TO_WIN &&
                shop3.getAccumulator() < NUMBER_OF_BEARS_TO_WIN) {

            int randomNumber = Util.randomNumber();

            if (randomNumber % 2 == 0) {
                shop1.createBear();
            } else if (randomNumber % 5 == 0) {
                shop2.createBear();
            } else {
                shop3.createBear();
            }
        }
        for (Shop shop : shops) {
            if (shop.getAccumulator() >= 10) {
                System.out.println("Quem fez mais ursos foi: " + shop.getName());
            }
        }
    }
}