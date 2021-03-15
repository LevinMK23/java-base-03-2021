package lesson2;

import java.util.Scanner;

public class BracketsWithLimit {
    // n - limit
    // ()(())((()))(((())))((((()))))((((....

    static void printBrackets(int n) {
        int cnt = 1;
        while (true) {
            for (int i = 0; i < cnt; i++) {
                System.out.print("(");
                n--;
                if (n == 0) {
                    return;
                }
            }
            for (int i = 0; i < cnt; i++) {
                System.out.print(")");
                n--;
                if (n == 0) {
                    return;
                }
            }
            cnt++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // n = 5
        printBrackets(n);
    }
}
