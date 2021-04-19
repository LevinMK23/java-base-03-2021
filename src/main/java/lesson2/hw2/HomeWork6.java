package lesson2.hw2;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        cat1.run(30);
        cat1.swim(20);

        Cat cat2 = new Cat("Матроскин");
        cat2.run(210);
        cat2.swim(10);

        Dog dog1 = new Dog("Дружок");
        dog1.run(600);
        dog1.swim(3);

        Dog dog2 = new Dog("Шарик");
        dog2.run(200);
        dog2.swim(30);
    }
}