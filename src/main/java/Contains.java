import java.util.Objects;

public class Contains {
    public static boolean contains(String[] number, String value) {
        boolean contains = false;
        for (int i = 0; i < 6; i++) {
            if (Integer.parseInt(number[i]) == Integer.parseInt(value)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
