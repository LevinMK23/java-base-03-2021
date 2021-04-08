package lesson1.homework1;

import java.util.Scanner;

public class HomeWork1 {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte byteVar = 9;
        short shortVar = 900;
        int intVar = 900_000_000;
        long longVar = 900_000_000_000L;
        float floatVar = 0.9f;
        double doubleVar = 0.9;
        boolean booleanVar = true;
        char charVal = 'Q';
        String stringVar = "Home";

        // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.
        Scanner in = new Scanner(System.in);
        System.out.println("\nДобро пожаловать в программу, вычисляющую результат выражения a * (b + (c / d))");
        System.out.println("Введите число а");
        float a = in.nextInt();
        System.out.println("Введите число b");
        float b = in.nextInt();
        System.out.println("Введите число c");
        float c = in.nextInt();
        System.out.println("Введите число d");
        float d = in.nextInt();
        System.out.println(calculate(a, b, c, d));

        // 4. Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true,
        // в противном случае – false.
        System.out.println("\nЛежит ли сумма чисел в пределах от 10 до 20 включительно?");
        System.out.println("Введите первое число:");
        int one = in.nextInt();
        System.out.println("Введите второе:");
        int two = in.nextInt();
        System.out.println("Результат:");
        System.out.println(isBetween(one, two));

        //5. Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.
        System.out.println("\nПроверка: положительное или отрицательное число введено");
        System.out.println("Введите число:");
        long positiveNumber = in.nextInt();
        isPositive(positiveNumber);

        //6. Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное,
        // и вернуть false если положительное.
        System.out.println("\nОтрицательное ли число?");
        System.out.println("Введите число");
        long negativeNumber = in.nextInt();
        System.out.println("Результат:");
        System.out.println(isNegative(negativeNumber));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        String name = "Витинари";
        hello(name);

        //8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("\nЯвляется ли год високосным?");
        System.out.println("Введите год");
        int year = in.nextInt();
        isLeapYear(year);
    }

    static int calculate(float a, float b, float c, float d) {
        System.out.println("Результат вычисления:");
        return (int) (a * (b + (c / d)));
    }

    static boolean isBetween(int one, int two) {
        int sum = one + two;
        return sum >= 10 && sum <= 20;
    }

    private static void isPositive(long positiveNumber) {
        if (positiveNumber >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean isNegative (long negativeNumber) {
        return negativeNumber < 0;
    }

    private static void hello(String name) {
        System.out.println("\nПривет, " + name + "!");
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if((year % 100 == 0)&&(year % 400 != 0)){
                System.out.println("Год не високосный");
            } else {
                System.out.println("Год високосный");
            }
        } else if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
