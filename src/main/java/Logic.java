public class Logic {
    public static void comparison (String[] number, String[] input) {
        for (int i = 0; i < 7; i++) {
            boolean win = false;
            for (int j = 0; j < 7; j++) {
                if(Integer.parseInt(number[j]) == Integer.parseInt(input[i])) {
                    win = true;
                }
            }
            if(win) System.out.println("You guessed right with " + number[i]);
            else System.out.println("You guessed wrong with " + number[i]);
        }
    }
}
