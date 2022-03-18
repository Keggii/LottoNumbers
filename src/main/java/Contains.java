import java.util.Objects;

public class Contains {
    public static boolean contains(String[] number, String value) {
        boolean contains = false;
        for (int i = 0; i < 7; i++) {
            if (Objects.equals(number[i], value)) {
                contains = true;
            }
        }
        return contains;
    }
}
