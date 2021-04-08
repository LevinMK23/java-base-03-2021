package lesson1.hw1;

public class HomeWork7 {

    public static void main(String[] args) {
        // 1. Расширить задачу про котов и тарелки с едой.
        // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
        // 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
        // 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
        // 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

        Cat[] Cats = new Cat[5];
        Cats[0] = new Cat("Барсик", 15, false);
        Cats[1] = new Cat("Булка", 11, false);
        Cats[2] = new Cat("Чешир", 13, false);
        Cats[3] = new Cat("Вафля", 25, false);
        Cats[4] = new Cat("Зефир", 19, false);

        Plate plate = new Plate(50);

        plate.info();
        System.out.println();

        for (int i = 0; i < Cats.length; i++) {
            Cats[i].checkSatiety();
        }
        System.out.println();

        for (int i = 0; i < Cats.length; i++) {
            if (plate.checkFood(Cats[i].getAppetite())) {
                Cats[i].eat(plate);
                System.out.println(Cats[i].getName() + " поел и теперь сыт.");
                plate.info();
            } else {
                Cats[i].setSatiety(false);
                System.out.println("Котик " + Cats[i].getName() + " не смог поесть, потому что в миске недостаточно еды :(");
                plate.info();
                plate.addFood();
                Cats[i].eat(plate);
                System.out.println(Cats[i].getName() + " поел и теперь сыт.");
                plate.info();
            }
        }
        System.out.println();

        for (int i = 0; i < Cats.length; i++) {
            Cats[i].checkSatiety();
        }


    }
}
