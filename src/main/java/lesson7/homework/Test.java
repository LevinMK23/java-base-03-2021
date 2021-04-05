package lesson7.homework;

public class Test {
    public static void main(String[] args) {

        Plate plate = new Plate(30);
        Cat[] cats = new Cat[5];
        for (int i = 0; i < 5; i++) {
            cats[i] = new Cat("Cat" + (i + 1), 10 + (int) (Math.random() * 30));
        }

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        plate.addFood(50);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

    }
}
