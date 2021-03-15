package lesson2;

public class ArraysExamples {

    static int getRandom(int from, int to) {
        return (int) (from + Math.random() * (to - from));
    }

    static int getRandom(int limit) {
        return (int) (Math.random() * limit);
    }

    static void print(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int aa = 3, b = 4, c = 5, d = 6;
        // а вдруг мне понадобится 10 или 100 переменных
        int[] a = new int[10];
        // _ _ _ _ _ _ _ _ _ _
        // 0 1 2 3 4 5 6 7 8 9
        //       a[4]
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Math.random() // (0; 1) 0.89136983165
        for (int i = 0; i < a.length; i++) {
            a[i] = getRandom(11, 100);
        }
        print(a);


    }
}
