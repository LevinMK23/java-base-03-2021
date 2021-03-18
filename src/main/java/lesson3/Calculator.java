package lesson3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Приложение калькулятор");
        System.out.println("1 - сумма двух чисел");
        System.out.println("2 - разность двух чисел");
        System.out.println("0 - выход из приложения");
        while (true) {
            System.out.println("Введите команду:");
            String command = in.next();
            int a, b;
            switch (command) {
                case "1":
                    System.out.println("Введите два числа:");
                    a = in.nextInt();
                    b = in.nextInt();
                    int sum = a + b;
                    System.out.println(a + " + " + b + " = " + sum);
                    break;
                case "2":
                    System.out.println("Введите два числа:");
                    a = in.nextInt();
                    b = in.nextInt();
                    int sub = a - b;
                    System.out.println(a + " - " + b + " = " + sub);
                    break;
                case "0":
                    System.out.println("Программа завершена");
                    return;
            }
        }
    }
}
