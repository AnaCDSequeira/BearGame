public class Util {

    private static final int MAX = 10;
    private static final int MIN = 1;

    public static int randomNumber() {
        return ((int) (Math.random() * (MAX - MIN + 1) + MIN));
    }


}

