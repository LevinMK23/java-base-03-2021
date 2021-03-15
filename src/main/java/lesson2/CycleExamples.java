package lesson2;

public class CycleExamples {

    public static void main(String[] args) {
        int n = 1;
        // вывести все числа от 1 до n
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // вывести первые 10 степеней 2
        for(int pow = 1, cnt = 0; cnt <= 10; pow *= 2, cnt++) {
            System.out.print(pow + " ");
        }

        System.out.println();
        int cnt = 0, pow = 1;
        // количество повторений = итерации
        while (cnt <= 10) {
            System.out.print(pow + " ");
            cnt++;
            pow *= 2;
        }
        System.out.println();

        n = 0;
        do {
            System.out.println(n);
        } while (n != 0);

        while (n != 0) {
            System.out.println(n);
        }

        // напечатать таблицу умножения от 1 до 9
        // iter = 9 * 9
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        // break, continue

        for (int i = 0; i < 100; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        pow = 1;

        while (true) {
            System.out.println(pow);
            pow *= 2;
            if (pow > 512) {
                break;
            }
        }
        // methods, if, switch, for, while, do

        // ввести n = 5, вывести ()(())((()))(((())))((((()))))

    }
}
