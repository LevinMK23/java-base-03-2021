package lesson2;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // n = 5
        // 1 2 3 4 5
        for (int i = 1; i <= n; i++) {
            // 1, 2, 3
            for (int j = 0; j < i; j++) {
                System.out.print("(");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(")");
            }
        }
        System.out.println();
    }
}
