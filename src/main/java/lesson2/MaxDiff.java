package lesson2;

import java.util.Scanner;

public class MaxDiff {

    static int getMaxDifference(int[] a) {
        int maxDiff = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int max = Math.max(a[i] - a[i+1], a[i+1] - a[i]);
            if (max > maxDiff) {
                maxDiff = max;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        // найти максимальное изменение высоты между соседями
        // 1 4 7 1 -> 6
        System.out.println(getMaxDifference(a));
    }
}
