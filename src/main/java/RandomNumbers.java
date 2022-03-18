import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static String[] numbers() {
        Random rand = new Random();
        String[] number = new String[]{"0","0","0","0","0","0","0"};
        number[0] = Integer.toString(rand.nextInt(7)+1);
        for (int i = 1; i < 7; i++) {
            number[i] = Integer.toString(rand.nextInt(7)+1);
            boolean contains = Contains.contains(number, number[i]);
            if (contains) {
                i -= 1;
            }

        }
        return number;
    }
}
