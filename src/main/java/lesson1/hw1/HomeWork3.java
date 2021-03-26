package lesson1.hw1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        // Написать программу, которая загадывает случайное число от 0 до 9
        // и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить,
        // больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        guessTheNumber();
    }

    static void guessTheNumber() {
        Scanner in = new Scanner(System.in);
        int random = (int)(Math.random() * 10);
        System.out.println("Компьютер загадал число от 0 до 9, попробуйте его отгадать");

        for (int counter = 0; counter <= 3; counter++) {
            if (counter == 3) {
                System.out.println("Вы проиграли.");
                break;
            }
            System.out.println("Введите ваш вариант (количество доступных попыток: " + (3 - counter) +")");
            int answer = in.nextInt();
            if (answer == random) {
                System.out.println("Ответ верный, вы выиграли!");
                break;
            } else if (answer < random) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }

        System.out.println("Хотите сыграть ещё раз?\n 1 – да / 0 – нет");
        int wish = in.nextInt();
        if (wish == 1) {
            guessTheNumber();
        } else {
            System.out.println("Хорошего дня, спасибо за игру!");
        }
    }
}
