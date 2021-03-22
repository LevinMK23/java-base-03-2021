package lesson3.hw;

import java.util.Arrays;
import java.util.Scanner;

public class WordsGame {

    private static final String[] words = {"apple", "orange", "lemon", "banana",
            "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak",
            "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    // random array index
    private static int getRandomIndex() {
        return (int) (Math.random() * words.length);
    }

    private static void run(Scanner in) {
        String guess = words[getRandomIndex()];
        char[] c = new char[15];
        Arrays.fill(c, '#');
        System.out.println("You in the game: Guess the word");
        while (true) {
            System.out.println("Input word");
            String word = in.next();
            if (word.equals(guess)) {
                System.out.println("Congratulations! It's really: " + word);
                System.out.println("New game: any key");
                System.out.println("Exit: q");
                System.out.println("Input key");
                String input = in.next();
                if (input.equals("q")) {
                    System.out.println("Good buy");
                } else {
                    run(in);
                }
                return;
            } else {
                int limit = Math.min(guess.length(), word.length());
                for (int i = 0; i < limit; i++) {
                    if (guess.charAt(i) == word.charAt(i)) {
                        c[i] = guess.charAt(i);
                    }
                }
                for (char symbol : c) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        run(in);
    }

}
