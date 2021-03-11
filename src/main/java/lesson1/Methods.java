package lesson1;

import java.util.Scanner;

// условия и методы
public class Methods {

    static void showValue(int value) {
        // если параметр велью больше нуля вывести Положительное
        // иначе если параметр равен нулю вывести Ноль
        // иначе вывести Отрицательное
        if (value > 0) {
            System.out.println("Положительное");
        } else if (value == 0) {
            System.out.println("Ноль");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean isPositive(int value) {
        return value > 0;
    }

    static int sumOrSub(int a, int b) {
        // если а больше б вернуть сумму а и б
        // иначе вернуть разность а и б

        // тернарный оператор condition ? trueAction : falseAction

        return a > b ? a + b : a - b;
    }

    static void showAsText(int digit) {
        // Получили 1 выводим на экран Один
        // 2 - Два
        switch (digit) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }
    }

    static boolean isBetween(int x) {
        // определить принадлежит ли Х интервалу от 0 до 10

        // Если Х больше или равен 0 и при этом меньше или равен 10

        return x >= 0 && x <= 10;
    }


    //[1; 5] | [10; 15]
    static boolean isInInterval(int x) {
        return (x >= 1 && x <= 5) || (x >= 10 && x <= 15);
    }

    static long foo(int a, int b, int c) {
        return a + b + c;
    }

    static int foo1(long a, int b, int c) {
        return (int) (a + b + c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int value = in.nextInt(), v2 = in.nextInt();
        showValue(value);
        System.out.println(isPositive(value));
        showAsText(value);
        System.out.println(sumOrSub(value, v2));
    }
}
