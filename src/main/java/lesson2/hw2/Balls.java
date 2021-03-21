package lesson2.hw2;

public class Balls {

    public static void main(String[] args) {

        int[] array = new int[6];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 1;
        array[4] = 2;
        array[5] = 3;


        System.out.println(checkBalance(array));
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void fisrtTask() {

        int[] array = new int[10];

        array[0] = 1;
        array[1] = 0;
        array[2] = 0;
        array[3] = 0;
        array[4] = 1;
        array[5] = 0;
        array[6] = 1;
        array[7] = 1;
        array[8] = 0;
        array[9] = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else if (array[i] == 1) array[i] = 0;
        }
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void secondTask() {
        int array[] = new int[8];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            System.out.println(array[i]);
            a += 3;
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void thirdTask() {
        int array[] = new int[12];

        array[0] = 1;
        array[1] = 5;
        array[2] = 3;
        array[3] = 2;
        array[4] = 11;
        array[5] = 4;
        array[6] = 5;
        array[7] = 2;
        array[8] = 4;
        array[9] = 8;
        array[10] = 9;
        array[11] = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
            System.out.println(array[i]);
        }

    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) 
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fourthTask() {
        int array[][] = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j) array[i][j] = 1;
            }
        }
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void fifthTask() {
        int array[] = new int[10];
        array[0] = 34;
        array[0] = 224;
        array[0] = 343524365;
        array[0] = 1;
        array[0] = 456;
        array[0] = 33;
        array[0] = -343;
        array[0] = -1;
        array[0] = 0;
        array[0] = -999999999;

        int min = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
                if (array[i] > max) max = array[i];
                if (array[i] < min) min = array[i];
            }
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance(int[] array) {
        int leftPart = 0;
        int rightPart = 0;
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                leftPart+=array[j];
                System.out.println("left " + array[j]);
                }
            for (int j = i+1; j < array.length; j++) {
                rightPart+=array[j];
                System.out.println("right " + array[j]);

            }
            System.out.println(leftPart +" "+ rightPart);
                if (leftPart == rightPart) {
                    result = true;
                    break;
                }
                else {
                    leftPart = 0;
                    rightPart = 0;
                    continue;
                }
            }
        return result;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
    // [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    static void printBalls(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i+n] = array[i];
        }
    }
}
