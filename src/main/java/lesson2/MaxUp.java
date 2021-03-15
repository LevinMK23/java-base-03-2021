package lesson2;

import java.util.Scanner;

public class MaxUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        // a[i+1] - a[i]
        // 0 1 6 1 7 8 3
        int maxUp = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = a[i + 1] - a[i];
            if (diff > maxUp) {
                maxUp = diff;
            }
        }
        System.out.println(maxUp);
    }
}
