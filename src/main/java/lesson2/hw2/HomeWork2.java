package lesson2.hw2;

public class HomeWork2 {

    public static void main(String[] args) {
        String n = "\n\n";

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] binArray = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("\nЗадание 1:");
        arrReverb(binArray);

        //2. Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] three = new int[8];
        System.out.println(n + "Задание 2:");
        threeSteps(three);

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        //пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] someArray = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(n + "Задание 3:");
        multiplication(someArray);

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] square = new int[7][7];
        System.out.println(n + "Задание 4:");
        diagonal(square);

        //5. ** Задать одномерный массив
        // и найти в нем минимальный и максимальный элементы
        // (без помощи интернета);
        int[] arrMinMax = new int[] {10, 20, 35, 12, 35, 16, 74, 23, 1, 3, 45};
        System.out.println(n + "Задание 5:");
        minMax(arrMinMax);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место,
        // в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        int[] balance = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(n + "Задание 6:");
        System.out.println(checkBalance(balance));

        //7 и задачу Balls решить не смогла

    }

    static void arrReverb(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                a[i] = 0;
                System.out.print(a[i] + " ");
            } else {
                a[i] = 1;
                System.out.print(a[i] + " ");
            }
        }
    }

    static void threeSteps(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = 0;
                System.out.print(a[i] + " ");
            } else {
                a[i] = a[i - 1] + 3;
                System.out.print(a[i] + " ");
            }
        }
    }

    static void multiplication(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }

    static void diagonal(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                    System.out.print(a[i][j] + " ");
                } else {
                    a[i][j] = 0;
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void minMax(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("Максимальный элемент: " + max + "\n" + "Минимальный элемент: " + min + "\n");
    }

    static boolean checkBalance(int[] a){
        int leftSum = 0;
        int rightSum = 0;
        boolean isBalance = false;

        for (int i = 0; i < a.length; i++) {
            rightSum = rightSum + a[i];
        }

        for (int i = 0; i < a.length; i++) {
            leftSum = leftSum + a[i];
            rightSum = rightSum - a[i];

            if (leftSum == rightSum) {
               isBalance = true;
            }
        }

        return isBalance;
    }

}
