package lesson1;

/**
 * Первый класс курса Джава базовый
 * */
public class MyFirstClass {

    /**
     * @param args - аргументы командной строки
     * */
    public static void main(String[] args) {
        // напечатать на экране текст Hello world!
        System.out.println("Hello world!");
        // input -> algorithm -> output
        // числа (целые и дробные), символы, строки
        byte byteValue = 15; // 1b 256 -> [-128; 127]
        short shortValue = 10000; // 2b 2 ^ 16 [-2^15; 2^15 - 1]
        int intValue = 2_000_000_000; // 4b 2 ^ 32
        long longValue = 1_000_000_000_000L; // 8b 2 ^ 64 -> 10 ^ 19

        // 1124251 * 10 ^ 5 5 25
        float floatValue = 0.5f; // 4b 2 ^ 25 * 10 ^ (2 ^ 5) 8 digits
        double doubleValue = 0.5; // 8b 16 digits

        System.out.println(1 / 3f);
        System.out.println(1 / 3.);

        boolean booleanValue = true; // false

        char charValue = '\'';

        String hello = "Hello ";
        String world = "world!";

        System.out.println(hello + world);
    }
}
