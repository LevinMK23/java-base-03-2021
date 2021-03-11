package lesson1;

public class Arithmetic {

    public static void main(String[] args) {
        // + - * / %
        int a = 5, b = 3; // 5 / 2 = 2 1 / 2
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println((double) a / b); // cast

        int c = 3;
        c++;
        System.out.println(++c);
        System.out.println(c);
        c--;
        System.out.println(c);

        c = 5;
        c = c++ + ++c; // 5 + (6) 7
        System.out.println(c);

        long l = 5;
        int i = 4;
        i = (int) l;
        l = i;

        byte b1 = (byte) 130;
        // 127 -> 128 = -128, 129 = -127, 130 = -126
        System.out.println(b1);
    }
}
