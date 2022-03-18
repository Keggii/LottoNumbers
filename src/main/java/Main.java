import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] numbers = RandomNumbers.numbers();
        System.out.println(Arrays.toString(numbers));
    }
}
