package lesson3;

import java.util.Scanner;

public class RLECompressor {


    public static void main(String[] args) {
       // aaaaaaaaaaaabbbbbccccccd -> 12(a)5(b)6(c)d
        Scanner in = new Scanner(System.in);
        System.out.println("Input string for compress");
        String s = in.next();
        char[] a = s.toCharArray();
        int cnt = 1;
        String result = "";
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                cnt++;
                if (i == a.length - 2) {
                    result += cnt + "(" + a[i] + ")";
                }
            } else {
                if (cnt > 1) {
                    result += cnt + "(" + a[i] + ")";
                    if (i == a.length - 2) {
                        result += a[i + 1];
                    }
                } else {
                    result += a[i];
                    if (i == a.length - 2) {
                        result += a[i + 1];
                    }
                }
                cnt = 1;
            }
        }
        System.out.println("Compressed string: " + result);
    }

}
