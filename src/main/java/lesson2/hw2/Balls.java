package lesson2.hw2;

import java.util.Arrays;

public class Balls {

    // 1 2 2 3 3 3 2 2 1 1 4 5 6
    // 1 2 2 2 2 1 1 4 5 6
    // 1 1 1 4 5 6
    // 4 5 6

    static void printBalls(int[] array) {

        // 1 2 2 3 3 3 2 2 1 1 4 5 6 -> 4 5 6
        if (needProcess(array)) {
            printBalls(processArray(array));
        } else {
            System.out.println(Arrays.toString(array));
        }
    }

    static int[] processArray(int[] array) {
        int left = 0, right = 0, cnt = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                cnt++;
            } else {
                // 0 0 1 1 2 2 2 3 4
                if (cnt > 2) {
                    right = i + 1;
                    left = i - cnt + 1;
                    int[] temp = new int[array.length - cnt];
                    for (int j = 0; j <= left; j++) {
                        temp[j] = array[j];
                    }
                    for (int j = right; j < array.length; j++) {
                        temp[j - cnt] = array[j];
                    }
                    return temp;
                } else {
                    cnt = 1;
                }
            }
        }
        return null;
    }

    static boolean needProcess(int[] array) {
        int cnt = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                cnt++;
                if (cnt >= 3) {
                    return true;
                }
            } else {
                cnt = 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        printBalls(new int[]{1, 1, 2, 2, 3, 3, 3, 2, 2, 1, 2, 3, 1, 1, 1, 3, 3, 3, 5});
    }
}
