package lesson6.animals;

public class AnimalTest {

    static void process(Animal animal) {
        System.out.print(animal.getClass() + ": ");
        animal.say();
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.say();

        Animal animal = new Cow();
        animal.say();

        process(new Cow());
        process(new Cat());
        // Cat cat1 = new Animal();
        // анонимный внутренний класс (абстрактные классы или интерфейсы)
        Animal dog = new Animal() {
            @Override
            public void say() {
                System.out.println("WOW WOW");
            }
        };
        process(dog);
    }
}
