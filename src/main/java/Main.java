import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String badInput = sc.nextLine();
        String[] input = badInput.split(" ");
        String[] numbers = RandomNumbers.numbers();
        Logic.comparison(numbers, input);
        System.out.println("your numbers: " + Arrays.toString(input));
        System.out.println("the lotto numbers: " + Arrays.toString(numbers));
    }
}
