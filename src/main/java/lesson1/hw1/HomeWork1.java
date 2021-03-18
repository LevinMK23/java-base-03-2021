package lesson1.hw1;

import java.util.GregorianCalendar;

public class HomeWork1 {

    public static void main(String[] args) {


    }

    //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    public static float calculate(float a,float b,float c,float d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два целых числа и проверяющий, что
    // их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean calculate(int a, int b) {
        if (a+b>10 && a+b<20) return true;
        else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void calculate(int a) {
        if (a>=0) System.out.println("Число " + a + " положительное");
        else if (a<0) System.out.println("Число " + a + " отрицательное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean calculation(int a) {
        return -a>0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void hello(String username) {
        System.out.println("Привет, " + username +"!");
    }

    //8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean year(int year) {
        boolean isLeap = new GregorianCalendar().isLeapYear(year);
        return isLeap;
    }

}
