import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static String[] numbers() {
        Random rand = new Random();
        String[] number = new String[]{"0","0","0","0","0","0","0"};
        String[] numberEnd = new String[]{"0","0","0","0","0","0","0"};
        for (int i = 0; i < 6; i++) {
            number[i] = Integer.toString(rand.nextInt(48)+1);
            boolean contains = Contains.contains(numberEnd, number[i]);
            if (contains) {
                i -= 1;
            }
            numberEnd[i] = number[i];

        }
        number[6] = Integer.toString(rand.nextInt(10));
        return number;
    }
}
